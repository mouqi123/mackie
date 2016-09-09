package com.mackie.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mackie.dao.UserDAO;
import com.mackie.domain.UserDO;

@Controller
public class TestController {

	public static int counter = 0;
	Logger log = LogManager.getLogger(TestController.class);

	@Autowired
	UserDAO userDAO;

	@RequestMapping(value = "/login.do")
	@ResponseBody
	public UserDO login(@RequestBody UserDO user, HttpServletRequest request) {
		log.info("this is a debug message. debug:" + counter++);

		log.info("userName:" + user.getUserName());
		log.info(user.getPassword());
		UserDO user1 = new UserDO();
		user1.setUserName("alsdkfjhasaaaaaaaaaaaaaaaaaa");
		return user1;
	}

	@RequestMapping(value = "/user.do")
	@ResponseBody
	public UserDO user(HttpServletRequest request) {
		log.info("this is a debug message. debug:" + counter++);

		UserDO user1 = new UserDO();
		user1.setUserName("mouqi123");
		user1.setPassword("adsfasdf");
		user1.setPhoneNumber("18610947048");
		user1.setUserId(2);
		userDAO.updateUser(user1);
		user1 = userDAO.queryByPhoneNumber("15115771640");
		return user1;
	}

	@RequestMapping(value="/delete.do")
	@ResponseBody
	public UserDO delete(HttpServletRequest request) {
		UserDO user = userDAO.queryById(2);
		userDAO.deleteUser(2);
		return user;
	}
	
	@RequestMapping(value="/test.do")
	@ResponseBody
	public UserDO test(@RequestBody String s, HttpServletResponse response) {
		System.out.println(s);
		response.setContentType("application/json");
		return new UserDO();
	}
}
