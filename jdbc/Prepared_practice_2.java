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
public class Prepared_practice_2 {
    public static void main(String[] args)throws Exception{
        String url="jdbc:mysql://localhost:3306/student";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn=DriverManager.getConnection(url,"root","");
        if(conn!=null)
        {
            String sql="insert into studprep values (?,?,?)";
            PreparedStatement pstmt;
                    pstmt=conn.prepareStatement(sql);
           Scanner sin= new Scanner(System.in);
            
           int i=0;
           while(i<=1)
           {
               System.out.println("enter name");
            String n1=sin.next();
            pstmt.setString(1, n1);
            
            
            System.out.println("enter rollno");
            int n=sin.nextInt();
           pstmt.setInt(2,n);
           
            System.out.println("enter Branchfield");
            String n3=sin.next();
            pstmt.setString(3, n3);
            
           
           
           
            int rows=pstmt.executeUpdate();
            System.out.println("number of rows affected"+rows);
            
               i++;
               
           }
            
            
        }
        
    }
}