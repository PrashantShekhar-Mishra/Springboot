package com.myapp.crud.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table ( name = "Student")
public class Student {
	@Id
	@GeneratedValue ( strategy = GenerationType.IDENTITY)
	private int Rollno;
	@Column (name = "student_name")
	private String Name;
	@Column (name = "Student_percent")
	private float Percent;
	@Column (name = "student_branch")
	private String branch;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "add_id" , referencedColumnName = "Rollno")
	private List<Address> address;

	public int getRollno() {
		return Rollno;
	}
	public void setRollno(int rollno) {
		Rollno = rollno;
	}
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public float getPercent() {
		return Percent;
	}
	public void setPercent(float percent) {
		Percent = percent;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	public Student(int rollno, String name, float percent, String branch, List<Address> address) {
		super();
		Rollno = rollno;
		Name = name;
		Percent = percent;
		this.branch = branch;
		this.address = address;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [Rollno=" + Rollno + ", Name=" + Name + ", Percent=" + Percent + ", branch=" + branch
				+ ", adress=" + address + "]";
	}

	
}
