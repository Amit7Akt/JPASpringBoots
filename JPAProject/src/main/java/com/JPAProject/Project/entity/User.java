package com.JPAProject.Project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name = "USER11")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String Name;
	private String City;
	private String status;
	
	@Override
	public String toString() {
		return "User [id=" + id + ", Name=" + Name + ", City=" + City + ", status=" + status + "]";
	}

	public User(Integer id, String name, String city, String status) {
		super();
		this.id = id;
		Name = name;
		City = city;
		this.status = status;
	}
	
	public User() {
		super();
		
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
