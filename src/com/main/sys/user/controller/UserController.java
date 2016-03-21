package com.main.sys.user.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.main.sys.user.service.IUserService;

/**
 * 
 * Title:   UserController
 * Description: 用户控制  
 * Company:   www.edu24ol.com
 * @author   pc-zw
 * @date     2016年3月18日下午6:36:33
 * @version  1.0
 */
@Controller
@RequestMapping("/user")
public class UserController {

	@Resource
	private IUserService userServiceImpl;
	
	public void setUserServiceImpl(IUserService userServiceImpl) {
		this.userServiceImpl = userServiceImpl;
	}


	@RequestMapping("/addUser.do")
	public String addUser(Model model){
		return "";
	}
	
	
	@RequestMapping("/listUser.do")
	public String listUser(Model model){
		return "";
	}
}
