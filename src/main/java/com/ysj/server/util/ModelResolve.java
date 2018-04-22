package com.ysj.server.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import com.ysj.server.model.ColumnModel;
import com.ysj.server.model.DxModel;

public class ModelResolve {
	private static final Logger logger = LoggerFactory.getLogger(ModelResolve.class);
	public boolean executeDDL(DxModel m) {
		if (StringUtils.isEmpty(m.getId())) {
			logger.error("Error:对象ID不存在！");
			return false;
		}
		if (m.getDataState() == ModelConstr.DB_DATA_STATUS_ADD) {
			createTable(m);
		} else if (m.getDataState() == ModelConstr.DB_DATA_STATUS_UPDATE) {
			alertTable(m);
		}
		return true;
	}

	private void alertTable(DxModel m) {
		// TODO Auto-generated method stub
		StringBuffer sql = new StringBuffer();
		StringBuffer columnSql = new StringBuffer();
		for (ColumnModel c : m.getPropers()) {
			if (c.getDataState() == ModelConstr.DB_DATA_STATUS_ADD) {
				if (c.getDbLength() > 0) {
					if (c.getDbPrecision() > 0) {
						columnSql.append(" ADD COLUMN ").append(
								c.getDbName() + " " + c.getDbType() + "("
										+ c.getDbLength() + ","
										+ c.getDbPrecision() + "),");
					} else {
						columnSql.append(" ADD COLUMN ").append(
								c.getDbName() + " " + c.getDbType() + "("
										+ c.getDbLength() + "),");
					}
				} else {
					columnSql.append(" ADD COLUMN ").append(
							c.getDbName() + " " + c.getDbType() + ",");
				}
			}
		}
		if (columnSql.length() > 0) {
			sql.append("ALTER TABLE ");
			sql.append(" XTDX" + m.getId());
			sql.append(columnSql.substring(0, columnSql.length() - 1));

		} else {
			System.out.println("Info：不存新增属性。");
		}
	}

	private void createTable(DxModel m) {
		// TODO Auto-generated method stub
		StringBuffer sql = new StringBuffer();
		StringBuffer columnSql = new StringBuffer();
		for (ColumnModel c : m.getPropers()) {
			if (c.getDbLength() > 0) {
				if (c.getDbPrecision() > 0) {
					columnSql
							.append(c.getDbName() + " " + c.getDbType() + "("
									+ c.getDbLength() + ","
									+ c.getDbPrecision() + "),");
				} else {
					columnSql.append(c.getDbName() + " " + c.getDbType() + "("
							+ c.getDbLength() + "),");
				}
			} else {
				columnSql.append(c.getDbName() + " " + c.getDbType() + ",");
			}
		}
		if (columnSql.length() > 0) {
			sql.append("CREATE TABLE ");
			sql.append(" XTDX" + m.getId());
			sql.append(" (");
			sql.append(columnSql.substring(0, columnSql.length() - 1));
			sql.append(")");

		} else {
			System.out.println("Error：不存在建表属性。");
		}

	}
}
