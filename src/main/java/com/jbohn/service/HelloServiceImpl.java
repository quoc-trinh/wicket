package com.jbohn.service;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

	public String getHelloWorldMsg() {
		return "Spring : hello world";
	}

}