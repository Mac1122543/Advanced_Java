/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Client_server_string_rev;
import java.util.*;
import java.io.*;
import java.net.*;

/**
 *
 * @author 91942
 */
public class Serverstr {
    public static void main(String[] args) throws Exception {
        
        ServerSocket ss = new ServerSocket(2222);
        while(true)
        {
            Socket s = ss.accept();
            InputStream is = s.getInputStream();
            DataInputStream dis= new DataInputStream(is);
            OutputStream os= s.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            
            String str1 = dis.readUTF();
            StringBuffer sb= new StringBuffer(str1);
            String str2=sb.reverse().toString();
            dos.writeUTF(str2);
            dos.close();
            os.close();
            is.close();
            dis.close();
            
            
        }
        
    }
    
}
