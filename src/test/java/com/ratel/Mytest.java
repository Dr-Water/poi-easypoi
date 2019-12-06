package com.ratel;

import org.junit.Test;

import java.sql.*;

/**
 * @业务描述：
 * @package_name： com.ratel
 * @project_name： poi-easypoi
 * @author： ratelfu@qq.com
 * @create_time： 2019-12-05 15:28
 * @copyright (c) ratelfu 版权所有
 */
public class Mytest {
    public static String username = "root";
    public static String password = "123456";
    public static String url = "jdbc:mysql://localhost:3306/localhost:3306/bpms-test";
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            t3();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void t3() throws SQLException {
        /**
        * 连接数据库的操作，用户名，密码，使用jdbc连接
        */
        String sqlCmd="SELECT * FROM bpms_customer_manage_formal";

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {

            conn = DriverManager.getConnection(url,username,password);

            stmt = conn.prepareStatement(sqlCmd, ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            stmt.setFetchSize(Integer.MIN_VALUE);

            rs = stmt.executeQuery();

            try {
                while(rs.next()){
                    try {
                        System.out.println("one:" + rs.getString(1) + "two:" + rs.getString(2) + "thrid:" + rs.getString(3));
                    } catch (SQLException e) {

                        e.printStackTrace();
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

        } finally {
             rs.close();
            stmt.close();
            conn.close();
        }
    }
}

