package com.mackie.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	public static int counter=0;
	Logger log = LogManager.getLogger(TestController.class);
	@RequestMapping("/login")
	public void login() {
		log.info("this is a debug message. debug:"+ counter++);
	}
}
