package com.cmsfinal.common;

import com.cmsfinal.controller.IndexController;
import com.cmsfinal.controller.InstallController;
import com.jfinal.config.Routes;

public class RouteConfig extends Routes {

	@Override
	public void config() {
		//index 首页配置
		this.add("/",IndexController.class);
		//install 配置
		this.add("/install",InstallController.class);
	}

}
