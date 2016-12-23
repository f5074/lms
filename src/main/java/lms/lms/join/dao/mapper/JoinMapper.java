package lms.lms.join.dao.mapper;

import lms.lms.common.domain.User;

public interface JoinMapper {	
	
	User duplCheck(User user);
	
	int joinUser(User user);

}
