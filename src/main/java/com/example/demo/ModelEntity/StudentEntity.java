package com.example.demo.ModelEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Data
@Table(name = "StdData")
public class StudentEntity {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int age;
	private String address;
	private String course;
	private String  markspdf;
	private String newCol;
	
	
	
	public String getNewCol() {
		return newCol;
	}
	public void setNewCol(String newCol) {
		this.newCol = newCol;
	}
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
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getMarkspdf() {
		return markspdf;
	}
	public void setMarkspdf(String markspdf) {
		this.markspdf = markspdf;
	}
	
	@Override
	public String toString() {
		return "StudentEntity [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + ", course="
				+ course + ", markspdf=" + markspdf + ", newCol=" + newCol + "]";
	}
	
	
	
	
	
	
	

}
