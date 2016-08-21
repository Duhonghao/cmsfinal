package com.cmsfinal.controller;

import com.cmsfinal.validator.ContentValidator;
import com.jfinal.aop.Before;
import com.jfinal.core.Controller;

public class InstallController extends Controller{

	//检查是否安装
	public void index() {
		
		renderHtml("installed");

	}
	
	@Before(ContentValidator.class)
	public void test()
	{
		renderHtml("hello");
	}
}
