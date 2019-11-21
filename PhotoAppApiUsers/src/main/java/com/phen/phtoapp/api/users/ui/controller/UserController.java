package com.phen.phtoapp.api.users.ui.controller;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.phen.phtoapp.api.users.beans.AppConfig;
import com.phen.phtoapp.api.users.beans.Region;

@RestController
@RequestMapping("/users")
public class UserController {
	

	@GetMapping("/status/check")
	public String status() {
		
		
		AnnotationConfigApplicationContext ctxt = new AnnotationConfigApplicationContext();
		ctxt.register(AppConfig.class);
		ctxt.refresh();
		Region region = ctxt.getBean(Region.class);
		String cName = region.getCityBean().cityName();
		ctxt.close();
		return cName;
	}
}

