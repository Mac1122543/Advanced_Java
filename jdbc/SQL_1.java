/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JDBC;
import com.mysql.jdbc.*;
import java.sql.*;
//import com.mysql.jdbc.*;
/**
 *
 * @author 91942
 */
public class SQL_1 {
    
    public static void main(String[] args) throws Exception{
        String url="jdbc:mysql://localhost:3306/student";
        java.lang.Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn;
        conn=DriverManager.getConnection(url,"root","");
        if(conn!=null)
        {
            String sql="delete from stud1 where id=24"; 
            Statement stmt;
            stmt=conn.createStatement();
            
            
            

            boolean rows =stmt.execute(sql);
//            ResultSet rows1 = stmt.executeQuery(sql);
//            while(rows1.next())
//            {
//                System.out.println(rows1.getString(1));
//            }
            
            System.out.println(rows);
        }
        
        
    }
    

    
    
    
    
}
