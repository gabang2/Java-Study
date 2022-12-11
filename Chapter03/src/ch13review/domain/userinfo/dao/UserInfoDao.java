package ch13review.domain.userinfo.dao;

import ch13review.domain.userinfo.UserInfo;

public interface UserInfoDao {
	UserInfo insertUserInfo(UserInfo userInfo);
	UserInfo updateUserInfo(UserInfo userInfo);
	UserInfo deleteUserInfo(UserInfo userInfo);
}
