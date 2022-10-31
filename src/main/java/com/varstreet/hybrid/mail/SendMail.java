package com.varstreet.hybrid.mail;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;

import org.testng.annotations.Test;

import backOffice.util.Constants;

import java.io.File;
import java.util.*;
 
public class SendMail

{
	@Test
	public void sendMail(){
   {
   	
    	 String reportFolder=Constants.REPORT_PATH;
         FileFilterDateIntervalUtils filter = new FileFilterDateIntervalUtils("2010-01-04", "2050-01-20");
         File folder =  new File(reportFolder);
         File files[] = folder.listFiles(filter);
        
        String fileName=files[files.length-1].getName();
        String extentFilePath=reportFolder+fileName;
         
       
         
         // mail extent reports
                String[] to={"rpujari@varstreet.com"};
                String[] cc={};
                String[] bcc={};
             
               sendMail("apikey",
                		"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",
                		            "smtp.sendgrid.net",
                		            "25",
                		            "true",
                		            "true",
                		            true,
                		            "",
                		            "false",
                		            to,
                		            cc,
                		            bcc,
                		           fileName,
                		            "",
                		            extentFilePath,
                		            fileName);
                


               /* sendMail("apikey",
                		"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",
                		"smtp.sendgrid.net",
    		            "25",
    		            "true",
    		            "true",
    		            true,
    		            "",
    		            "false",
    		            to,
    		            cc,
    		            bcc,
    		            "Automation Test Reports - XSLT",
    		            "Please find the reports attached.\n\n Regards\nWebMaster",
    		            xsltReportPath,
    		            "Reports.zip");*/

    }
	}

         public  static boolean sendMail(
        		final String userName,
        		final String passWord,
        		String host,
        		String port,
        		String starttls,
        		String auth,
        		boolean debug,
        		String socketFactoryClass,
        		String fallback,
        		String[] to,
        		String[] cc,
        		String[] bcc,
        		String subject,
        		String body,
        		String attachmentPath,
        		String attachmentName){
        	Properties props = new Properties();
        	props.put("mail.smtp.user", userName);
            if(!"".equals(starttls)){
            	props.put("mail.smtp.starttls.enable",starttls);
            	props.put("mail.smtp.auth", auth);
            	}
            props.put("mail.smtp.host", host);
            if(!"".equals(port)){
            	props.put("mail.smtp.port", port);
            	}
            if(debug){

            	props.put("mail.smtp.debug", "true");

            	}else{

            	props.put("mail.smtp.debug", "false");

            	}
            
            if(!"".equals(port)){
            	props.put("mail.smtp.socketFactory.port", port);
            	}
            	if(!"".equals(socketFactoryClass)){
            	props.put("mail.smtp.socketFactory.class",socketFactoryClass);
            	}
            	if(!"".equals(fallback)){
            	props.put("mail.smtp.socketFactory.fallback", fallback);
            	}
        try

        {

        	Session session = Session.getInstance(props,
        	          new javax.mail.Authenticator() {
        	            protected PasswordAuthentication getPasswordAuthentication() {
        	                return new PasswordAuthentication("rpujari@varstreet.com", "Varstreet@345");
        	    }
        	 });

            MimeMessage msg = new MimeMessage(session);
            final String BODY1 = String.join(
            	    System.getProperty("line.separator"),
            	    "<p>Hello Team,",
            	    "<p>Please find the attached regression report(s)"
            	);
            msg.setText(body);

            msg.setSubject(subject);

           
            Multipart multipart = new MimeMultipart();
           final MimeBodyPart  messageBodyPart = new MimeBodyPart();
            DataSource source = new FileDataSource(attachmentPath);
            messageBodyPart.setDataHandler(
              new DataHandler(source));
            messageBodyPart.setFileName(attachmentName);
            multipart.addBodyPart(messageBodyPart);

            msg.setContent(multipart);
            BodyPart htmlPart = new MimeBodyPart();
            htmlPart.setContent(BODY1, "text/html");
            multipart.addBodyPart(htmlPart);
            msg.setFrom(new InternetAddress("spandya@varstreet.com"));

            for(int i=0;i<to.length;i++){

            msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to[i]));

                        }

                        for(int i=0;i<cc.length;i++){

            msg.addRecipient(Message.RecipientType.CC, new InternetAddress(cc[i]));

                        }

                        for(int i=0;i<bcc.length;i++){

            msg.addRecipient(Message.RecipientType.BCC, new InternetAddress(bcc[i]));

                        }

            msg.saveChanges();
            
                        Transport transport = session.getTransport("smtp");
                        System.out.println("Sending...");
                        transport.connect(host, userName, passWord);

                        transport.sendMessage(msg, msg.getAllRecipients());
                        System.out.println("Email sent!");

                        transport.close();

                        return true;

        }

        catch (Exception mex)

        {
            mex.printStackTrace();

             return false;

        }

        }

 

}