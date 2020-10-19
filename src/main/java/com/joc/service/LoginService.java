package com.joc.service;

import java.util.List;

import org.springframework.web.servlet.ModelAndView;

import com.joc.entity.User;
import com.joc.entity.User_Role;

public interface LoginService {
	public List<User> checkLogin(User us);
	public String saveUser(User us);
	public List<User> getAllUser1();
	public User_Role checkRole(int id);
}
