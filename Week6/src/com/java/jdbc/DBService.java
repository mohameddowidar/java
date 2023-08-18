package com.java.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DBService {

	public void createTable() {
		
		try (Connection connection = JDBC.getConnection()) {
			String query="create table employee ( "
					+ "id  int NOT NULL AUTO_INCREMENT, "
					+ "f_name  varchar(255) ,  "
					+ "l_nameress  varchar(255) , "
					+ "sex  varchar(255) , "
					+ "age int, "
					+ "Address  varchar(255) , "
					+ "phone_number varchar(255)  , "
					+ "vacation_balance int ,  "
					+ " PRIMARY KEY (id) "
					+ ")";

			// Set prepared statement.
			PreparedStatement ps = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
			ps.executeUpdate();
			System.out.println("Employee Table Created Successfully ");
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	public void printCount() {
		try (Connection connection = JDBC.getConnection()) {

			// Prepare SQL.
			String query = ("SELECT * FROM EMPLOYEE");

			// Set prepared statement.
			PreparedStatement ps = connection.prepareStatement(query);

			// Execute SQL.
			ResultSet rs = ps.executeQuery();

			// Get data from database.
			ArrayList<Employee> persons = new ArrayList<>();
			while (rs.next()) {
				Employee person = new Employee();
				person.setId(rs.getInt("Id"));
				person.setF_name(rs.getString("f_name"));
				person.setL_name(rs.getString("l_nameress"));
				person.setSex(rs.getString("sex"));
				person.setAge(rs.getInt("age"));
				person.setAddress(rs.getString("Address"));
				person.setPhoneNumber(rs.getString("phone_number"));
				person.setVacation_balance(rs.getInt("vacation_balance"));
				persons.add(person);
			}
			System.out.println("Size of Employees Added is : "+persons.size());
			for (Employee employee : persons) {
				System.out.println(employee.toString());
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	public void insertValues(Employee person) {
		try (Connection connection = JDBC.getConnection()) {

			// Prepare SQL.
			String query = ("INSERT INTO Employee (f_name, l_nameress,sex,age, Address, phone_number, vacation_balance) "
					+ "VALUES (?, ?, ?, ?, ?, ?, ?)");

			// Set prepared statement.
			PreparedStatement ps = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
			int index = 1;
			ps.setString(index++, person.getF_name());
			ps.setString(index++, person.getL_name());
			ps.setString(index++, person.getSex());
			ps.setInt(index++, person.getAge());
			ps.setString(index++, person.getAddress());
			ps.setString(index++, person.getPhoneNumber());
			ps.setInt(index++, person.getVacation_balance());

			// Execute SQL.
			ps.executeUpdate();
			System.out.println("Employee Added Successfully : "+person.toString());
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	public void updateEmployeeFirstName(String firstName) {
		try (Connection connection = JDBC.getConnection()) {

			// Prepare SQL.
			String query = ("Update Employee set f_name= ?");

			// Set prepared statement.
			PreparedStatement ps = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
			ps.setString(1, firstName);
			ps.executeUpdate();
			System.out.println("Employee updated Successfully");
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	public void updateEmployeeVacationBalance(int balance) {
		try (Connection connection = JDBC.getConnection()) {

			// Prepare SQL.
			String query = ("Update Employee set vacation_balance= ? where vacation_balance= 30");
			// Set prepared statement.
			PreparedStatement ps = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
			ps.setInt(1, balance);
			ps.executeUpdate();
			System.out.println("Employee updated Successfully");
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
}
