package ch13review.domain.userinfo.dao.oracle;

import ch13review.domain.userinfo.UserInfo;
import ch13review.domain.userinfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao{

	@Override
	public UserInfo insertUserInfo(UserInfo userInfo) {
		System.out.println("Oracle Insert" + userInfo.getUserName());
		return null;
	}

	@Override
	public UserInfo updateUserInfo(UserInfo userInfo) {
		System.out.println("Oracle Update" + userInfo.getUserName());
		return null;
	}

	@Override
	public UserInfo deleteUserInfo(UserInfo userInfo) {
		System.out.println("Oracle Delte" + userInfo.getUserName());
		return null;
	}

}
