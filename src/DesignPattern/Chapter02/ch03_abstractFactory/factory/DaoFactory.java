package DesignPattern.Chapter02.ch03_abstractFactory.factory;

import DesignPattern.Chapter02.ch03_abstractFactory.domain.product.dao.ProductDao;
import DesignPattern.Chapter02.ch03_abstractFactory.domain.userInfo.dao.UserInfoDao;

public abstract class DaoFactory {

    public abstract UserInfoDao createUserInfoDao();
    public abstract ProductDao createProductDao();
}
