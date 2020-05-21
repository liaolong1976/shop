package com.shop.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.mapper.UserMapper;
import com.shop.pojo.User;
import com.shop.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	@Override
	public User SelectUserById(int i) {
		// TODO Auto-generated method stub
		User user = userMapper.selectByPrimaryKey(i);
		return user;
	}

}
