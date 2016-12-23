package lms.lms.login.dao;

import lms.lms.common.domain.User;

public interface UserDao {
	User loginCheck(User user);
}
