package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.bean.BlogProperties;
import com.springboot.bean.ConfigBean;
import com.springboot.bean.TestConfigBean;


@RestController
public class IndexController {
	@Autowired
	private BlogProperties blogProperties;
	@Autowired
	private ConfigBean configBean;
	@Autowired
	private TestConfigBean testConfigBean;

	@Value("${mrbird.blog.name}")
	private String name;
	
	@RequestMapping("/")
	String index() {
		System.out.println(name);
		return testConfigBean.getName()+"，"+testConfigBean.getAge();
	}
}
