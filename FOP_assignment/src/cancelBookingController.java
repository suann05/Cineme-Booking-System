
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ngsua
 */
public class cancelBookingController {
    
    @FXML
    private TextField nameTextField;
    @FXML
    private TextField dateTextField;
    @FXML
    private TextField timeTextField;
    @FXML
    private TextField seatTextField;
    @FXML
    private Button backButton;
    @FXML
    private Button submitButton;
    
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    
    
    public void backButton(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("Showtimes.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    public void submitButton(ActionEvent event){
        if(nameTextField.getText().isBlank()==false && dateTextField.getText().isBlank()==false && timeTextField.getText().isBlank()==false && seatTextField.getText().isBlank()==false ){
           OnAction.removeSeat(event, nameTextField.getText(), dateTextField.getText(), timeTextField.getText(),seatTextField.getText());
        }else{
           Alert alert = new Alert(Alert.AlertType.ERROR);
           alert.setContentText("Please enter all the information");
           alert.show(); 
        }
        
    }
    
}
