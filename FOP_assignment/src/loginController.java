
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
import javafx.scene.control.MenuButton;
import javafx.scene.control.PasswordField;
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
public class loginController {
    
    @FXML
    private TextField emailTextField;
    @FXML
    private PasswordField passwordTextField;
    @FXML
    private Button signinButton;
    @FXML
    private Button signupButton;
    @FXML
    private MenuButton menuButton;
    @FXML
    private ImageView popcornIcon;
    
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    
        Image popcornImage = new Image(getClass().getResourceAsStream("popcornIcon.png"));
    
   
        public void signinButtonOnAction(ActionEvent event) throws SQLException, IOException{
          
            if(emailTextField.getText().isBlank()==false && passwordTextField.getText().isBlank()==false){
              
                    OnAction.loginUser(event, emailTextField.getText(), passwordTextField.getText());
                   
            }else{
                
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Please enter your email and password");
                alert.show();
            }
            
            
        
    }
        public void signupButtonOnAction(ActionEvent event) throws SQLException, IOException{
            root = FXMLLoader.load(getClass().getResource("signup.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        
       
    
}
