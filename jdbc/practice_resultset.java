package JDBC;
import com.mysql.jdbc.*;
//import com.mysql*;
import java.sql.*;
import java.util.*;

/**
 *
 * @author 91942
 */
public class  practice_resultset {
    public static void main(String[] args)throws Exception{
        String url="jdbc:mysql://localhost:3306/student";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn=DriverManager.getConnection(url,"root","");
        if(conn!=null)
        {
            String sql="select * from emp ";
            Statement stmt=conn.createStatement(1005,1008);
            ResultSet rs;
            rs = stmt.executeQuery(sql);
            
            while(rs.next())
            {
                if(rs.getInt("age")>=40)
                    
                {
                rs.updateInt(2, rs.getInt("basic")+500);
                rs.updateRow();
                
                System.out.println(rs.getString("name"));
                
                
                System.out.println(rs.getInt("basic"));
                System.out.println(rs.getInt("age"));
                
                System.out.println(" ");
                
                
                }
                
            }
            
           
           
        }
        
    }
}