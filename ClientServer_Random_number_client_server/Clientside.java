/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClientServer_Random_number_client_server;
import java.net.*;
import java.util.*;
import java.io.*;

/**
 *
 * @author 91942
 */
public class Clientside {
    public static void main(String[] args) throws Exception{
        
        Socket s = new Socket("localhost",2222);
        InputStream is = s.getInputStream();
        DataInputStream dis= new DataInputStream(is);
        System.out.println(dis.readInt());
        is.close();
        dis.close();
        s.close();
        
    }
    
}
