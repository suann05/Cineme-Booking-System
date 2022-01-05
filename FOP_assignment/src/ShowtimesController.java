/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author User
 */
public class ShowtimesController {
    
    @FXML
    private AnchorPane mainPage;
    
    @FXML
    private Button back;
    
    @FXML
    private Button doctorStrange;

    @FXML
    private AnchorPane doctorStrangePage;

    @FXML
    private Button eternals;

    @FXML
    private AnchorPane eternalsPage;

    @FXML
    private Button spiderMan;

    @FXML
    private AnchorPane spiderManPage;

    @FXML
    private Button venom;

    @FXML
    private AnchorPane venomPage;
    
    @FXML
    private RadioButton bookingButton;
    
    @FXML
    private RadioButton cancelButton;
    
    
    
    
    
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    public void showDoctorStrange(){
        
        doctorStrangePage.setVisible(true);
        eternalsPage.setVisible(false);
        spiderManPage.setVisible(false);
        venomPage.setVisible(false);
    }
    public void showEternals(){
        
        doctorStrangePage.setVisible(false);
        eternalsPage.setVisible(true);
        spiderManPage.setVisible(false);
        venomPage.setVisible(false);
    }
    public void showSpiderMan(){
        
        doctorStrangePage.setVisible(false);
        eternalsPage.setVisible(false);
        spiderManPage.setVisible(true);
        venomPage.setVisible(false);
    }
    public void showVenom(){
        
        doctorStrangePage.setVisible(false);
        eternalsPage.setVisible(false);
        spiderManPage.setVisible(false);
        venomPage.setVisible(true);
    }
    public void back(){
        
        mainPage.setVisible(true);
        doctorStrangePage.setVisible(false);
        eternalsPage.setVisible(false);
        spiderManPage.setVisible(false);
        venomPage.setVisible(false);
    }
    
    public void makeBooking(ActionEvent event) throws IOException{
        if(bookingButton.isSelected()){
        root = FXMLLoader.load(getClass().getResource("bookingSeat.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        }
    }
    
     public void cancelBooking(ActionEvent event) throws IOException{
        if(cancelButton.isSelected()){
        root = FXMLLoader.load(getClass().getResource("cancelBooking.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        }
    }
}
