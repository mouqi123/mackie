package com.mackie.userMapper;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mackie.domain.UserDO;

public class UserMapperTest {
	public static void main(String[] args) throws Exception{
		//System.setProperty("catalina.home", "/home/mackie/apache-tomcat-8.0.36");
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory= new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = sqlSessionFactory.openSession();
		UserDO user1;
		UserDO user2;
		UserDO user3 = new UserDO();
		user3.setUserId(1);
		try {
			  user1 = (UserDO) session.selectOne("user.selectUserById", 2);
			  user2 = (UserDO) session.selectOne("user.selectUserByPhoneNumber","18610947048");
			  user3 = (UserDO) session.selectOne("user.selectUserOne",user3);
			} finally {
			  session.close();
			}
		System.out.println(user1);
		System.out.println(user2);
		System.out.println(user3);
	}
}
