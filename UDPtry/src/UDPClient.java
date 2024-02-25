import java.net.*;
import javax.swing.*;
import java.awt.*;

public class UDPClient extends JFrame{

    public String Connect(String msg) throws Exception {
        System.out.println(msg);
        DatagramSocket dmc = new DatagramSocket();

        byte[] buf = new byte[256];
        buf = msg.getBytes();
        InetAddress add = InetAddress.getByName("localhost");
        DatagramPacket packet = new DatagramPacket(buf, buf.length , add , 8080);
        dmc.send(packet);

        //get res
        packet = new DatagramPacket(buf, buf.length);
        dmc.receive(packet);

        //display packet
        String res = new String(packet.getData());
        System.out.println(res);

        dmc.close();

        return res;
    }

    public static void main(String[] args) throws Exception {

        JFrame f = new JFrame("YS NO");
        JTextField jtf = new JTextField(20);
        JButton btn = new JButton("Submit");
        f.add(jtf);

        btn.addActionListener(e -> {
            String msg = jtf.getText();
            UDPClient udp = new UDPClient();
            try{
                udp.Connect(msg);
            }catch(Exception err){
                System.out.println(err.toString());
            }
        });
        f.add(btn);

        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400 , 400);
        f.setVisible(true);



    }

}