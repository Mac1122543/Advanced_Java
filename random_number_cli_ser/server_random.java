/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package random_number_cli_ser;

import java.net.*;
import java.io.*;
import java.util.*;

/**
 *
 * @author 91942
 */
public class server_random {
    public static void main(String[] args) throws Exception{
        
           ServerSocket ss = new ServerSocket(2222);
        while(true)
        {
            Socket s = ss.accept();
            Random r= new Random();
            int no=r.nextInt();
            OutputStream os =s.getOutputStream();
            DataOutputStream dos =new DataOutputStream(os);
            dos.writeInt(no);
            dos.close();
            os.close();
            s.close();
            
            
                   
                    
            
        }}
    
}
