package com.cmsfinal.handler;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cmsfinal.model.Config;
import com.jfinal.handler.Handler;

public class BaseConfigHandler extends Handler {

	@Override
	public void handle(String target, HttpServletRequest request,
			HttpServletResponse response, boolean[] isHandled) {
	
		List<Config> configList = Config.dao
				.find("select name,title,value  from cmsfinal_config");
		
		for (Config config : configList) {
			
			request.setAttribute(config.getStr("name"), config.getStr("value"));
		}
		
		
		
		next.handle(target, request, response, isHandled);
		
	}

}
