package com.lms.join.dao.mapper;

import com.lms.domain.User;

public interface JoinMapper {	
	
	User duplCheck(User user);
	
	int joinUser(User user);

}
