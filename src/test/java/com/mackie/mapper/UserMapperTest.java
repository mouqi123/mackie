package com.mackie.mapper;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mackie.domain.UserDO;

public class UserMapperTest {
	public static void main(String[] args) throws Exception{
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory= new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = sqlSessionFactory.openSession();
		UserDO user;
		try {
			  user = (UserDO) session.selectOne("user.selectUserById", 1);
			} finally {
			  session.close();
			}
		System.out.println(user);
	}
}
