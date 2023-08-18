package com.java.jdbc;

public class MainTest {

	public static void main(String[] args) {
		DBService service= new DBService();
		service.createTable();
		
		service.insertValues(getEmployee("mohamed","mohamed dowidar","tala","male",22, "0483701742"));
		service.insertValues(getEmployee("ahmed","ahmed dowidar","tala","male",31, "0483701742"));
		service.insertValues(getEmployee("ali","ali ismail","tala","male",32, "0483701742"));
		service.insertValues(getEmployee("youmna","youmna ahmed","tala","female",3, "0483701742"));
		service.insertValues(getEmployee("anas","anas ahmed","tala","male",1, "0483701742"));

		service.updateEmployeeFirstName("MR/MS");
		service.updateEmployeeVacationBalance(45);
		
		service.printCount();
	}
	public static Employee getEmployee(String firstName, String lastName, String address, String sex, int age, String phoneNumber) {
		Employee employee= new Employee();
		employee.setF_name(firstName);
		employee.setL_name(lastName);
		employee.setAddress(address);
		employee.setSex(sex);
		employee.setAge(age);
		employee.setPhoneNumber(phoneNumber);
		employee.setVacation_balance(30);
		return employee;
	}
}
