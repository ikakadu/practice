package com.it.test;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.jupiter.api.Test;

//import org.junit.Test;

public class UserTest {

	private SqlSessionFactory sqlSessionFactory;

	@Before
	public void setUp() throws Exception {
		// 读取配置文件
		// 全局配置文件的路径
		String resource = "SqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);

		// 创建SqlSessionFactory
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}

	@Test
	public void testFindUserById() throws Exception {
		/*
		 * // 创建UserMapper对象 SqlSession sqlSession = sqlSessionFactory.openSession();
		 * 
		 * // 由mybatis通过sqlsession来创建代理对象 UserMapper mapper =
		 * sqlSession.getMapper(UserMapper.class);
		 * 
		 * User user = mapper.findUserById(1);
		 * 
		 * System.out.println(user);
		 * 
		 * sqlSession.close();
		 */

	}
}
