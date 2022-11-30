package Part_02.Chapter_03.ch13.domain.userInfo.dao;

import Part_02.Chapter_03.ch13.domain.userInfo.UserInfo;

public interface UserInfoDao {

    void insertUserInfo(UserInfo userInfo);
    void updateUserInfo(UserInfo userInfo);
    void deleteUserInfo(UserInfo userInfo);
}
