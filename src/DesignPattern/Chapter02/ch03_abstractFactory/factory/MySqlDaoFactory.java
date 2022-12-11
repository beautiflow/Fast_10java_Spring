package DesignPattern.Chapter02.ch03_abstractFactory.factory;

import DesignPattern.Chapter02.ch03_abstractFactory.domain.product.dao.ProductDao;
import DesignPattern.Chapter02.ch03_abstractFactory.domain.product.dao.mysql.ProductMySqlDao;
import DesignPattern.Chapter02.ch03_abstractFactory.domain.userInfo.dao.UserInfoDao;
import DesignPattern.Chapter02.ch03_abstractFactory.domain.userInfo.dao.mysql.UserInfoMySqlDao;

public class MySqlDaoFactory extends DaoFactory{
    @Override
    public UserInfoDao createUserInfoDao() {
        return new UserInfoMySqlDao();
    }

    @Override
    public ProductDao createProductDao() {
        return new ProductMySqlDao();
    }
}
