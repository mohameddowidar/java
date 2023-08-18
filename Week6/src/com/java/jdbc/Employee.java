package com.java.jdbc;

public class Employee {
	private int Id;
	private String f_name;
	private String l_name;
	private String sex;
	private int age;
	private String address;
	private String phoneNumber;
	private int vacation_balance;

	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	public String getL_name() {
		return l_name;
	}
	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getVacation_balance() {
		return vacation_balance;
	}
	public void setVacation_balance(int vacation_balance) {
		this.vacation_balance = vacation_balance;
	}
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", f_name=" + f_name + ", l_name=" + l_name + ", sex=" + sex + ", age=" + age
				+ ", address=" + address + ", phoneNumber=" + phoneNumber + ", vacation_balance=" + vacation_balance
				+ "]";
	}
	
}
