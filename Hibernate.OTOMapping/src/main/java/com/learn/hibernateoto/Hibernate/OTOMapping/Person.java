package com.learn.hibernateoto.Hibernate.OTOMapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
	
	@Id
	int p_id;
	String name;
	int age;
	@OneToOne
	Bike b;
	public Person() {
		super();
		
	}
	public Person(int p_id, String name, int age, Bike b) {
		super();
		this.p_id = p_id;
		this.name = name;
		this.age = age;
		this.b = b;
	}
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
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
	public Bike getB() {
		return b;
	}
	public void setB(Bike b) {
		this.b = b;
	}
	@Override
	public String toString() {
		return "Person [p_id=" + p_id + ", name=" + name + ", age=" + age + ", b=" + b + "]";
	}
	
}
