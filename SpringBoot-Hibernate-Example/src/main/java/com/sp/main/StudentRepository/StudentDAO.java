package com.sp.main.StudentRepository;

import java.util.List;

import com.sp.main.model.Student;

//StudentDAO interface defines data access methods for the Student entity
public interface StudentDAO {
 
 // Method to add a new student to the database
 void addStudent(Student student);
 
 // Method to retrieve a student by their roll number (ID)
 Student readStudent(long rno); // Select by ID
 
 // Method to update an existing student's information
 void editStudent(Student student);
 
 // Method to delete a student from the database by their roll number (ID)
 void deleteStudent(long rno); // Delete by ID
 
 // Method to retrieve all students from the database
 List<Student> readAllStudents(); // Select all
}
