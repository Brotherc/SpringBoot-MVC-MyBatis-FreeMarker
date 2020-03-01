package com.brotherc.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brotherc.demo.model.User;
import com.brotherc.demo.service.UserService;

@RestController
public class UserController {

  @Autowired
  private UserService userService;

  @RequestMapping("user")
  public List<User> getUsers() {
      return userService.getUsers();
  }

  @RequestMapping("hello")
  public String hello(ModelMap modelMap) {
      List<User> users = userService.getUsers();
      modelMap.put("user", users.get(0));
      return "hello";
  }
}
