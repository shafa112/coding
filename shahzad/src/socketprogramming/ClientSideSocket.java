package socketprogramming;

import java.io.*;
import java.net.Socket;
import java.sql.SQLOutput;

public class ClientSideSocket {

    public static void main(String[] args) throws IOException {
        Socket s = new Socket("127.0.0.1",7000);
        System.out.println("ClientSideSocket : client socket created");
        PrintWriter p = new PrintWriter(s.getOutputStream(), true);
       /* p.println("hey server");
        p.println("whats up");*/
        System.out.println("ClientSideSocket: creating reader object");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while(((str = br.readLine()) != null) && !(str.equals("bye"))){
            System.out.println("client : In while ");
            p.println(str);
        }
        System.out.println("Client : Ready to close");
        br.close();
        p.close();


    }
}
