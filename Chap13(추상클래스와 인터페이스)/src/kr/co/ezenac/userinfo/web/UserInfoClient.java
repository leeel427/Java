package kr.co.ezenac.userinfo.web;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import kr.co.ezenac.utilizeinterface.userinfo.UserInfoDTO;
import kr.co.ezenac.utilizeinterface.userinfo.dao.UserInfoDAO;
import kr.co.ezenac.utilizeinterface.userinfo.dao.mssql.UserInfoMsSqlDAO;
import kr.co.ezenac.utilizeinterface.userinfo.dao.mysql.UserInfoMySqlBAO;
import kr.co.ezenac.utilizeinterface.userinfo.dao.oracle.UserInfoOracleDAO;

public class UserInfoClient {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("db.properties");
		
		Properties prop = new Properties();
		prop.load(fis);
		String dbType = prop.getProperty("DBTYPE");
		
		UserInfoDTO userInfo = new UserInfoDTO();
		userInfo.setUserId("ezen");
		userInfo.setPasswd("0111");
		userInfo.setUserName("이젠");
		
		UserInfoDAO userInfoDAO = null;
		if (dbType.equals("ORACLE")) {
			userInfoDAO = new UserInfoOracleDAO();
			}
		else if (dbType.equals("MYSQL")) {
			userInfoDAO = new UserInfoMySqlBAO();
		}
		else if (dbType.equals("MSSQL")) {
			userInfoDAO = new UserInfoMsSqlDAO();
		}
		else {
			System.out.println("db support error");
			return;
		}
		
		userInfoDAO.insertUserInfo(userInfo);
		userInfoDAO.updateUserInfo(userInfo);
		userInfoDAO.selectUserInfo(userInfo);
		userInfoDAO.deleteUserInfo(userInfo);
		
	}

}
