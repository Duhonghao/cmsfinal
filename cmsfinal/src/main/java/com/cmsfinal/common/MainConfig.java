package com.cmsfinal.common;

import com.cmsfinal.handler.BaseConfigHandler;
import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.ext.handler.ContextPathHandler;
import com.jfinal.kit.PropKit;
import com.jfinal.plugin.c3p0.C3p0Plugin;


public class MainConfig extends JFinalConfig {

	@Override
	public void configConstant(Constants me) {
		//运行前的加载项目
		PropKit.use("config/common/config.properties");
		PropKit.use("config/freemarker/freemarker.properties");
		//设置开发模式 从common/properties中读取
		me.setDevMode(PropKit.getBoolean("dev.devmode"));
		me.setBaseViewPath("/WEB-INF/template");
//		me.setBaseUploadPath("/upload");
//		me.setBaseDownloadPath("/download");
		me.setFreeMarkerViewExtension("*.ftl");
		//me.setError404View("/404");
		//me.setError500View("/500");
	//	me.setViewType(ViewType.JSP); 

	}

	@Override
	public void configHandler(Handlers me) {
		// TODO Auto-generated method stub
		
		//设置baseContextPath
		me.add(new ContextPathHandler("base"));
		me.add(new BaseConfigHandler());
		
	}

	@Override
	public void configInterceptor(Interceptors me) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void configPlugin(Plugins me) {
		

		//c3p0连接池设置直接加载方式
		//C3p0Plugin c3p0Plugin = new C3p0Plugin(PropKit.get("c3p0.jdbcurl"), PropKit.get("c3p0.user"), PropKit.get("c3p0.password"));
		//使用配置文件的方式加载c3p0连接池
		C3p0Plugin c3p0Plugin = new C3p0Plugin(loadPropertyFile("config/jdbc/c3p0.properties"));
		me.add(c3p0Plugin);
		// 添加orm映射
		me.add(new ModelConfig(c3p0Plugin));
		
		
		
	}

	@Override
	public void configRoute(Routes me) {
		//前台数据路由配置
		me.add(new RouteConfig());
		//后台管理员路由配置
		me.add(new AdminRouteConfig());
	}

}
