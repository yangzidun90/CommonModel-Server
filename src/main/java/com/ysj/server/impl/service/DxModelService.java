package com.ysj.server.impl.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ysj.server.inteface.dao.IDxModelDao;
import com.ysj.server.inteface.service.IDxModelService;
import com.ysj.server.model.DxModel;
@Service
public class DxModelService implements IDxModelService {
	@Autowired
	private IDxModelDao dao;
	@Override
	public void save(DxModel m) {
		// TODO Auto-generated method stub
		dao.save(m);
	}

	@Override
	public DxModel searchById(String id) {
		// TODO Auto-generated method stub
		return dao.searchById(id);
	}

	@Override
	public List<DxModel> searchByParam(Map param) {
		// TODO Auto-generated method stub
		return dao.searchByParam(param);
	}

}
