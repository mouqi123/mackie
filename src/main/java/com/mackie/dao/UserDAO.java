package com.mackie.dao;

import org.springframework.stereotype.Repository;

import com.mackie.domain.UserDO;

@Repository
public class UserDAO extends BaseDAO<UserDO> {
	
	public UserDO queryOne(UserDO parameter) {
		return super.queryOne("user.selectUserOne", parameter);
	}
	
	public UserDO queryById(int id) {
		return super.queryOne("user.selectUserById", id);
	}
	
	public UserDO queryByPhoneNumber(String phoneNumber) {
		return super.queryOne("user.selectUserByPhoneNumber", phoneNumber);
	}
	
	public int addUser(UserDO parameter) {
		return super.addUser("user.addUser", parameter);
	}
	
	public int updateUser(UserDO parameter) {
		return super.updateUser("user.updateUser", parameter);
	}
	
	public int deleteUser(Object parameter) {
		return super.deleteUser("user.deleteUser", parameter);
	}
}
