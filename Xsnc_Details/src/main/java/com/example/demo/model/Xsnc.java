package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Xsnc implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	private Long xsncId;
	@Column
	private String trailId;
	@Column
	private String trailName;
	@Column
	private String serviceId;

	@Override
	public String toString() {
		return "Xsnc [xsncId=" + xsncId + ", trailId=" + trailId + ", trailName=" + trailName + ", serviceId="
				+ serviceId + "]";
	}

}
