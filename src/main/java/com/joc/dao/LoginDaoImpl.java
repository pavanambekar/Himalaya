package com.joc.dao;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.ModelAndView;

import com.joc.entity.User;
import com.joc.entity.User_Role;


@Repository
public class LoginDaoImpl implements LoginDao {

	@Autowired
	SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public List<User> checkLogin(User us) {
		Session session = sessionFactory.openSession();
		String query =" from User a where a.userName='"+us.getUserName()+"' and a.passWord='"+us.getPassWord()+"'";
		List<User> e=session.createQuery(query).list();
		User u =e.get(0);
		int y=u.getId();
		return e;
	}
	
	public User_Role checkRole(int id) {
		Session session = sessionFactory.openSession();
		String query1= "from User_Role b where b.id='"+id+"'";
		User_Role u1=(User_Role)session.createQuery(query1);
		return u1;
	}

	public String saveUser(User us) {
			Session s= sessionFactory.openSession();
			  Transaction t=s.beginTransaction();
			  s.save(us);
			  t.commit();
			  String ss="Exicuted";
			  return ss;
		}

	public List<User> getAllUser() {
		Session s= sessionFactory.openSession();
		List<User>e=s.createCriteria(User.class).list();
		return e;
	}
	}


