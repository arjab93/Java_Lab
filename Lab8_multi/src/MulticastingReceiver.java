import java.io.IOException;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.DatagramPacket;

public class MulticastingReceiver {
    public static void main(String[] args) throws InterruptedException, IOException {
        if (args.length == 0) {
            System.out.println("Please provide the multicast group address as a command-line argument.");
            return;
        }

        String group = args[0];
        int messageCount = 0;

        // Open a Multicast socket on the specified port
        MulticastSocket ms = new MulticastSocket(5000);
        ms.joinGroup(InetAddress.getByName(group));

        byte[] buf = new byte[1024];

        while (messageCount < 2) {
            // Constructs a Datagram packet for receiving the packets of specified length
            DatagramPacket dp = new DatagramPacket(buf, 1024);

            ms.receive(dp);
            String str = new String(dp.getData(), 0, dp.getLength());

            System.out.println("Received message: " + str);

            messageCount++;

            // Leave the group (Note: Leaving the group should happen outside the loop)
        }

        // Leave the group
        ms.leaveGroup(InetAddress.getByName(group));

        // Closing the Datagram Socket
        ms.close();
    }
}
