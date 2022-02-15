/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JDBC;
import com.mysql.jdbc.*;
//import com.mysql*;
import java.sql.*;

/**
 *
 * @author 91942
 */
public class Metatdata_jdbc {
    public static void main(String[] args) throws Exception {
        
        String url="jdbc:mysql://localhost:3306/student";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn;
         conn=DriverManager.getConnection(url,"root","");
        if(conn!=null)
        {
           String sql="select * from stud";
           Statement stmt=conn.createStatement();
           ResultSet rs= stmt.executeQuery(sql);
           
           ResultSetMetaData rsmd;
           rsmd=rs.getMetaData();
           
            System.out.println(rsmd.getTableName(2));
            System.out.println(rsmd.getClass());
            System.out.println(rsmd.getColumnCount());
            System.out.println(rsmd.getColumnType(2));
            System.out.println(rsmd.getColumnType(1));
            System.out.println(rsmd.getColumnLabel(1));
            System.out.println(rsmd.getColumnClassName(1));
            
           
            
        }
        
        
    }
    
}
