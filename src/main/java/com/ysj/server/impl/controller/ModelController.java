package com.ysj.server.impl.controller;



import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ysj.server.inteface.controller.IModelController;
import com.ysj.server.model.DxModel;

@RestController
@RequestMapping("/model")
public class ModelController implements IModelController{
	private static final Logger logger = LoggerFactory.getLogger(ModelController.class);
	
	@ApiOperation(value="保存模型信息", notes="保存模型信息")
	@ApiImplicitParam(name = "m", value = "模型信息", required = true, dataType = "DxModel")
	@RequestMapping(value="/save",method=RequestMethod.GET)
	public void save(DxModel m) {
		logger.info("s");
	}
}
