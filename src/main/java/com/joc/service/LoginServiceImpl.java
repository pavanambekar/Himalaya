package com.joc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.joc.dao.LoginDao;
import com.joc.entity.User;
import com.joc.entity.User_Role;


@Service
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	LoginDao loginDao;

	public LoginDao getLoginDao() {
		return loginDao;
	}

	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}

	public List<User> checkLogin(User us) {
		return loginDao.checkLogin(us);
	}

	public String saveUser(User us) {
			return loginDao.saveUser(us);
	}

	public List<User> getAllUser1() {
		
		return loginDao.getAllUser();
	}

	@Override
	public User_Role checkRole(int id) {
		// TODO Auto-generated method stub
		return loginDao.checkRole(id);
	}
	
  
}
