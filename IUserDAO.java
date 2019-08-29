package com.mapper;

import java.io.IOException;
import java.util.List;

import com.pojo.User;

public interface IUserDAO {
	public List<User> selectAll() throws IOException;
	
}
