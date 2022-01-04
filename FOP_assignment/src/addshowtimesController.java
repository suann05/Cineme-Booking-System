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
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author USER
 */
public class addshowtimesController {
    
    public addshowtimesController () {
    
}
    @FXML
    private Label title;
    @FXML
    private Label existingMovies;
    @FXML
    private AnchorPane mainpage;
    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @FXML
    private ImageView doctorStrange;
    @FXML
    private ImageView spiderMan;
    @FXML
    private ImageView eternals;
    @FXML
    private ImageView venom;   
    
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    public void addMovies(ActionEvent event) throws IOException{
        if(button1.isSelected()){
        root = FXMLLoader.load(getClass().getResource("addmovies.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        }
    }
}
