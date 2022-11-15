package kr.co.ezenac.utilizeinterface.userinfo.dao.mysql;

import kr.co.ezenac.utilizeinterface.userinfo.UserInfoDTO;
import kr.co.ezenac.utilizeinterface.userinfo.dao.UserInfoDAO;

public class UserInfoMySqlBAO implements UserInfoDAO{

	public void insertUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("insert into MySql DB userId = " + userInfoDTO.getUserId());
	}

	public void updateUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("update into MySql DB userId = " + userInfoDTO.getUserId());
	}

	public void deleteUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("delete into MySql DB userId = " + userInfoDTO.getUserId());
	}

	public void selectUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("select into MySql DB userId = " + userInfoDTO.getUserId());
	}

}
