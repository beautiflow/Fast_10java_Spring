package DesignPattern.Chapter02.ch03_abstractFactory.factory;

import DesignPattern.Chapter02.ch03_abstractFactory.domain.product.dao.ProductDao;
import DesignPattern.Chapter02.ch03_abstractFactory.domain.product.dao.oracle.ProductOracleDao;
import DesignPattern.Chapter02.ch03_abstractFactory.domain.userInfo.dao.UserInfoDao;
import DesignPattern.Chapter02.ch03_abstractFactory.domain.userInfo.dao.oracle.UserInfoOracleDao;

public class OracleDaoFactory extends DaoFactory{
    @Override
    public UserInfoDao createUserInfoDao() {
        return new UserInfoOracleDao();
    }

    @Override
    public ProductDao createProductDao() {
        return new ProductOracleDao();
    }
}
