package com.learn.hibernateoto.HibernateOTM;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Technology {
	@Id
	int t_Id;
	String t_name;
	public Technology() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Technology(int t_Id, String t_name) {
		super();
		this.t_Id = t_Id;
		this.t_name = t_name;
	}
	public int getT_Id() {
		return t_Id;
	}
	public void setT_Id(int t_Id) {
		this.t_Id = t_Id;
	}
	public String getT_name() {
		return t_name;
	}
	public void setT_name(String t_name) {
		this.t_name = t_name;
	}
	@Override
	public String toString() {
		return "SoftwareEng [t_Id=" + t_Id + ", t_name=" + t_name + "]";
	}
	

}

