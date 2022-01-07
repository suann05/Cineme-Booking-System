
import java.io.IOException;
import java.sql.SQLException;
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
    
    public void submitButtonOnAction(ActionEvent event) throws SQLException, IOException{
        
        if(usernameTextField.getText().isBlank()==false && passwordTextField.getText().isBlank()==false && mobileTextField.getText().isBlank()==false && emailTextField.getText().isBlank()==false && studentTextField.getText().isBlank()==true ){
               
               OnAction.signupUser(event, usernameTextField.getText(), mobileTextField.getText(),emailTextField.getText(),passwordTextField.getText());
        }
        else if(usernameTextField.getText().isBlank()==false && passwordTextField.getText().isBlank()==false && mobileTextField.getText().isBlank()==false && emailTextField.getText().isBlank()==false && studentTextField.getText().isBlank()==false){
               OnAction.signupUser1(event, usernameTextField.getText(), mobileTextField.getText(),emailTextField.getText(),passwordTextField.getText(),studentTextField.getText());
        }else{
            System.out.println("Please fill up all the information");
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please fill up all the information to sign up");
            alert.show();
        }
        root = FXMLLoader.load(getClass().getResource("login.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        
    

    }
    
}
