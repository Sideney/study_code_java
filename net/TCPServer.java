package jmu.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
*     TCP通信的服务器端：接收客户端的请求，读取客户端发送的数据，给客户端回写信息。
*     表示服务器端类：
*          java.net.ServerSocket:此类实现服务器套接字。
*
*     构造方法：
*          ServerSocket(int port) 创建绑定到特定端口的服务器套接字。
*
*     服务器端必须明确一件事，必须知道是哪个客户端请求的服务器
*     所以可以使用accept()方法获取到请求的客户端对象socket
*     成员方法：
*          Socket accept() 侦听并接受此套接字的连接。
*
*     服务器的实现步骤：
*          1.创建服务器ServerSocket对象和系统指定的端口号
*          2.使用accept()方法获取到请求客户端对象socket
*          3.使用Socket对象中的方法getInputStream()获取网络字节输入流InputStream对象。
*          4.使用网络字节输入流InputStream对象中的方法read,读取客户端发送到数据。
*          5.使用socket对象中的方法getOutputStream()获取网络字节输出流OutputStream对象。
*          6.使用网络字节输出流对象中的write方法,给客户端回写信息。
*          7.释放资源(Socket,ServerSocket)
* */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket accept = serverSocket.accept();
        InputStream inputStream = accept.getInputStream();
        byte[] bytes = new byte[1024];
        int len = inputStream.read(bytes);
        System.out.println(new String(bytes,0,len));
        OutputStream outputStream = accept.getOutputStream();
        outputStream.write("收到谢谢".getBytes());
        accept.close();
        serverSocket.close();
    }
}
