package com.sp.main.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/* 
@Entity: 
This annotation indicates that the class is a JPA entity and is mapped to a database table.

@Table(name = "student"): 
Specifies the database table to which this entity is mapped. In this case, it’s the student table.

@Id: 
Marks the field as the primary key of the entity.

@GeneratedValue(strategy = GenerationType.IDENTITY):
Configures how the primary key will be generated. IDENTITY means that the database will generate a unique value for the primary key automatically.

@Column(name = "..."): 
Maps the field to a specific column in the database table.
    
 */
@Entity
@Table(name = "student")
public class Student 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "rno")
	private long rno;
	@Column(name = "sname")
	private String sname;
	@Column(name = "gpa")
	private int gpa;

	public long getRno() {
		return rno;
	}

	public void setRno(long rno) {
		this.rno = rno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getGpa() {
		return gpa;
	}

	public void setGpa(int gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student =====> [rno=" + rno + ", sname=" + sname + ", gpa=" + gpa + "]";
	}

}
