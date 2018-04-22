package com.ysj.server.inteface.dao;

import java.util.List;
import java.util.Map;

import com.ysj.server.model.DxModel;

public interface IDxModelDao {
	void save(DxModel m);

	DxModel searchById(String id);

	List<DxModel> searchByParam(Map param);
}
