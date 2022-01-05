
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ngsua
 */
public class logoutController {
    
    @FXML
    Button logoutButton;
    @FXML
    AnchorPane scenePane;        
    
    Stage stage;
    
    public void logout(ActionEvent event){
        
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setContentText("Are you sure you want to logout?");
        
        
        if(alert.showAndWait().get()==ButtonType.OK){
        stage = (Stage)scenePane.getScene().getWindow();
        stage.close();
        }
    }
    
}
