package com.example.demo;

import java.sql.*;

public class TestClickhouse {
    public static void test() throws ClassNotFoundException, SQLException {
        Class.forName("com.github.housepower.jdbc.ClickHouseDriver");
        Connection connection = DriverManager.getConnection("jdbc:clickhouse://192.168.46.128:9000");

        Statement statement = connection.createStatement();

        String sql = "select * from default.jdbc_example";
        ResultSet rs = statement.executeQuery(sql);

        while (rs.next()) {
            // ResultSet 的下标值从 1 开始，不可使用 0，否则越界，报 ArrayIndexOutOfBoundsException 异常
            System.out.println(rs.getDate(1) + ", " + rs.getString(2) + ", " + rs.getInt(3));
        }
        System.out.println("查询完成!!!");
    }

    public static void test_Drop() throws ClassNotFoundException, SQLException {
        Class.forName("com.github.housepower.jdbc.ClickHouseDriver");
        Connection connection = DriverManager.getConnection("jdbc:clickhouse://192.168.46.128:9000");

        Statement statement = connection.createStatement();
        statement.executeQuery("drop table default.jdbc_example");
        System.out.println("删除成功！！！");
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        Class.forName("com.github.housepower.jdbc.ClickHouseDriver");
//        Connection connection = DriverManager.getConnection("jdbc:clickhouse://192.168.46.128:9000");
//
//        Statement statement = connection.createStatement();
////        statement.executeQuery("create table default.jdbc_example(day Date, name String, age UInt8) Engine=Log");
//
//        PreparedStatement pstmt = connection.prepareStatement("insert into default.jdbc_example values(?, ?, ?)");
//        for (int i = 0; i < 10; i++) {
//            pstmt.setDate(1, new Date(System.currentTimeMillis()));
//            pstmt.setString(2, "panda_" + (i + 1));
//            pstmt.setInt(3, 18);
//            pstmt.addBatch();
//        }
//        pstmt.executeBatch();
//
//        //System.out.println("连接成功!!!");
//        System.out.println("添加成功!!!");
        //test();
        //test_Drop();
    }

}
