package lms.lms.login.dao.mapper;

import lms.lms.common.domain.User;

public interface UserMapper {

	User loginCheck(User user);

}