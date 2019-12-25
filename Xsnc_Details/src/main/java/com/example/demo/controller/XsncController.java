package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.XsncDto;
import com.example.demo.service.XsncService;

@RestController
@RequestMapping("xsnc")
public class XsncController {

	@Autowired
	private XsncService sncService;

	@PostMapping(value = "/create")
	public void createXsncDetails(@RequestBody XsncDto sncDto) {

		sncService.createXsncDetails(sncDto);

	}

}
