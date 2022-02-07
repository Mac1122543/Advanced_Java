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
public class array_sum_udp_ser {
    public static void main(String[] args)throws Exception{
        DatagramSocket ds = new DatagramSocket(2222);
        byte rd[]=new byte[1024];
        DatagramPacket dp=new DatagramPacket(rd,rd.length);
        ds.receive(dp);
        String msg=new String(dp.getData());
//        msg=dp.getData();
        String s[]=msg.split(" ");
        int a[]=new int[1024];
        int sum=0;
        for(int i=0;i<s.length-1;i++)
        {
            a[i]=Integer.parseInt(s[i]);
            sum+=a[i];
            
        }
        
        System.out.println(sum);
        
        ds.close();
        
        
       
        
    }
}
