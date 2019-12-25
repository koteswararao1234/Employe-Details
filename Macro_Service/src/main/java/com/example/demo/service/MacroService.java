package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.XsncDto;

@Service
public class MacroService {

	@Autowired
	String macroUrl;

	@SuppressWarnings({ "unused", "null" })
	public void createMacroDetails(XsncDto sncDto) {

		String url = null;
		ResponseEntity<XsncDto> responseEntity = null;
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<XsncDto> entity = new HttpEntity<XsncDto>(sncDto, headers);

		url = macroUrl + "/xsnc/create";
		responseEntity = restTemplate.exchange(url, HttpMethod.POST, entity, XsncDto.class);
		XsncDto result = responseEntity.getBody();

	}

}
