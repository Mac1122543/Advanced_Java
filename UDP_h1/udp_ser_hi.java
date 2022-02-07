/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UDP_h1;
import java.net.*;
import java.io.*;


/**
 *
 * @author 91942
 */
public class udp_ser_hi {
    public static void main(String[] args)  throws Exception{
        
        DatagramSocket ds =new DatagramSocket(2222);
        
        
        byte rd[]=new byte[1024];
        
        DatagramPacket dp= new DatagramPacket(rd,rd.length);
        
        
        ds.receive(dp);
        
        String str=new String(dp.getData());
        
        System.out.println(str);
        ds.close();
        

        
        
    }
    
}
