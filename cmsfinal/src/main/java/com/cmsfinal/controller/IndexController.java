package com.cmsfinal.controller;

import com.jfinal.aop.Before;
import com.jfinal.core.ActionKey;
import com.jfinal.core.Controller;
import com.jfinal.ext.interceptor.NoUrlPara;

public class IndexController  extends Controller{

	@Before(NoUrlPara.class)
	public void index()
	{
		setAttr("test", "hello test");
		render("index.ftl");
	}
	
	
	@ActionKey("/404")
	public void notfound404()
	{
		renderHtml("404");
	}
	
	
	@ActionKey("/500")
	public void error500()
	{
		renderHtml("500");
	}
	
	
	@ActionKey("/403")
	public void notaccess()
	{
		renderHtml("403");
	}
	
	
	
	
}
