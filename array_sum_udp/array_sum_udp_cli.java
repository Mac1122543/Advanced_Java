/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array_sum_udp;
import java.net.*;
import java.util.*;

/**
 *
 * @author 91942
 */
public class array_sum_udp_cli {
    public static void main(String[] args)throws Exception{
        DatagramSocket ds = new DatagramSocket();
        byte sd[]= new byte[1024];
        String str="1 2 3 45 56 89 87 52 32 21 54 69 87 89 56 45 77 88 74 ";
        sd=str.getBytes();
        InetAddress i=InetAddress.getLocalHost();
        DatagramPacket dp=new DatagramPacket(sd,sd.length,i,2222);
        ds.send(dp);
        ds.close();
        
        
    }
    
}
