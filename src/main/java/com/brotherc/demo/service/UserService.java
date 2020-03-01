package com.brotherc.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brotherc.demo.mapper.UserMapper;
import com.brotherc.demo.model.User;

@Service
public class UserService {

  @Autowired
  private UserMapper userMapper;

  public List<User> getUsers() {
    return userMapper.selectUsers();
  }

}
