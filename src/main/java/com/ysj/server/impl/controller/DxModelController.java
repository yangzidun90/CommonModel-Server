package com.ysj.server.impl.controller;



import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ysj.server.inteface.controller.IDxModelController;
import com.ysj.server.inteface.service.IDxModelService;
import com.ysj.server.model.DxModel;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/dxModel")
public class DxModelController implements IDxModelController{
	private static final Logger logger = LoggerFactory.getLogger(DxModelController.class);
	@Autowired
	private IDxModelService service;
	
	@ApiOperation(value="保存模型信息", notes="保存模型信息")
	@ApiImplicitParam(name = "m", value = "模型信息", required = true, dataType = "DxModel")
	@RequestMapping(value="/save",method=RequestMethod.GET)
	public void save(DxModel m) {
		logger.info("s");
	}
	
	@ApiOperation(value="根据主键查询", notes="查询模型信息")
	@ApiImplicitParam(name = "id", value = "模型主键", required = true, dataType = "String")
	@RequestMapping(value="/searchById",method=RequestMethod.GET)
	public DxModel searchById(String id) {
		logger.info("searchById");
		return service.searchById(id);
	}
	
	@ApiOperation(value="根据参数查询", notes="查询模型信息")
	@ApiImplicitParam(name = "param", value = "模型参数", required = true, dataType = "Map")
	@RequestMapping(value="/searchByParam",method=RequestMethod.GET)
	public List<DxModel> searchByParam(Map param) {
		logger.info("s");
		return null;
	}
}
