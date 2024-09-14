//package SingleThreaded;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client{
    public void  run() throws UnknownHostException, IOException{
        int port = 8010;
        InetAddress address= InetAddress.getByName("Localhost");
        Socket socket = new Socket(address,port);
        PrintWriter toSocket = new PrintWriter(socket.getOutputStream());//from client haba tosocket in server side haba fromsocket and bufferreader use haba
        BufferedReader fromSocket = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        toSocket.println("hello from Client");
        String line = fromSocket.readLine();
        System.out.println("Response from Server is :"+line);
        toSocket.close();
        fromSocket.close();
        socket.close();
    }
    public static void main(String[] args) {
       try {
        Client client = new Client();
        client.run();
       } catch (Exception e) {
        e.printStackTrace();
          // TODO: handle exception
       }

    }
}
