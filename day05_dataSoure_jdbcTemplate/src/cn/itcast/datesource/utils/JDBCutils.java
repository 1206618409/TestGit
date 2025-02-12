package cn.itcast.datesource.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * Druid连接池工具类
 */
public class JDBCutils {
    //1.定义成员变量 DataSource
    private static DataSource ds;

    static {


        try {
            //1.加载配置文件
            Properties pro = new Properties();
            pro.load(JDBCutils.class.getClassLoader().getResourceAsStream("druid.properties"));
            //2.获取DataSource

            ds = DruidDataSourceFactory.createDataSource(pro);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取连接
     */
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }

    /**
     * 释放资源
     **/
    public static void close(Statement stat, Connection conn) {

        /*if(stat!=null){
            try {
                stat.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            if (conn!=null){
                try {
                    conn.close();//归还连接池
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }*/
        close(null, stat, conn);
    }

    public static void close(ResultSet rs, Statement stat, Connection conn) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

            if (stat != null) {
                try {
                    stat.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                if (conn != null) {
                    try {
                        conn.close();//归还连接池
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

    }
    /**
     * 获取连接池方法
     */
    public static DataSource getDatSource(){
        return ds;
    }

}
