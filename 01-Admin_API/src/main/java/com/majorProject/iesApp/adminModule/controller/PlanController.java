package com.majorProject.iesApp.adminModule.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.majorProject.iesApp.adminModule.service.impl.PlanServiceImpl;

@RestController
public class PlanController {
	
	@Autowired
	private PlanServiceImpl service;
	
	

}
