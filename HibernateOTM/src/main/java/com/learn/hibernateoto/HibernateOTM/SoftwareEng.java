package com.learn.hibernateoto.HibernateOTM;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class SoftwareEng {
	@Id
	int Id;
	String name;
	int age;
	@OneToMany
	List<Technology> tech;

	public SoftwareEng() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SoftwareEng(int id, String name, int age, List<Technology> tech) {
		super();
		Id = id;
		this.name = name;
		this.age = age;
		this.tech = tech;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
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

	public List<Technology> getTech() {
		return tech;
	}

	public void setTech(List<Technology> tech) {
		this.tech = tech;
	}

	@Override
	public String toString() {
		return "SoftwareEng [Id=" + Id + ", name=" + name + ", age=" + age + ", tech=" + tech + "]";
	}

}
