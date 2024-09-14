//package SingleThreaded;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server{

    public void run() throws IOException{
        int port = 8010;
        ServerSocket socket = new ServerSocket(port);
        socket.setSoTimeout(10000);//10s ke baad socket timeout
        while (true) {
            try {
                System.out.println("Server is listening on port :"+ port);
                Socket acceptedConnection = socket.accept();
                System.out.println("Connection accepted from client "+acceptedConnection.getRemoteSocketAddress());
                PrintWriter toClient = new PrintWriter(acceptedConnection.getOutputStream());//server's socket accepts input
                BufferedReader fromClient = new BufferedReader(new InputStreamReader(acceptedConnection.getInputStream()));//client's socket fromClient, bufferreader accepts bytes
                toClient.println("Hello from Server !!!");
                toClient.close();
                acceptedConnection.close();
                fromClient.close();

  
            } catch (IOException e) {
                e.printStackTrace();// TODO: handle exception
            }
            
            
        }

    }
    public static void main(String[] args) {
        Server server = new Server();
        try {
            server.run();
        } catch (Exception e) {
            e.printStackTrace();// TODO: handle exception
        }
        
    }
}