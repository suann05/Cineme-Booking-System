
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.RadioButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
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
public class staffController {
    
    @FXML
    RadioButton movieButton;
    @FXML
    RadioButton seatButton;
    @FXML
    RadioButton paymentButton;
    @FXML
    RadioButton fandbButton;
    @FXML
    ImageView movieIcon;
    @FXML
    ImageView seatIcon;
    @FXML
    ImageView paymentIcon;
    @FXML
    ImageView fandbIcon;
    
    
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    Image movieImage = new Image(getClass().getResourceAsStream("movie.png"));
    Image seatImage = new Image(getClass().getResourceAsStream("seat.png"));
    Image paymentImage = new Image(getClass().getResourceAsStream("payment.png"));
    Image fandbImage = new Image(getClass().getResourceAsStream("f&b.png"));
    
    public void movie(ActionEvent event) throws IOException{
        if(movieButton.isSelected()){
        root = FXMLLoader.load(getClass().getResource("addMovie.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        }
    }    
        
    public void fandb(ActionEvent event) throws IOException{
        if(fandbButton.isSelected()){
        root = FXMLLoader.load(getClass().getResource("addfandb.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        } 
    }    
        
    public void payment(ActionEvent event) throws IOException{
        if(paymentButton.isSelected()){
        root = FXMLLoader.load(getClass().getResource("addPayment.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        }
    }    
        
    public void seat(ActionEvent event) throws IOException{
        if(seatButton.isSelected()){
        root = FXMLLoader.load(getClass().getResource("addSeat.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        }        
        
    }
    
    public void movieIcon(MouseEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("tableView.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show(); 
        
    }
    
     public void fnbIcon(MouseEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("tableView1.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show(); 
        
    }
     
     public void paymentIcon(MouseEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("tableView2.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show(); 
        
    }
    
    
    
    
    
    
    
    
    
}
