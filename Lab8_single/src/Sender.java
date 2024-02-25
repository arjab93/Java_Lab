import java.net.*;

public class Sender {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket();
        InetAddress ip = InetAddress.getByName("127.0.0.1");

        // Sending the first message
        String str1 = "Welcome Java";
        DatagramPacket dp1 = new DatagramPacket(str1.getBytes(), str1.length(), ip, 3000);
        ds.send(dp1);

        // Sending the second message
        String str2 = "bye Java";
        DatagramPacket dp2 = new DatagramPacket(str2.getBytes(), str2.length(), ip, 3000);
        ds.send(dp2);

        ds.close();
    }
}
