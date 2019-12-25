package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Xsnc implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long xsncId;
	@Column
	private String trailId;
	@Column
	private String trailName;
	@Column
	private String serviceId;

	public Long getXsncId() {
		return xsncId;
	}

	public void setXsncId(Long xsncId) {
		this.xsncId = xsncId;
	}

	public String getTrailId() {
		return trailId;
	}

	public void setTrailId(String trailId) {
		this.trailId = trailId;
	}

	public String getTrailName() {
		return trailName;
	}

	public void setTrailName(String trailName) {
		this.trailName = trailName;
	}

	public String getServiceId() {
		return serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	@Override
	public String toString() {
		return "Xsnc [xsncId=" + xsncId + ", trailId=" + trailId + ", trailName=" + trailName + ", serviceId="
				+ serviceId + "]";
	}

}
