package com.ysj.server.impl.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ysj.server.inteface.dao.IDxModelDao;
import com.ysj.server.model.DxModel;
@Repository
public class DxModelDao implements IDxModelDao {
	@Autowired
	private JdbcTemplate jdbc;

	@Override
	public void save(DxModel m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public DxModel searchById(String id) {
		// TODO Auto-generated method stub
		String sql="SELECT ID,MODELTYPE,MODELNAME,CREATETIME,LASTTIME,STATE FROM COMMON_DXMODEL WHERE ID=?";
		List<DxModel> list = jdbc.query(sql, new Object[]{id},new BeanPropertyRowMapper(DxModel.class));
		if(list!=null && list.size()>0){
			return list.get(0);
		}
		return null;
	}

	@Override
	public List<DxModel> searchByParam(Map param) {
		// TODO Auto-generated method stub
		return null;
	}

}
