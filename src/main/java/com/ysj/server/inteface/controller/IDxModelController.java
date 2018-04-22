package com.ysj.server.inteface.controller;

import java.util.List;
import java.util.Map;

import com.ysj.server.model.DxModel;

public interface IDxModelController {
	void save(DxModel m);

	DxModel searchById(String id);

	List<DxModel> searchByParam(Map param);
}
