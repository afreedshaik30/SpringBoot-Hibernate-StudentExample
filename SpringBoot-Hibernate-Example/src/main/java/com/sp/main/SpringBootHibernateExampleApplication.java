package com.sp.main;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sp.main.StudentRepository.StudentDAO;
import com.sp.main.model.Student;

@SpringBootApplication
public class SpringBootHibernateExampleApplication {

	public static void main(String[] args) {
    // Run the Spring Boot application and get the application context
        ConfigurableApplicationContext context = SpringApplication.run(SpringBootHibernateExampleApplication.class, args);
        
    // Get the StudentDAO bean from the application context
        StudentDAO dao = context.getBean(StudentDAO.class);
		
    // 1. add student ---- INSERT
		
//		Student s1=new Student();
//		s1.setSname("Animal");
//		s1.setGpa(9);
//		dao.addStudent(s1);
//		Student s2=new Student();
//		s2.setSname("Billa");
//		s2.setGpa(8);
//		dao.addStudent(s2);
//		Student s3=new Student();
//		s3.setSname("Chennai Express");
//		s3.setGpa(7);
//		dao.addStudent(s3);
//		Student s4=new Student();
//		s4.setSname("Devera");
//		s4.setGpa(6);
//		dao.addStudent(s4);
		
	// 2. read student by rno ---- SELECT by ID
		
//		Student s1 = dao.readStudent(4L);

		
	// 3. edit student by rno ---- UPDATE  .... SET sname,gpa
		
//		Student s1 = dao.readStudent(2L);
//		s1.setSname("Bahubali");
//		s1.setGpa(123);
//		dao.editStudent(s1);
		
	// 4. delete Student by rno ---- DELETE
		
//		dao.deleteStudent(3L);
		
	// 5. read All Students ---- SELECT *
		List<Student> allStu=dao.readAllStudents();
		if(allStu !=null && !allStu.isEmpty())
		{
			for(Student stu : allStu)
			{
			  System.out.println(stu);	
			}
		}
	}
}
