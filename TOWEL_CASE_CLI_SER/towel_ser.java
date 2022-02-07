/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TOWEL_CASE_CLI_SER;

import java.io.*;
//import java.io.OutputStream;
import java.net.*;
import java.net.Socket;

/**
 *
 * @author 91942
 */
public class towel_ser {
    
    
      public static void main(String[] args)throws Exception {
        
         ServerSocket ss = new ServerSocket(2222);
    
    while(true)
    {
        Socket s = ss.accept();
                
        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        
        
        
//        LOGIC
        
       String str= dis.readUTF();
       String fs="";
       
       for (int i=0;i<str.length();i++)
       {
           if(Character.isUpperCase(str.charAt(i)))
           {
               fs=fs+String.valueOf(Character.toLowerCase(str.charAt(i)));
           
           }
           else
           {
               fs+=String.valueOf(Character.toUpperCase(str.charAt(i)));
           }
               
       }
       
       StringBuffer sb= new StringBuffer(fs);
       String rev=sb.reverse().toString();
       
       
       dos.writeUTF(rev);
        
//        LOGIC
        
        is.close();
        dis.close();
        os.close();
        dos.close();
        s.close();
        
        
        
       
                
        
    }
        
    }
   
    
}
