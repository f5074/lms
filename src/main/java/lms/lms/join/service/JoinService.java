package lms.lms.join.service;

import lms.lms.common.domain.User;

public interface JoinService {
	User duplCheck(User user);
	int joinUser(User user);

}
