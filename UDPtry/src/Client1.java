import java.net.*;
import java.io.IOException;

public class Client1 {

    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            byte[] buf; // Byte array to store information
            String messg = "Hello UDP Server";
            buf = messg.getBytes(); // Getting the size of the message
            InetAddress address = InetAddress.getByName("127.0.0.1");
            DatagramPacket packet = new DatagramPacket(buf, buf.length, address, 1234);
            socket.send(packet); // Sends datagram packet, packet
            System.out.println("Message sent successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
