/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Client_server_string_rev;
import java.util.*;
import java.net.*;
import java.io.*;
/**
 *
 * @author 91942
 */
public class Clientstr {
    public static void main(String[] args) throws Exception{
        Socket s = new Socket("localhost",2222);
        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        OutputStream os = s.getOutputStream();
        DataOutputStream dos= new DataOutputStream(os);
        
        Scanner sin = new Scanner(System.in);
        String str=sin.next();
        dos.writeUTF(str);
        System.out.println(dis.readUTF());
        dos.close();
        os.close();
        dis.close();
        is.close();
        s.close();
        
        
        
    }
    
}
