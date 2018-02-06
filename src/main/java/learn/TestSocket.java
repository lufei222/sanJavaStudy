package learn;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TestSocket {

        public static void main(String[] args) {
            Test1 t=new Test1();
            t.start();   //启动线程
        }

    /**
     * 继承一个线程类
     * @author Administrator
     *
     */
    static class Test1 extends Thread{
        private ServerSocket server = null;
        public Test1(){
            new Socket();
            try {
                server=new ServerSocket(3333);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                System.out.println("服务端初始化scoket失败！");
            }
        }
        /**
         * 继承父类方法
         */
        public void run(){
            Socket clientSocket = null;
            DataInputStream dis =null;
            DataOutputStream dos=null;
            String str="";
            while(true){
                try {
                    clientSocket=server.accept();
                    dis = new DataInputStream(clientSocket.getInputStream());//获取输入流，用于接收客户端发送来的数据
                    dos = new DataOutputStream(clientSocket.getOutputStream());//获取输出流，用于客户端向服务器端发送数据
                    str=dis.readUTF();  //这里是客户端发送来的数据
                    /*
                     * 这里边你就可以做你想操作的事情了
                     */
                    dos.writeUTF("这里是返回到客户端的数据");//这里用来向客户端返回数据
                    dis.close();
                    dos.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
}
}
