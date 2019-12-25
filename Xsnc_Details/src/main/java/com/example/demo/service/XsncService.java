package com.example.demo.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.XsncDto;
import com.example.demo.model.Xsnc;
import com.example.demo.repository.XsncRepository;

@Service
public class XsncService {

	@Autowired
	private XsncRepository xsncRepository;

	public void createXsncDetails(XsncDto sncDto) {

		Xsnc xsnc = new Xsnc();
		BeanUtils.copyProperties(sncDto, xsnc);
		/*
		 * xsnc.setXsncId(sncDto.getXsncId()); xsnc.setServiceId(sncDto.getServiceId());
		 * xsnc.setTrailId(sncDto.getTrailId());
		 * xsnc.setTrailName(sncDto.getTrailName());
		 */
		xsncRepository.save(xsnc);

	}

}
