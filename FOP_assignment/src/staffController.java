
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

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
    
    Image movieImage = new Image(getClass().getResourceAsStream("movie.png"));
    Image seatImage = new Image(getClass().getResourceAsStream("seat.png"));
    Image paymentImage = new Image(getClass().getResourceAsStream("payment.png"));
    Image fandbImage = new Image(getClass().getResourceAsStream("f&b.png"));
    
    
    
    
}
