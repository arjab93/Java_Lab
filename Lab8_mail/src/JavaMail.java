package testMail;

public class JavaMail {

    public static void main(String[] args) throws Exception {
        String recipientEmail = "arjabkhadka93@gmail.com";
        String subject = "My first email";
        String body = "Here is my email content.";

        testMail.JavaMailUtil.sendMail(recipientEmail, subject, body);
    }
}
