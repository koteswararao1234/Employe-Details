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
		xsncRepository.save(xsnc);

	}

}
