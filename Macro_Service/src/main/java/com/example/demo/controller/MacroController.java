package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.XsncDto;
import com.example.demo.service.MacroService;

@RestController
@RequestMapping("macro")
public class MacroController {

	@Autowired
	private MacroService macroService;

	@PostMapping("/createmacro")
	public void createMacroDetails(@RequestBody XsncDto sncDto) {
		macroService.createMacroDetails(sncDto);
		
	}

}
