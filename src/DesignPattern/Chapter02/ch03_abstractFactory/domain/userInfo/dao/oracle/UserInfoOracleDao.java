package DesignPattern.Chapter02.ch03_abstractFactory.domain.userInfo.dao.oracle;

import DesignPattern.Chapter02.ch03_abstractFactory.domain.userInfo.UserInfo;
import DesignPattern.Chapter02.ch03_abstractFactory.domain.userInfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao {
    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("insert into ORACLE DB userId = " + userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("update into ORACLE DB userId = " + userInfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("delete into ORACLE DB userId = " + userInfo.getUserId());

    }
}
