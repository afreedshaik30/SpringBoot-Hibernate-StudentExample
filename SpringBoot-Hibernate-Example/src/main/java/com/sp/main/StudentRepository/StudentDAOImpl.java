package com.sp.main.StudentRepository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.sp.main.config.HibernateConfig;
import com.sp.main.model.Student;

@Repository
public class StudentDAOImpl implements StudentDAO {
//1.
	@Override
	public void addStudent(Student student) {
		Session session = HibernateConfig.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		try 
		{
			session.save(student);
			transaction.commit();
			System.out.println("1.ADDED");

		} 
		catch (Exception e) 
		{
			transaction.rollback();
			System.out.println("1.failed");
			e.printStackTrace();
		}
	}
//2.
	@Override
	public Student readStudent(long rno) {
		Session session = HibernateConfig.getSessionFactory().openSession();
		Student stu = session.get(Student.class, rno);
			if( stu != null)
			{
				System.out.println("2.Student FOUND");
				System.out.println("student by id -----> "+stu);
			}
			else
			{
				System.out.println("2.NOT FOUND");
			}
		return stu;
	}
//3.
	@Override
	public void editStudent(Student student) 
	{
		Session session = HibernateConfig.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		Student stu = null;
		try 
		{   // get student by ID
			stu = session.get(Student.class, student.getRno());
			// if student exists update sname,gpa
			if (stu != null) 
			{
				stu.setSname(student.getSname());
				stu.setGpa(student.getGpa());

				session.saveOrUpdate(stu);
				transaction.commit();
				System.out.println("3.EDITED");
			}
		} 
		catch (Exception e) 
		{
			transaction.rollback();
			System.out.println("3.failed ");
			e.printStackTrace();
		}
	}
//4.
	@Override
	public void deleteStudent(long rno) {
		Session session = HibernateConfig.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		// get student by ID
		Student stu = session.get(Student.class, rno);
		// if student exists delete
		if (stu != null) 
		{
			session.delete(stu);
			transaction.commit();
			System.out.println("4.Deleted");
		} 
		else 
		{
			transaction.rollback();
			System.out.println("4.failed");
		}
	}
//5.
	@Override
	public List<Student> readAllStudents() {
		
		Session session = HibernateConfig.getSessionFactory().openSession();
		Transaction transaction =session.beginTransaction();
		List<Student> allStudents = null;
		
		try 
		{
			allStudents = session.createQuery("FROM Student", Student.class).list();
		}
		catch(Exception e)
		{
			transaction.rollback();	
			e.printStackTrace();
		}
		return allStudents;
	}
}
