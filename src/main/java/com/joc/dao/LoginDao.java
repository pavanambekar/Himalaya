package com.joc.dao;

import java.util.List;

import org.springframework.web.servlet.ModelAndView;

import com.joc.entity.User;
import com.joc.entity.User_Role;

public interface LoginDao {
   public List<User> checkLogin (User us);
   public String saveUser(User us);
   public List<User> getAllUser();
   public User_Role checkRole(int id);
}
