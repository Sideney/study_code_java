package jmu.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
* TCP通信的客户端：向服务器发送链接请求，给服务器发送数据，读取服务器回写的数据
* 表示客户端的类：
*     java.net.Socket:此类实现了客户端套接字。套接字是两台机器间通信的断电。
*     套接字：包含了IP地址和端口号的网络单位。
*构造方法：
*      Socket(String host,int port) 创建一个流套接字并将其连接到指定主机上的指定端口号。
*      参数：
*          String host: 服务器主机的名称/服务器端ip地址
*          int port: 服务器的端口号
*      成员方法：
*          OutputStream	getOutputStream() 返回此套接字的输出流。
*
*      实现步骤：
*          1.创建一个客户端对象Socket，构造方法绑定服务器的ip地址和端口号
*          2.使用Socket对象中的方法getOutputStream()获取网络字节输出流OutputStream对象
*          3.使用网络字节输出流OutputStream()对象中的方法write，给服务器发送数据。
*          4.使用Socket对象中的方法getInputStream()获取网络字节输入流InputStream对象。
*          5.使用网络字节输入流InputStream对象中的方法read，读取服务器回写的数据。
*          6.释放资源(Socket)。
* */
public class TCPClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",8888);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("你好服务器".getBytes());
        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes,0,len));
        socket.close();

    }
}
