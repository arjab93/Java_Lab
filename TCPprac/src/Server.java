//import java.net.*;
//import java.io.*;
//
//public class Server {
//    public static void main(String[] args) throws IOException {
//        ServerSocket serverSocket = new ServerSocket(9000); // Listen on port 9000
//        Socket clientSocket = serverSocket.accept(); // Accept client connection
//
//        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
//        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
//
//        String messageFromClient;
//        while ((messageFromClient = in.readLine()) != null) {
//            System.out.println("Client: " + messageFromClient);
//            out.println("Server: Message received.");
//        }
//
//        out.close();
//        in.close();
//        clientSocket.close();
//        serverSocket.close();
//    }
//}


import java.io.*;
import java.net.*;

public class Server {
    public static void main(String args[]) throws IOException {
        try {
            System.out.println("SERVER:......\n");
            ServerSocket s = new ServerSocket(95);
            System.out.println("Server Waiting For The Client");
            Socket cs = s.accept();
            System.out.println("Client connected");

            BufferedReader in = new BufferedReader(new InputStreamReader(cs.getInputStream()));
            PrintWriter out = new PrintWriter(cs.getOutputStream(), true);
            BufferedReader din = new BufferedReader(new InputStreamReader(System.in));

            while (true) {
                System.out.print("To Client:");
                String tocl = din.readLine();
                out.println(tocl);
                String st = in.readLine();
                if (st.equalsIgnoreCase("Bye") || st == null)
                    break;
                System.out.println("From Client:" + st);
            }

            in.close();
            out.close();
            cs.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
