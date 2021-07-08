package socketprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSideSocket {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(7000);
        System.out.println("ServerSideSocket : Sever socket created");
        Socket s = serverSocket.accept();
        System.out.println("ServerSideSocket : client got connected");
        InputStream is = s.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String str;
        while( (str=br.readLine()) != null) {
            System.out.println("Server : In while ");
            System.out.println(str);
        }
        System.out.println("Server : Ready to close");
        br.close();
    }
}
