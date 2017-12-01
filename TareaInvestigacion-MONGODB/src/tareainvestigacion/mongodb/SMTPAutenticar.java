
package tareainvestigacion.mongodb;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
/**
 * @web http://programaciongeneral.tk
 * @author Jheyson Matta
 */
public class SMTPAutenticar extends Authenticator{

    private String SMTP_AUTH_USER = "";
    private String SMTP_AUTH_PWD = "";

public SMTPAutenticar() {}

public SMTPAutenticar(String user , String pass) {
    this.SMTP_AUTH_USER = user;
    this.SMTP_AUTH_PWD = pass;
}

 @Override
public PasswordAuthentication getPasswordAuthentication() {
    return new PasswordAuthentication(this.SMTP_AUTH_USER, this.SMTP_AUTH_PWD);
}
}


