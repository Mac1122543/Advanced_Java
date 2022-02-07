/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UDP_h1;
import java.util.*;
import java.net.*;


/**
 *
 * @author 91942
 */
public class udp_cli_hi {
      public static void main(String[] args)throws Exception{
          DatagramSocket ds = new DatagramSocket();
          byte sd[]=new byte[1024];
          
//          LOGIC
          String str="hello";
//          LOGIC
          sd=str.getBytes();
          InetAddress i =  InetAddress.getLocalHost();
          DatagramPacket dp= new DatagramPacket(sd,sd.length,i,2222);
          ds.send(dp);
          
          ds.close();
          
          
          
        
    }
    
}
