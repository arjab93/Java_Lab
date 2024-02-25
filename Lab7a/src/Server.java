import java.net.*;
import java.io.*;

public class Server {
    private ServerSocket server = null;
    private Socket socket = null;
    private DataInputStream in = null;
    private DataOutputStream out = null;

    public Server(int port) {
        try {
            server = new ServerSocket(port);
            System.out.println("Server started");

            System.out.println("Waiting for a client ...");

            socket = server.accept();
            System.out.println("Client accepted");

            in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
            out = new DataOutputStream(socket.getOutputStream());

            String line = "";

            while (!line.equals("Over")) {
                try {
                    line = in.readUTF();
                    System.out.println("Client: " + line);

                    // Echo the message back to the client
                    out.writeUTF("Server Echo: " + line);
                } catch (IOException i) {
                    System.out.println(i);
                }
            }
            System.out.println("Closing connection");

            socket.close();
            in.close();
            out.close();
        } catch (IOException i) {
            System.out.println(i);
        }
    }

    public static void main(String args[]) {
        Server server = new Server(5000);
    }
}
