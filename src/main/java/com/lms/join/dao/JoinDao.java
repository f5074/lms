package com.lms.join.dao;

import com.lms.domain.User;

public interface JoinDao {
	User duplCheck(User user);
	int joinUser(User user);

}
