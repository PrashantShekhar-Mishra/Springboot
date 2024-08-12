package com.myapp.crud.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="StudentResult")
public class StudentResult {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private int Rollno;
	
	@Column( name = "marks")
	private int marks;
	
	@Column( name = "Exam")
	private String exam;
	
	public StudentResult() {
	}
	
	public StudentResult(int marks, String exam) {
		super();
		this.marks = marks;
		this.exam = exam;
	}

	public int getRollno() {
		return Rollno;
	}

	public void setRollno(int rollno) {
		Rollno = rollno;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getExam() {
		return exam;
	}

	public void setExam(String exam) {
		this.exam = exam;
	}
	@Override
	public String toString() {
		return "StudentResult [Rollno=" + Rollno + ", marks=" + marks + ", exam=" + exam + "]";
	}

	
	
}
