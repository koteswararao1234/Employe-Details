package com.example.demo.dto;

public class XsncDto {

	private Long xsncId;
	private String trailId;
	private String trailName;
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
		return "XsncDto [xsncId=" + xsncId + ", trailId=" + trailId + ", trailName=" + trailName + ", serviceId="
				+ serviceId + "]";
	}

}
