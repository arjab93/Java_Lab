import java.net.*;
import java.io.*;

public class Client {
    private Socket socket = null;
    private DataInputStream input = null;
    private DataOutputStream out = null;
    private DataInputStream serverInput = null;

    public Client(String address, int port) {
        try {
            socket = new Socket(address, port);
            System.out.println("Connected");

            input = new DataInputStream(System.in);
            out = new DataOutputStream(socket.getOutputStream());
            serverInput = new DataInputStream(socket.getInputStream());
        } catch (UnknownHostException u) {
            System.out.println(u);
        } catch (IOException i) {
            System.out.println(i);
        }

        String line = "";

        try {
            while (!line.equals("Over")) {
                line = input.readLine();
                out.writeUTF(line);

                // Receive and print the echoed message from the server
                String serverResponse = serverInput.readUTF();
                System.out.println("" + serverResponse);
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        try {
            input.close();
            out.close();
            serverInput.close();
            socket.close();
        } catch (IOException i) {
            System.out.println(i);
        }
    }

    public static void main(String args[]) {
        Client client = new Client("127.0.0.1", 5000);
    }
}
