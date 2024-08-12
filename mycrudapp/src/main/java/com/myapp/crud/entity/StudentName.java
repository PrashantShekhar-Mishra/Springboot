package com.myapp.crud.entity;


public class StudentName {
	private int Rollno;
	private String Name;
	private float Percent;
	private String branch;
	public int getRollno() {
		return Rollno;
	}
	public void setRollno(int rollno) {
		Rollno = rollno;
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
	public StudentName(int rollno, String name, float percent, String branch) {
		super();
		Rollno = rollno;
		Name = name;
		Percent = percent;
		this.branch = branch;
	}
	public StudentName() {
		super();
	}
	

}
