
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ngsua
 */
public class customerController {
    
    @FXML
    RadioButton displayButton;
    @FXML
    RadioButton bookingButton;
    @FXML
    RadioButton cancelButton;
    
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    public void bookingButton(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("bookingSeat.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
}
