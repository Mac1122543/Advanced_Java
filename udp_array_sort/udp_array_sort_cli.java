/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udp_array_sort;

import java.net.*;



/**
 *
 * @author 91942
 */
public class udp_array_sort_cli {
   public static void main(String[] args) throws  Exception{
        
        DatagramSocket ds = new DatagramSocket();
        
        byte sd[]=new byte[1024];
        
        String str="12 56 45 63 89 78 2 1 ";
        
        sd=str.getBytes();
        
        InetAddress i =InetAddress.getLocalHost();
        
        DatagramPacket dp = new DatagramPacket(sd,sd.length,i,2222);
        ds.send(dp);
        ds.close();
        
        
    }
    
}
