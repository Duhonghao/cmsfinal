package com.cmsfinal.common;

import com.cmsfinal.Controller.IndexController;
import com.jfinal.config.Routes;

public class RouteConfig extends Routes {

	@Override
	public void config() {
		// index 首页配置
		this.add("/",IndexController.class);
	}

}
