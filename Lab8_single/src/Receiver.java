import java.net.*;

public class Receiver {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(3000);
        byte[] buf = new byte[1024];

        while (true) {
            DatagramPacket dp = new DatagramPacket(buf, 1024);
            ds.receive(dp);

            String str = new String(dp.getData(), 0, dp.getLength());
            System.out.println(str);

            // Check if the received message is the termination message
            if (str.equals("bye Java")) {
                System.out.println("Receiver is closing.");
                break;
            }
        }

        ds.close();
    }
}
