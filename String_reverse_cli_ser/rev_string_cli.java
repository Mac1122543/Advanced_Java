/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String_reverse_cli_ser;

import java.util.*;
import java.io.*;
import java.net.*;

/**
 *
 * @author 91942
 */
public class rev_string_cli {
    public static void main(String[] args) throws Exception{
        
       
        
        Socket s = new Socket("localhost",2222);
         InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        
         Scanner sin= new Scanner(System.in);
        
//         LOGIC
        String str=sin.next();
        
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
