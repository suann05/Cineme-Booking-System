
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
import javafx.stage.Stage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ngsua
 */
public class addseatController {
    
    @FXML
    private Button backButton;
    @FXML
    private Button submitButton;
    @FXML
    private TextField seatTextField;
    
    
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    public void backButton(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("staff.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    public void addButton(ActionEvent event) throws SQLException{
        if(seatTextField.getText().isBlank()==false){
            OnAction.addSeat(event, seatTextField.getText());
        }else{
           Alert alert = new Alert(Alert.AlertType.ERROR);
           alert.setContentText("Please enter all the information");
           alert.show(); 
        }
         
    }
    
    public void removeButton(ActionEvent event) throws SQLException{
        if(seatTextField.getText().isBlank()==false ){
            OnAction.removeSeat(event, seatTextField.getText());
        }else{
           Alert alert = new Alert(Alert.AlertType.ERROR);
           alert.setContentText("Please enter all the information");
           alert.show(); 
        }
    }
    
}
