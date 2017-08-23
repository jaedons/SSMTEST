package com.jaedons.action;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jaedons.entity.UserEntity;
import com.jaedons.service.IUserService;

@Controller
@RequestMapping("user")
public class UserController {
	@Resource 
	IUserService userService;
	@RequestMapping("/login")
	public String login(HttpServletRequest request){
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		UserEntity user = new UserEntity();
		 user.setUsername(username);
		 user.setPassword(password);
		 userService.insertUser(user);
		 List<UserEntity> users = userService.getAllUser();
		 request.setAttribute("users", users);
		return "ListUser";
	}
	
	@RequestMapping("/toLogin")
	public String toLogin(HttpServletRequest request){
		return "Login";
	}
	@RequestMapping("/delete")
	public String delete(HttpServletRequest request){
		String idStr = request.getParameter("id");
		int id = Integer.parseInt(idStr);
		userService.deleteUser(id);
		 List<UserEntity> users = userService.getAllUser();
		 request.setAttribute("users", users);
		return "ListUser";
	}
	@RequestMapping("toUpdate")
	public String toUpdate(HttpServletRequest request){
		String idStr = request.getParameter("id");
		int id = Integer.parseInt(idStr);
		UserEntity user = userService.getUserById(id);
		request.setAttribute("user", user);
		return "update";
	}
	@RequestMapping("update")
	public String update(@ModelAttribute UserEntity user,HttpServletRequest request){
		System.out.println(user);
		userService.updateUser(user);
		 List<UserEntity> users = userService.getAllUser();
		 request.setAttribute("users", users);
		return "ListUser";
	}
}
