package com.mackie.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BaseDAO<T> {

	@Autowired
	private SqlSession sqlSession;

	public Object queryOne(String sqlmapper, Object parameter) {
		return sqlSession.selectOne(sqlmapper, parameter);
	}
}
