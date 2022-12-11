package DesignPattern.Chapter02.ch03_abstractFactory.domain.userInfo.web;

import DesignPattern.Chapter02.ch03_abstractFactory.domain.product.Product;
import DesignPattern.Chapter02.ch03_abstractFactory.domain.product.dao.ProductDao;
import DesignPattern.Chapter02.ch03_abstractFactory.domain.userInfo.UserInfo;
import DesignPattern.Chapter02.ch03_abstractFactory.domain.userInfo.dao.UserInfoDao;
import DesignPattern.Chapter02.ch03_abstractFactory.factory.DaoFactory;
import DesignPattern.Chapter02.ch03_abstractFactory.factory.MySqlDaoFactory;
import DesignPattern.Chapter02.ch03_abstractFactory.factory.OracleDaoFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UserInfoClient {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("db.properties");

        Properties prop = new Properties();
        prop.load(fis);

        String dbType = prop.getProperty("DBTYPE");

        UserInfo userInfo = new UserInfo();
        userInfo.setUserId("12345");
        userInfo.setPassword("!@#$%");
        userInfo.setUserName("nayeon");

        Product product = new Product();
        product.setProductId("0011AA");
        product.setProductName("TV");

        DaoFactory daoFactory = null;
        UserInfoDao userInfoDao = null;
        ProductDao productDao = null;

        if(dbType.equals("ORACLE")){
            daoFactory = new OracleDaoFactory();
        }
        else if(dbType.endsWith("MYSQL")){
            daoFactory = new MySqlDaoFactory();
        }
        else {
            System.out.println("db support error");
            return;
        }

        userInfoDao = daoFactory.createUserInfoDao();
        productDao = daoFactory.createProductDao();

        System.out.println("==USERINFO TRANSACTION==");
        userInfoDao.insertUserInfo(userInfo);
        userInfoDao.updateUserInfo(userInfo);
        userInfoDao.deleteUserInfo(userInfo);

        System.out.println("==PRODUCT TRANSATION==");
        productDao.insertProduct(product);
        productDao.updateProduct(product);
        productDao.deleteProduct(product);

    }
}
