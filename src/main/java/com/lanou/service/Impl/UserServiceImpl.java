package com.lanou.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lanou.dao.UserMapper;
import com.lanou.entity.User;
import com.lanou.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper usermapper;
	
	
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return usermapper.selectAll();
	}

}
