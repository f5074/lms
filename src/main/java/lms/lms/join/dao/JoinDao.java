package lms.lms.join.dao;

import lms.lms.common.domain.User;

public interface JoinDao {
	User duplCheck(User user);
	int joinUser(User user);

}
