
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ngsua
 */
public class staffPassController {
    
    @FXML
    PasswordField passwordField;
    @FXML
    Button submitButton;
    @FXML
    Button backButton;
    
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    public void submitButton(ActionEvent event) throws IOException{
        
            if(passwordField.getText().isBlank()==true){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please enter the password");
            alert.show();   
                
            }
            else if(!(passwordField.getText().equals("staff123"))){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("The password is incorrect");
            alert.show(); 
            }
            
            else{
            root = FXMLLoader.load(getClass().getResource("staff.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

            }
        }
    
    public void backButton(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("chooseChar.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
}
