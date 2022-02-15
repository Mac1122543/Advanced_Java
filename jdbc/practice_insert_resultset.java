package JDBC;
import com.mysql.jdbc.*;
//import com.mysql*;
import java.sql.*;
import java.util.*;

/**
 *
 * @author 91942
 */
public class  practice_insert_resultset {
    public static void main(String[] args)throws Exception{
        String url="jdbc:mysql://localhost:3306/student";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn=DriverManager.getConnection(url,"root","");
        if(conn!=null)
        {
            String sql="insert into emp1 (?,?,?,?,?,?)";
            
            PreparedStatement pstmt=conn.prepareStatement(sql);
            Scanner sin=new Scanner(System.in);
            
            System.out.println("enter name");
            String n1=sin.next();
            pstmt.setString(1,n1);
            
            System.out.println("birthdate");
            String n2=sin.next();
            pstmt.setString(2,n2);
            
            System.out.println("enter gender");
            String n3=sin.next();
            pstmt.setString(3,n3);
            
            System.out.println("enter address");
            String n4=sin.next();
            pstmt.setString(4,n4);
            
            System.out.println("Enter email");
            String n5=sin.next();
            pstmt.setString(5,n5);
            
            System.out.println("enter phone");
            String n6=sin.next();
            pstmt.setString(6,n6);
            
            int rows = pstmt.executeUpdate();
            System.out.println("no. of rows affected"+rows);
            
            
            
            ResultSet rs=pstmt.executeQuery(sql);
            
            while(rs.next())
            {
                System.out.println(rs.getString(n1));
                System.out.println(rs.getString(n2));
                System.out.println(rs.getString(n3));
                System.out.println(rs.getString(n4));
                System.out.println(rs.getString(n5));
                System.out.println(rs.getInt(n6));
            }
            
            
           
                
            
            
           
           
        }
        
    }
}