/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TOWEL_CASE_CLI_SER;

import java.util.*;
import java.net.*;
import java.io.*;

/**
 *
 * @author 91942
 */
public class towel_cli {
    
    
     public static void main(String[] args) throws Exception{
        
       
        
        Socket s = new Socket("localhost",2222);
         InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        
         Scanner sin= new Scanner(System.in);
        
//         LOGIC
       String str = sin.next();
       
       dos.writeUTF(str);
         System.out.println(dis.readUTF());
       
        
//        LOGIC
        
        
        
        is.close();
        dis.close();
        os.close();
        dos.close();
        s.close();
        
    }
    
}
