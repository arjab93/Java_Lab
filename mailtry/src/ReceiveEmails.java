import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;

public class ReceiveEmails {

    public static void main(String[] args) throws Exception {
        Properties props = new Properties();
        props.put("mail.pop3.host", "pop.gmail.com"); // Replace with your POP3 server
        props.put("mail.pop3.auth", "true");
        props.put("mail.pop3.port", "995"); // Default POP3 port

        // Optional for using TLS encryption
        props.put("mail.pop3.starttls.enable", "true");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication("arjabkhadka93@gmail.com", "japx hcwv ojdx jvbf");
                    }
                });

        Store store = session.getStore("pop3");
        store.connect();

        Folder inbox = store.getFolder("INBOX");
        inbox.open(Folder.READ_ONLY);

        Message[] messages = inbox.getMessages();
        for (Message message : messages) {
            Address[] from = message.getFrom();
            String subject = message.getSubject();

            // Accessing message content depends on its type (text/plain, text/html, etc.)
            String content = message.getContent().toString(); // Replace with appropriate access method

            System.out.println("------------------");
            System.out.println("From: " + from[0]);
            System.out.println("Subject: " + subject);
            System.out.println("Content:");
            System.out.println(content);
        }

        inbox.close(false);
        store.close();
    }
}
