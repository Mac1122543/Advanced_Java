/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JDBC;
import com.mysql.jdbc.*;
//import com.mysql*;
import java.sql.*;
import java.util.*;

/**
 *
 * @author 91942
 */
public class practice_callable {
    public static void main(String[] args)throws Exception{
        String url="jdbc:mysql://localhost:3306/student";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn=DriverManager.getConnection(url,"root","");
        if(conn!=null)
        {
            
            CallableStatement clbstmt;
            clbstmt=conn.prepareCall("call PROD()");
            boolean bool = clbstmt.execute();
            System.out.println("rows affected"+bool);
           
        }
        
    }
}