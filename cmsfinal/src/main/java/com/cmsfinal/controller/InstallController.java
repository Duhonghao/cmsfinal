package com.cmsfinal.controller;

import com.jfinal.core.Controller;

public class InstallController extends Controller{

	//检查是否安装
	public void index() {
		
		renderHtml("installed");

	}
	
}
