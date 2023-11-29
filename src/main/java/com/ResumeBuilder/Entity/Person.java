package com.ResumeBuilder.Entity;

import org.springframework.stereotype.Component;

public class Person {
	String name;
	String lname;
	String gender;
	String dob;
	String phoneNumber;
	String email;
	String SName;
	String SField;
	String SGrade;
	String CName;
	String CStream;
	String CGrade;
	String skill;
	String about;
	String linkedIn;
	String github;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, String lname, String gender, String dob, String phoneNumber, String email, String sName,
			String sField, String sGrade, String cName, String cStream, String cGrade, String skill, String about,
			String linkedIn, String github) {
		super();
		this.name = name;
		this.lname = lname;
		this.gender = gender;
		this.dob = dob;
		this.phoneNumber = phoneNumber;
		this.email = email;
		SName = sName;
		SField = sField;
		SGrade = sGrade;
		CName = cName;
		CStream = cStream;
		CGrade = cGrade;
		this.skill = skill;
		this.about = about;
		this.linkedIn = linkedIn;
		this.github = github;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSName() {
		return SName;
	}
	public void setSName(String sName) {
		SName = sName;
	}
	public String getSField() {
		return SField;
	}
	public void setSField(String sField) {
		SField = sField;
	}
	public String getSGrade() {
		return SGrade;
	}
	public void setSGrade(String sGrade) {
		SGrade = sGrade;
	}
	public String getCName() {
		return CName;
	}
	public void setCName(String cName) {
		CName = cName;
	}
	public String getCStream() {
		return CStream;
	}
	public void setCStream(String cStream) {
		CStream = cStream;
	}
	public String getCGrade() {
		return CGrade;
	}
	public void setCGrade(String cGrade) {
		CGrade = cGrade;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public String getLinkedIn() {
		return linkedIn;
	}
	public void setLinkedIn(String linkedIn) {
		this.linkedIn = linkedIn;
	}
	public String getGithub() {
		return github;
	}
	public void setGithub(String github) {
		this.github = github;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", lname=" + lname + ", gender=" + gender + ", dob=" + dob + ", phoneNumber="
				+ phoneNumber + ", email=" + email + ", SName=" + SName + ", SField=" + SField + ", SGrade=" + SGrade
				+ ", CName=" + CName + ", CStream=" + CStream + ", CGrade=" + CGrade + ", skill=" + skill + ", about="
				+ about + ", linkedIn=" + linkedIn + ", github=" + github + "]";
	}
	
	
	
}
