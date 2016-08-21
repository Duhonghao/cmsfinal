package com.cmsfinal.common;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.kit.PropKit;


public class MainConfig extends JFinalConfig {

	@Override
	public void configConstant(Constants me) {
		//运行前的加载项目
		PropKit.use("config/common/config.properties");
		//设置开发模式 从common/properties中读取
		me.setDevMode(PropKit.getBoolean("common.devmode"));
		//me.setError404View("/404");
		//me.setError500View("/500");

	}

	@Override
	public void configHandler(Handlers me) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void configInterceptor(Interceptors me) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void configPlugin(Plugins me) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void configRoute(Routes me) {
		//前台数据路由配置
		me.add(new RouteConfig());
		//后台管理员路由配置
		me.add(new AdminRouteConfig());
	}

}
