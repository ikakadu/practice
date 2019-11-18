package com.mybatis;


public interface UserMapper {
	
	public UserDTO findUserById(String id)throws Exception;
}
