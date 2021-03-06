package com.hcl.student;

public class Student {

	private int studnumber;
	private String firstname;
	private String lastname;
	private int age;
	private char gender;
	private float english;
	private float maths;
	private String major;

	public void add(int studno, String fname, String lname, int age_p, char gen, float eng, float mat, String maj) {
		setStudnumber(studno);
		setFirstname(fname);
		setLastname(lname);
		setAge(age_p);
		setGender(gen);
		setEnglish(eng);
		setMaths(mat);
		setMajor(maj);
		System.out.println("Student Number : " + getStudnumber());
		System.out.println("Student FirstName : " + getFirstname());
		System.out.println("Student LastName : " + getLastname());
		System.out.println("Student Age : " + getAge());
		System.out.println("Student Gender : " + getGender());
		System.out.println("English marks : " + getEnglish());
		System.out.println("Maths marks : " + getMaths());
		System.out.println("Major marks : " + getMajor());
	}

	public float getEnglish() {
		return english;
	}

	public void setEnglish(float english) {
		this.english = english;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public float getMaths() {
		return maths;
	}

	public void setMaths(float maths) {
		this.maths = maths;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getStudnumber() {
		return studnumber;
	}

	public void setStudnumber(int studnumber) {
		this.studnumber = studnumber;
	}

}
