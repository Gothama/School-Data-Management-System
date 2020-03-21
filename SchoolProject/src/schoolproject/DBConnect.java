/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolproject;


import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class DBConnect extends DBConfig{
    Connection conn = null;
    public Connection getConnection() throws SQLException{
        conn = (Connection) DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
        System.out.println("Connected!");
        return conn;
    }
    public void closeConnection() throws SQLException {
        if(conn != null){
            conn.close();
        }
    }
}
