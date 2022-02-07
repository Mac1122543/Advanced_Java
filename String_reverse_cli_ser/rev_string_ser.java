/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String_reverse_cli_ser;

import java.io.*;
import java.net.*;

/**
 *
 * @author 91942
 */
public class rev_string_ser {
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
        
        String str1 = dis.readUTF();
        StringBuffer sb= new StringBuffer(str1);
        String str2 = sb.reverse().toString();

        dos.writeUTF(str2);
        
        
//        LOGIC
        
        is.close();
        dis.close();
        os.close();
        dos.close();
        s.close();
        
        
        
       
                
        
    }
        
    }
   
    
}
