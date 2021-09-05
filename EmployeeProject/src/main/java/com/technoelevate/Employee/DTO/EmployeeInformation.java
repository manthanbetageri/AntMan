package com.technoelevate.Employee.DTO;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import lombok.*;

@Data
public class EmployeeInformation implements Serializable {

	private int empid;
	private String empname;
	private String username;
	private String password;
	
}
