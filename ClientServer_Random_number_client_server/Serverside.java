package ClientServer_Random_number_client_server;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.net.*;
import java.util.*;
import java.io.*;
/**
 *
 * @author 91942
 */
public class Serverside {
    
    public static void main(String[] args) throws Exception{
        
        ServerSocket ss = new ServerSocket(2222);
        while(true)
        {
            Socket s= ss.accept();
            Random r = new Random();
            int no = r.nextInt();
            OutputStream os = s.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            dos.writeInt(no);
            dos.close();
            os.close();
            s.close();
                    
        }
        
    }
    
}
