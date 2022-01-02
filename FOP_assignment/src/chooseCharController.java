
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
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
public class chooseCharController {
    
    @FXML
    RadioButton staffButton;
    @FXML
    RadioButton customerButton;
    @FXML
    ImageView customerIcon;
    @FXML
    ImageView staffIcon;
    
    
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    Image staffImage = new Image(getClass().getResourceAsStream("staff.png"));
    Image customerImage = new Image(getClass().getResourceAsStream("customer.png"));
    
   
    
    public void displayWindow(ActionEvent event) throws IOException{
        
        if(customerButton.isSelected()){
            root = FXMLLoader.load(getClass().getResource("customer.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            
        }
        else if(staffButton.isSelected()){
            root = FXMLLoader.load(getClass().getResource("staffPass.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            
        }
    }    
        
    
}
