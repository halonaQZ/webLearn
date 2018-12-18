package com.lun.sxt.web;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class test {
    public static void main(String args[])throws Exception{
        Socket s = new Socket("127.0.0.1",8080);
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
        pw.print("get/http/1.1");
        pw.print("host:localhost");
        pw.print("Content-Type:text/html");
        pw.println();
        pw.flush();
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String str="";
        while((str=br.readLine())!=null){
            System.out.println(str);
        }

        br.close();
        pw.close();
        s.close();
    }
}
