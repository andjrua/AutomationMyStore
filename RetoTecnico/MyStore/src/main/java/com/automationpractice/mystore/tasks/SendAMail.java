package com.automationpractice.mystore.tasks;

import static com.automationpractice.mystore.userinterfaces.MyStorePurchasePage.CONFIRMATION;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;


public class SendAMail implements Task{

	private List<WebElementFacade> tabs;
	private final String username;
    private final String password;
    
    public SendAMail(String username, String password) {
    	this.username=username;
    	this.password=password;
    }
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		tabs = CONFIRMATION.resolveAllFor(actor);
		File myScreenshot = tabs.get(0).getScreenshotAs(OutputType.FILE);		
		String name = System.currentTimeMillis() +".png";
		String path = "Screenshots/"+ name;
		try {
			FileUtils.copyFile(myScreenshot, new File(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Properties props = new Properties();
	    props.put("mail.smtp.auth", true);
	    props.put("mail.smtp.starttls.enable", true);
	    props.put("mail.smtp.host", "smtp.gmail.com");
	    props.put("mail.smtp.port", "587");

	    Session session = Session.getInstance(props,
	            new javax.mail.Authenticator() {
	                protected PasswordAuthentication getPasswordAuthentication() {
	                    return new PasswordAuthentication(username, password);
	                }
	            });

	    try {

	        Message message = new MimeMessage(session);
	        message.setFrom(new InternetAddress(username+"@gmail.com"));
	        message.setRecipients(Message.RecipientType.TO,
	                InternetAddress.parse(username+"@gmail.com"));
	        message.setSubject("Comprobante de pago");
	        message.setText("PFA");

	        MimeBodyPart messageBodyPart = new MimeBodyPart();

	        Multipart multipart = new MimeMultipart();

	        messageBodyPart = new MimeBodyPart();
	        String file = path;
	        String fileName = name;
	        DataSource source = new FileDataSource(file);
	        messageBodyPart.setDataHandler(new DataHandler(source));
	        messageBodyPart.setFileName(fileName);
	        multipart.addBodyPart(messageBodyPart);

	        message.setContent(multipart);

	        System.out.println("Sending");

	        Transport.send(message);

	        System.out.println("Done");

	    } catch (MessagingException e) {
	        e.printStackTrace();
	    }
	}

	public static Performable the(String username, String password) {
		return instrumented(SendAMail.class, username, password);
	}

}
