package com.cmsfinal.validator;

import com.jfinal.core.Controller;
import com.jfinal.validate.Validator;

public class ContentValidator extends Validator {

	@Override
	protected void validate(Controller c) {
		// TODO Auto-generated method stub
		validateRequiredString("test", "testMsg", "必须键入参数test=testMsg!");
	}

	@Override
	protected void handleError(Controller c) {
		// TODO Auto-generated method stub
		c.renderHtml("no validated");
	}

}
