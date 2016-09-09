package com.mackie.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BaseDAO<T> {

	@Autowired
	private SqlSession sqlSession;

	public T queryOne(String sqlmapper, Object parameter) {
		return sqlSession.selectOne(sqlmapper, parameter);
	}
	
	public int addUser(String sqlmapper, T parameter) {
		return sqlSession.insert(sqlmapper, parameter);
	}
	
	public int updateUser(String sqlmapper, T parameter) {
		return sqlSession.update(sqlmapper, parameter);
	}
	
	public int deleteUser(String sqlmapper, Object parameter) {
		return sqlSession.delete(sqlmapper, parameter);
	}
}
