package com.service.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mapper.IUserDAO;
import com.pojo.User;

public class UserServiceImpl implements IUserDAO {
	
	private SqlSessionFactory build;
	private SqlSession session;
	
	public List<User> selectAll() throws IOException{
		InputStream is =Resources.getResourceAsStream("mybatis-config.xml");
		build = new SqlSessionFactoryBuilder().build(is);
		session=build.openSession();
		List<User> users=session.selectList("com.mapper.UserMapper.SelectAll");
		
		for(User u: users) {
			System.out.println(u);
		}
		return null;
	}
}
