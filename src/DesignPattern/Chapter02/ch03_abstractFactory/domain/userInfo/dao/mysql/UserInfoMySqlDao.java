package DesignPattern.Chapter02.ch03_abstractFactory.domain.userInfo.dao.mysql;

import DesignPattern.Chapter02.ch03_abstractFactory.domain.userInfo.UserInfo;
import DesignPattern.Chapter02.ch03_abstractFactory.domain.userInfo.dao.UserInfoDao;

public class UserInfoMySqlDao implements UserInfoDao {
    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("insert into MYSQL DB userId = " + userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("update into MYSQL DB userId = " + userInfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("delete into MYSQL DB userId = " + userInfo.getUserId());
    }
}
