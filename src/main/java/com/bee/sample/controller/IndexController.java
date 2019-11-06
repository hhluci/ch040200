package com.bee.sample.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	//Spring MVC会自动生成视图，并且绑定数据模型
	// 映射"/"请求
	@RequestMapping("/")
	public String index(Model model) {
		System.out.println("IndexController index方法被调用。。。。");
		/*
		 * 根据Thymeleaf默认模板，将返回resources/templates/index.html
		 * 返回的字符串是"index",Thymeleaf默认的前缀是"classpath:/templates/",
		 * 后缀是"html",所以该请求返回"classpath:/templates/index.html"。
		 */
		return "index";  
	}
}
