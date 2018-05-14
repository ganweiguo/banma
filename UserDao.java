package com.mall.dao;

import com.mall.domain.User;

public interface UserDao {

	int UserRegister(User u);

	int updateState(String code);
	public User checkLogin(String username, String pass);

	User checkName(String name);
}
