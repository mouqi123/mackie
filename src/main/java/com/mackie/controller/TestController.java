package com.mackie.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mackie.domain.UserDO;

@Controller
public class TestController {
	public static int counter=0;
	Logger log = LogManager.getLogger(TestController.class);
	
	@RequestMapping(value="/login.do")
	@ResponseBody
	public UserDO login( UserDO user,@RequestBody String json) {
		log.info("this is a debug message. debug:"+ counter++);
		log.info(json);
		log.info("userName:"+user.getUserName());
		log.info(user.getPassword());
		UserDO user1 = new UserDO();
		user1.setUserName("alsdkfjhasaaaaaaaaaaaaaaaaaa");
		return user1;
	}
}
