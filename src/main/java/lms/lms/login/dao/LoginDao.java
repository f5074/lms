package lms.lms.login.dao;

import lms.lms.common.domain.User;

public interface LoginDao {
	User loginCheck(User user);
}
