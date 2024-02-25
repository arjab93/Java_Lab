//import java.net.*;
//import java.io.*;
//
//public class Client {
//    public static void main(String[] args) throws IOException {
//        Socket socket = new Socket("localhost", 9000); // Connect to server on localhost
//
//        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
//        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//
//        BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
//        String messageFromUser;
//
//        while ((messageFromUser = stdIn.readLine()) != null) {
//            out.println(messageFromUser);
//            System.out.println("Server: " + in.readLine());
//        }
//
//        out.close();
//        in.close();
//        stdIn.close();
//        socket.close();
//    }
//}


import java.io.*;
import java.net.*;

public class Client {
    public static void main(String args[]) throws IOException {
        try {
            System.out.println("CLIENT:......\n");
            Socket con = new Socket("localhost", 95);
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            PrintWriter out = new PrintWriter(con.getOutputStream(), true);

            while (true) {
                String s1 = in.readLine();
                System.out.println("From Server: " + s1);

                System.out.print("Enter the messages to the server:");
                BufferedReader din = new BufferedReader(new InputStreamReader(System.in));
                String st = din.readLine();
                out.println(st);

                if (st == null || st.equalsIgnoreCase("Bye")) {
                    break;
                }
            }

            in.close();
            out.close();
            con.close();
        } catch (UnknownHostException e) {
            e.printStackTrace(); // Print the exception stack trace for debugging
        }
    }
}
