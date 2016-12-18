package com.lms.login.dao;

import com.lms.domain.User;

public interface UserDao {
	User loginCheck(User user);
}
