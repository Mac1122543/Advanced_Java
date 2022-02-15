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
public class updatable_resultset {
    public static void main(String[] args) throws Exception {
        
        String url="jdbc:mysql://localhost:3306/student";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn;
         conn=DriverManager.getConnection(url,"root","");
        if(conn!=null)
        {
            String sql="select * from stud1";
            Statement stmt=conn.createStatement(1005,1008);
            ResultSet rs=stmt.executeQuery(sql);
            
            while(rs.next())
            {
                rs.updateInt(2,rs.getInt("id")+1);
                rs.updateRow();
                System.out.println(rs.getInt("id"));
            }
            
            
        }
        
        
    }
    
}
