package com.brotherc.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import com.brotherc.demo.model.User;

@Mapper
public interface UserMapper {
	public List<User>  selectUsers();
}
