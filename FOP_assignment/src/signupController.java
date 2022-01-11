
import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;
import java.util.regex.Pattern;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javax.mail.Authenticator;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ngsua
 */
public class signupController {
    
    @FXML
    Button loginButton;
    @FXML
    Button submitButton;
    @FXML
    TextField usernameTextField;
    @FXML
    TextField mobileTextField;
    @FXML
    TextField emailTextField; 
    @FXML
    TextField passwordTextField;
    @FXML
    TextField studentTextField;
    @FXML
    ImageView icon;
    
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    Image icon1 = new Image(getClass().getResourceAsStream("signup.png"));
    
    public void backtoLogin(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("login.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        
    }
    
    public void sendEmail(String recepient,String username)throws Exception{
        
        String to = emailTextField.getText();
        
        Properties props = new Properties();
        props.put("mail.smtp.auth","true");
        props.put("mail.smtp.starttls.enable","true");
        props.put("mail.smtp.host","smtp.gmail.com");
        props.put("mail.smtp.port","587");
        
        String myAccountEmail= "u2102795@siswa.um.edu.my";
        String password="u21583b4ebd";
       
        Session session = Session.getInstance(props,new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(myAccountEmail,password);
            }
        
        });
        
        try{

            //create mail
            MimeMessage m = new MimeMessage(session);
            m.setFrom(new InternetAddress(myAccountEmail));
            m.setSubject("Thanks for signing up UMSC.");
            m.addRecipient(MimeMessage.RecipientType.TO, new InternetAddress(to));
            m.setText("Hi, "+username+".Welcome to UMSC ticket booking system.");

            //send mail

            Transport.send(m);
            System.out.println("Message sent!");

        }   catch (MessagingException e){
            e.printStackTrace();
        }

    }
    
    public void submitButtonOnAction(ActionEvent event) throws SQLException, IOException, Exception{
        String a = emailTextField.getText();
        String b = usernameTextField.getText();
        boolean checkEmail,checkMobile,checkPass;
        Pattern pt = Pattern.compile("^[_A-Za-z0-9-]+@[A-Za-z0-9-]+.[.A-Za-z]{2,}$");
        Pattern pt1 = Pattern.compile("^01\\d-\\d{7,8}$"); 
        checkEmail = (pt.matcher(emailTextField.getText())).matches();
        checkMobile = (pt1.matcher(mobileTextField.getText())).matches();
        if(passwordTextField.getText().length()>8 && passwordTextField.getText().length()<15 ){
            checkPass = true;
        }else{
            checkPass = false;
        }
        
        if(usernameTextField.getText().isBlank()==false && passwordTextField.getText().isBlank()==false && mobileTextField.getText().isBlank()==false && emailTextField.getText().isBlank()==false && studentTextField.getText().isBlank()==true ){
            if(checkEmail == true && checkMobile==true && checkPass==true){
                OnAction.signupUser(event, usernameTextField.getText(), mobileTextField.getText(),emailTextField.getText(),passwordTextField.getText());
                sendEmail(a,b);                
                OnAction.changeScene(event, usernameTextField.getText(), "login.fxml");
            }else if(checkEmail == true && checkMobile==true && checkPass==false){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Password must be 8-15 characters. Please try again");
                alert.show();
            }else if(checkEmail == true && checkMobile==false && checkPass==true){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Invalid mobile number. Please try again");
                alert.show();
            }else if(checkEmail == false && checkMobile==true && checkPass==true){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Invalid email. Please try again");
                alert.show();
            }else{
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Invalid information. Please try again");
                alert.show();  
            }
        }else if(usernameTextField.getText().isBlank()==false && passwordTextField.getText().isBlank()==false && mobileTextField.getText().isBlank()==false && emailTextField.getText().isBlank()==false && studentTextField.getText().isBlank()==false){
                if(checkEmail == true && checkMobile==true &&checkPass==true  ){
                  OnAction.signupUser1(event, usernameTextField.getText(), mobileTextField.getText(),emailTextField.getText(),passwordTextField.getText(),studentTextField.getText());
                  OnAction.changeScene(event, usernameTextField.getText(), "login.fxml");
                }else if(checkEmail == true && checkMobile==true && checkPass==false){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Password must be 8-15 characters. Please try again");
                alert.show();
            }else if(checkEmail == true && checkMobile==false && checkPass==true){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Invalid mobile number. Please try again");
                alert.show();
            }else if(checkEmail == false && checkMobile==true && checkPass==true){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Invalid email. Please try again");
                alert.show();
            }else{
                  Alert alert = new Alert(Alert.AlertType.ERROR);
                  alert.setContentText("Invalid information. Please try again");
                  alert.show();  
            }
        }else{
            System.out.println("Please fill up all the information");
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please fill up all the information to sign up");
            alert.show();
        }

    }
    
}
