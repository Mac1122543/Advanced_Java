/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udp_array_sort;


import java.net.*;
import java.util.*;

/**
 *
 * @author 91942
 */
public class udp_array_sort_ser {
    
    public static void main(String[] args) throws  Exception{
        
        DatagramSocket ds = new DatagramSocket(2222);
        byte rd[]=new byte[1024];
        DatagramPacket dp= new DatagramPacket(rd,rd.length);
        ds.receive(dp);
        String msg= new String(dp.getData());
        String s[]=msg.split(" ");
        int a[]=new int[50];
        
//         for (int i=0;i<s.length-1;i++)
//        {
//            
//             System.out.println(s[i]);
//
//        }

//        
        for (int i=0;i<s.length-1;i++)
        {
            a[i]=Integer.parseInt(s[i]);
//             System.out.println(a[i]);

        }

        Arrays.sort(a);
        for (int j=0;j<a.length;j++)
        {
            System.out.println(a[j]);
            
        }
        
       
        
        ds.close();
        
        
    }
    
    
}
