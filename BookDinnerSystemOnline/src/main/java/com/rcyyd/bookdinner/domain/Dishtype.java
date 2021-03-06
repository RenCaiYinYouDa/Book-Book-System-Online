package com.rcyyd.bookdinner.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_dish_type")
public class Dishtype implements Serializable {
	@Id
	private Integer typeid;
	private String type;

	public Dishtype() {
	}
	
	public Dishtype(Integer typeid, String type) {
		this.typeid = typeid;
		this.type = type;
	}

	public Integer getTypeid() {
		return typeid;
	}

	public void setTypeid(Integer typeid) {
		this.typeid = typeid;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
}

