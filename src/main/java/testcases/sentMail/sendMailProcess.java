package testcases.sentMail;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;

import org.openqa.selenium.WebDriver;

import Utility.CredentialsManager;

import java.util.Properties;
public class sendMailProcess {

    private WebDriver driver;

    public sendMailProcess(WebDriver driver) {
        this.driver = driver;
    }

public void SendEmail() {
    try {
        // Fetch encrypted credentials
        final String username = CredentialsManager.getDecryptedCredential("email");
        final String password = CredentialsManager.getDecryptedCredential("password");

        // SMTP server properties
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.outlook.com");
        properties.put("mail.smtp.port", "587");

        // Report path
        String reportPath = System.getProperty("user.dir") + "/automationreport.html";
        String emailreportPath = System.getProperty("user.dir") + "/custom-emailable-report.html";

        // Read the report's HTML content safely
        String reportHtmlContent;
        try {
            reportHtmlContent = new String(Files.readAllBytes(Paths.get(emailreportPath)), StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.out.println("Error reading the report file: " + e.getMessage());
            return; // Exit if report file cannot be read
        }

        // Session setup
        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        // Email message
        MimeMessage msg = new MimeMessage(session);
        msg.setFrom(new InternetAddress(username));
        msg.setRecipient(Message.RecipientType.TO, new InternetAddress("rahul.sharma_tpr@mankindpharma.com"));
        msg.setSubject("Drona Automation Testing Report");

        // Create multipart message
        MimeMultipart multipart = new MimeMultipart();

        // Add the HTML content as the email body
        MimeBodyPart htmlBodyPart = new MimeBodyPart();
        htmlBodyPart.setContent(
            "<p>Hi,</p>" +
            "<p>Below is the Automation Testing Report of Drona on the latest Build.Please find the attachment.\n\n</p>" +
            reportHtmlContent  +
            "<p>Thanks & Regards</p>" +
            "<p>Rahul Sharma</p>",
            "text/html"
        );
        multipart.addBodyPart(htmlBodyPart);

        // Attach the report file
        MimeBodyPart attachmentBodyPart = new MimeBodyPart();
        DataSource source = new FileDataSource(reportPath);
        attachmentBodyPart.setDataHandler(new DataHandler(source));
        attachmentBodyPart.setFileName("AutomationReport.html");
        multipart.addBodyPart(attachmentBodyPart);

        // Set content and send email
        msg.setContent(multipart);
        Transport.send(msg);
        System.out.println("Email sent successfully with the emailable report in the body!");

    } catch (Exception e) {
        e.printStackTrace();
        System.out.println("Error while sending email: " + e.getMessage());
    }
}
}
