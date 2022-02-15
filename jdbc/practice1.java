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
public class practice1 {
    public static void main(String[] args)throws Exception{
        String url="jdbc:mysql://localhost:3306/student";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn=DriverManager.getConnection(url,"root","");
        if(conn!=null)
        {
            String sql="insert into stud values (11,'kil'),(56,'lop'),(89,'uiy')";
            PreparedStatement pstmt;
                    pstmt=conn.prepareStatement(sql);
            int  rows = pstmt.executeUpdate();
            System.out.println(rows);
            
        }
        
    }
}