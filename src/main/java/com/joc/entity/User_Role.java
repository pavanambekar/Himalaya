package com.joc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class User_Role {
	@Id
	@GeneratedValue
   private int Rid;
	@Column
   private String RoleName;
	@Column
   private int id;
public int getRid() {
	return Rid;
}
public void setRid(int rid) {
	Rid = rid;
}
public String getRoleName() {
	return RoleName;
}
public void setRoleName(String roleName) {
	RoleName = roleName;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
   
   
}
