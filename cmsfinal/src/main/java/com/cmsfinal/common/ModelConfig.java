package com.cmsfinal.common;

import com.jfinal.kit.PropKit;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.activerecord.IDataSourceProvider;

public class ModelConfig extends ActiveRecordPlugin {

	public ModelConfig(IDataSourceProvider dataSourceProvider) {
		super(dataSourceProvider);
		this.setShowSql(PropKit.getBoolean("dev.showSQL"));
		// ORM映射
		//this.addMapping("user", User.class);
	}

}
