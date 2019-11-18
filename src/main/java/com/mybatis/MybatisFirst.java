package com.mybatis;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;


public class MybatisFirst {

	@Test
	public void find() throws IOException {
		//读取配置文件
				//全局配置文件的路径
				String resource = "mybatis.xml";
				InputStream inputStream = Resources.getResourceAsStream(resource);
				
				//创建SqlSessionFactory
				SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
				
				//创建SqlSession
				SqlSession sqlSession = sqlSessionFactory.openSession();
				
				//调用SqlSession的增删改查方法
				//第一个参数：表示statement的唯一标示
				UserDTO user = sqlSession.selectOne("test.findUserById", "1");
				System.out.println(user);
				
				//关闭资源
				sqlSession.close();
	}
	
	@Test
	public void find1() throws Exception {
		//读取配置文件
				//全局配置文件的路径
				String resource = "mybatis.xml";
				InputStream inputStream = Resources.getResourceAsStream(resource);
				
				//创建SqlSessionFactory
				SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
				
				//创建SqlSession
				SqlSession sqlSession = sqlSessionFactory.openSession();
				
				//调用SqlSession的增删改查方法
				UserMapper mapper = sqlSession.getMapper(UserMapper.class);
				UserDTO user = mapper.findUserById("1");
				System.out.println(user);
				
				//关闭资源
				sqlSession.close();
	}
}
