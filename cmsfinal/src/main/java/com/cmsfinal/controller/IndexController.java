package com.cmsfinal.controller;

import com.jfinal.aop.Before;
import com.jfinal.core.ActionKey;
import com.jfinal.core.Controller;
import com.jfinal.ext.interceptor.NoUrlPara;

public class IndexController  extends Controller{

	@Before(NoUrlPara.class)
	public void index()
	{
		renderHtml("works");
	}
	
	
	@ActionKey("/404")
	public void notfound404()
	{
		renderHtml("404");
	}
	
}
