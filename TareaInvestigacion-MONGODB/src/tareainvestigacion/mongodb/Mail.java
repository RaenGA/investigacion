
package tareainvestigacion.mongodb;
import java.util.Date;
import javax.mail.Message;
import javax.mail.Session;
import java.util.Properties;
import javax.mail.Multipart;
import javax.mail.Transport;
import javax.swing.JOptionPane;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.AddressException;
/**
 * @web http://programaciongeneral.tk
 * @author Jheyson Matta
 */
public class Mail {

    private String from = "gabrielramirez.92@gmail.com";//tu_correo@gmail.com
    private String password = "cuadraciclo92";//tu password: 123456 :)
    // destinatario1@hotmail.com,destinatario2@hotmail.com, destinatario_n@hotmail.com
    private InternetAddress[] addressTo;
    private String Subject = "Notificacion!";//titulo del mensaje
    private String MessageMail = "Ha habido un nuevo Reply a tu comentario.";//contenido del mensaje

    public Mail(){}

    public void SEND()
    {
        try {
            Properties props = new Properties();
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.user", "gabrira09@gmail.com"); // User name
            props.put("mail.smtp.password", "cuadraciclo92"); // password
            props.put("mail.smtp.port", 587);
            //
            SMTPAutenticar auth = new SMTPAutenticar( getFrom(), getPassword() );
            Session session = Session.getDefaultInstance(props, auth);
            session.setDebug(false);
            //Se crea destino y origen del mensaje
            MimeMessage mimemessage = new MimeMessage(session);
            InternetAddress addressFrom = new InternetAddress( getFrom() );
            mimemessage.setFrom(addressFrom);
            mimemessage.setRecipients(Message.RecipientType.TO, addressTo);
            mimemessage.setSubject( getSubject() );
            // Se crea el contenido del mensaje
            MimeBodyPart mimebodypart = new MimeBodyPart();
            mimebodypart.setText( getMessage() );
            mimebodypart.setContent( getMessage() , "text/html");
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(mimebodypart);            
            mimemessage.setContent(multipart);            
            mimemessage.setSentDate(new Date());
            Transport.send(mimemessage);
            JOptionPane.showMessageDialog(null, "Correo enviado. Exitosamente!!!");
        } catch (MessagingException ex) {
            System.out.println(ex);
        }

    }
    //remitente
    public void setFrom(String mail){ this.from = mail; }
    public String getFrom(){ return this.from; }
    //Contraseña
    public void setPassword(char[] value){
        this.password = new String(value);
    }
    public String getPassword(){ return this.password; }
    //destinatarios
    public void setTo(String mails){
        String[] tmp =mails.split(",");
        addressTo = new InternetAddress[tmp.length];
        for (int i = 0; i < tmp.length; i++) {
            try {
                addressTo[i] = new InternetAddress(tmp[i]);
            } catch (AddressException ex) {
                System.out.println(ex);
            }
        }
    }
    public InternetAddress[] getTo(){ return this.addressTo; }
    //titulo correo
    public void setSubject(String value){ this.Subject = value; }
    public String getSubject(){ return this.Subject; }
    //contenido del mensaje
    public void setMessage(String value){ this.MessageMail = value; }
    public String getMessage(){ return this.MessageMail; }
    
    /*public static void main(String args[]) {
        Mail correo = new Mail();
        correo.setTo("jetx959@gmail.com");
        correo.SEND();
        
    }*/

}



