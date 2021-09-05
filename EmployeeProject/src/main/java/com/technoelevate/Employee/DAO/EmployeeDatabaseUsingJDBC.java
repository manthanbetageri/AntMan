package com.technoelevate.Employee.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.technoelevate.Employee.DTO.EmployeeInformation;

@Component
public class EmployeeDatabaseUsingJDBC {
  
	EmployeeInformation info;
	public boolean addEmployee(EmployeeInformation info) throws SQLException, ClassNotFoundException
	{
		boolean isInsert=false;
		Class.forName("com.mysql.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/employee";
		String username = "root";
		String pass = "root";
		String query="insert into employes value(?,?,?,?)";
		Connection con = DriverManager.getConnection(url, username, pass);
		PreparedStatement st = con.prepareStatement(query);
		st.setInt(1, info.getEmpid());
		st.setString(2, info.getEmpname());
		st.setString(3,info.getUsername());
		st.setString(4,info.getPassword());
		int i = st.executeUpdate();

		isInsert=true;
		con.close();
	
		return isInsert;
		
	}
}
