package kr.co.ezenac.utilizeinterface.userinfo.dao.mssql;

import kr.co.ezenac.utilizeinterface.userinfo.UserInfoDTO;
import kr.co.ezenac.utilizeinterface.userinfo.dao.UserInfoDAO;

public class UserInfoMsSqlDAO implements UserInfoDAO{

	public void insertUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("insert into MsSql DB userId = " + userInfoDTO.getUserId());
	}

	public void updateUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("update into MsSql DB userId = " + userInfoDTO.getUserId());
	}

	public void deleteUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("delete into MsSql DB userId = " + userInfoDTO.getUserId());
	}

	public void selectUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("select into MsSql DB userId = " + userInfoDTO.getUserId());
	}

}
