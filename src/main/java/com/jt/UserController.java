package com.jt;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@ConfigurationProperties(prefix="user")
@RestController
@PropertySource("classpath:/properties/user.properties")
public class UserController {
	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	//@Value("${user.username}")
	public String username;
	//@Value("${user.age}")
	public int age;
	public int hight;
	

	public int getHight() {
		return hight;
	}


	public void setHight(int hight) {
		this.hight = hight;
	}


	@RequestMapping("/sayHello")
   public  String sayHello() {
	   return username+":::::"+age+"::::"+hight;
	   
   }
	@RequestMapping("/getMsg")
	public String getMsg() {
		return "good";
		
	}

}
