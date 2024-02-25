import java.net.*;


public class UDPServer {
    public static void main(String[] args) throws Exception {

        byte[] buf = new byte[256];

        DatagramSocket dms = new DatagramSocket(8080);

        DatagramPacket packet = new DatagramPacket(buf, buf.length );
        dms.receive(packet);

        String receivedData = new String(packet.getData() , 0 , packet.getLength());
        System.out.println(receivedData);

        InetAddress add = packet.getAddress();
        int port = packet.getPort();
        String s = "Recieved to server";
        buf = s.getBytes();

        packet = new DatagramPacket(buf,buf.length , add,port );
        dms.send(packet);

        dms.close();
    }
}