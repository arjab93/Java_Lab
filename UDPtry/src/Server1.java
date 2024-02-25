import java.net.*;
import java.io.IOException;

public class Server1 {

    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket(1234);
            byte[] buf = new byte[256];
            DatagramPacket packet = new DatagramPacket(buf, buf.length);
            socket.receive(packet);
            String received = new String(packet.getData(), 0, packet.getLength());
            System.out.println("Received packet: " + received);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
