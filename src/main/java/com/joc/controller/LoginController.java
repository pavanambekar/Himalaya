package com.joc.controller;

import java.net.http.HttpResponse;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.joc.entity.User;
import com.joc.entity.User_Role;
import com.joc.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
  public LoginService getLoginService() {
		return loginService;
	}

	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}

   @RequestMapping(value="/log")
      public ModelAndView login(@ModelAttribute("user") User user, HttpServletRequest req, HttpServletResponse res) {
	  ModelAndView m;
	  List<User> u=loginService.checkLogin(user);	 
	    if(u.size()>0) {
	    	m = new ModelAndView("next");
	    	User us = u.get(0);
	    	int id = us.getId();
	    	System.out.println("************************"+id);
	    	User_Role ur =loginService.checkRole(id);
	    	HttpSession ht=req.getSession();
	    	ht.setAttribute("role", ur.getRoleName());
	    }		
	    else {
			m = new ModelAndView("Login");
		    String s="BAD CREDENTIAL PLEASE REGISTER ";
	    }
	    return m;
  } 

    @RequestMapping(value="/register")
    public ModelAndView getRegister() {
	ModelAndView m=new ModelAndView("Registration");
	return m;
	}
 
   @RequestMapping(value="/reg" , method=RequestMethod.POST)
    public ModelAndView register(@ModelAttribute("User") User user) {
	ModelAndView m=new ModelAndView("Registration");
	loginService.saveUser(user);
	List<User>i=loginService.getAllUser1();
	m.addObject("res",i);
	return m;
}
   
	@RequestMapping(value="/ad")
	public ModelAndView admin() {
		ModelAndView m=new ModelAndView("admin1");
		return m;
	}
	
	
}

