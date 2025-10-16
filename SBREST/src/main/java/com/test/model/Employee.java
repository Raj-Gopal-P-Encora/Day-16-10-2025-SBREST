package com.test.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;

@Entity
@Table(name="Employees")
@AllArgsConstructor
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column
	private String name;
	@Column
	private String address;
	
	public Employee() {}
	
//	public Employee(int id, String name, String address) {
//		this.id = id;
//		this.name = name;
//		this.address = address;
//	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
