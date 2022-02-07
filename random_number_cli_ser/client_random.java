/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package random_number_cli_ser;
import java.io.*;
import java.util.*;
import java.net.*;

/**
 *
 * @author 91942
 */
public class client_random {
    
    public static void main(String[] args) throws Exception{
        
        Socket s = new Socket ("localhost",2222);
        
        InputStream is=s.getInputStream();
         DataInputStream dis = new DataInputStream(is);
         
         System.out.println(dis.readInt());
         dis.close();
         is.close();
         s.close();
        
        
    }
        
    }
    

