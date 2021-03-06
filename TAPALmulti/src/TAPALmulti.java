import java.io.UnsupportedEncodingException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
public class TAPALmulti extends Thread {
    @Override
    public void run() {  
         System.out.println("Thread Running");
        String to="testuser1@tapal.com";
        String from="testuser1@tapal.com";
        System.out.println("running thread name is:"+Thread.currentThread().getName());  
        System.out.println("running thread "+Thread.currentThread().getName()+" priority is:"+Thread.currentThread().getPriority());  
        Properties props = new Properties();
        Session session = Session.getDefaultInstance(props, null);
        String msgBody = "Sending email using JavaMail API...\nThread number: "+Thread.currentThread().getName();
        try {
            Message msg = new MimeMessage(session);
             try {
                 msg.setFrom(new InternetAddress(from, from));
             } catch (UnsupportedEncodingException ex) {
                 Logger.getLogger(TAPALmulti.class.getName()).log(Level.SEVERE, null, ex);
             }
             try {
                 msg.addRecipient(Message.RecipientType.TO,
                         new InternetAddress(to, "Mr. Recipient"));
             } catch (UnsupportedEncodingException ex) {
                 Logger.getLogger(TAPALmulti.class.getName()).log(Level.SEVERE, null, ex);
             }
            msg.setSubject("Threaad: "+Thread.currentThread().getName());
            msg.setText(msgBody);
            System.out.println("Ready to send email");
            Transport.send(msg);
            System.out.println("Email sent successfully...");
            } catch (AddressException e) {
            throw new RuntimeException(e);
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
  public static void main(String[] args) throws Exception{
  TAPALmulti t1= new  TAPALmulti();
  TAPALmulti t2= new  TAPALmulti();
  TAPALmulti t3= new  TAPALmulti();
  TAPALmulti t4= new  TAPALmulti();
 t1.setName("1");
 t2.setName("2");
 t3.setName("3");
 t4.setName("4");
 t2.start();
 t1.start();
 t3.setPriority(Thread.MIN_PRIORITY);  
 t4.setPriority(Thread.MAX_PRIORITY);  
 t3.start();
 t4.start();
 }
}
