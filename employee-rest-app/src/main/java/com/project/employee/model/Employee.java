package com.project.employee.model;

import lombok.Data;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;

@Data
@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@JsonProperty("id")
	private long id;
	
	@Column(name="first_name", nullable=false)
	@JsonProperty("firstName")
	private String firstName;
	
	@Column(name="last_name", nullable=false)
	@JsonProperty("lastName")
	private String lastName;
	
	@Column(name="email")
	@JsonProperty("email")
	private String email;
}
