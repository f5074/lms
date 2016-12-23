package lms.lms.login.dao.mapper;

import lms.lms.common.domain.User;

public interface LoginMapper {

	User loginCheck(User user);

}