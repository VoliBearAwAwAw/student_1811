package com.jt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jt.pojo.User;
import com.jt.service.UserService;

@RestController
@RequestMapping("/consumer")
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/findAll")
	public List<User> findAll(){
		return userService.findAll();
	}
	
	@RequestMapping("/saveUser/{name}/{age}/{sex}")
	public String saveUser(User user) {
		return userService.saveUser(user);
	}
	
	@RequestMapping("/getMsg")
	public String getMsg() {
		return userService.getMsg();
	}
	
	@RequestMapping("/updateUser/{id}/{name}/{age}/{sex}")
	public String updateUser(User user) {
		return userService.updateUser(user);
	}
	
	@RequestMapping("/deleteUserById/{id}")
	public String deleteUserById(User user) {
		return userService.deleteUserById(user);
	}
	
//	//消费者获取服务端数据
//	@SuppressWarnings("unchecked")
//	@RequestMapping("/findAll")
//	public List<User> findAll(){
//		return restTemplate.getForObject(providerUrl+"findAll", List.class);
//	}
//	
//	@RequestMapping("/saveUser/{name}/{age}/{sex}")
//	public String saveUser(User user) {
//		return restTemplate.postForObject(providerUrl+"saveUser", user, String.class);
//	}
//	
//	@RequestMapping("/updateUser/{id}/{name}/{age}/{sex}")
//	public String updateUser(User user) {
//		return restTemplate.postForObject(providerUrl+"updateUser", user, String.class);
//	}
//	
//	@RequestMapping("/deleteUserById/{id}")
//	public String deleteUserById(Integer id) {
//		return restTemplate.postForObject(providerUrl+"deleteUserById", id, String.class);
//	}
//	
//	@RequestMapping("/getMsg")
//	public String getMsg() {
//		return restTemplate.getForObject(providerUrl+"getMsg", String.class);
//	}
}
