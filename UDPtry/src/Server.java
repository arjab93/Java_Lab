import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {

//		1. Creating ServerSocket
        ServerSocket sever = new ServerSocket(95);

//		2. wait for connection
        System.out.println("Waiting for Connection");
        Socket conn = sever.accept();
        System.out.println("Client Connected");

//		3. Get IO Stream and Perform operation
//		Input Stream => to receive info from client
//		Output Stream => to send info to client

        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String message = in.readLine();
        System.out.println("Message from Client :" + message);

        PrintWriter out = new PrintWriter(conn.getOutputStream());
        out.println("Hello Client From Sever");
        out.flush();

//		4. Closing conn and in
        in.close();
        conn.close();
    }

}