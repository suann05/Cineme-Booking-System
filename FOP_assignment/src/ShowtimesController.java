/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

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
}
