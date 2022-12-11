package DesignPattern.Chapter02.ch03_abstractFactory.domain.userInfo.dao;

import DesignPattern.Chapter02.ch03_abstractFactory.domain.userInfo.UserInfo;

public interface UserInfoDao {

    void insertUserInfo(UserInfo userInfo);
    void updateUserInfo(UserInfo userInfo);
    void deleteUserInfo(UserInfo userInfo);
}
