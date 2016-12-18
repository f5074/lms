package com.lms.join.service;

import com.lms.domain.User;

public interface JoinService {
	User duplCheck(User user);
	int joinUser(User user);

}
