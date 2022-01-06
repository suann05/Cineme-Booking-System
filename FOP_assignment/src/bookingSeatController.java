
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ngsua
 */
public class bookingSeatController implements Initializable {
    
    @FXML
    private AnchorPane bookingSeatPage;
    @FXML
    private AnchorPane bookingSeatPage2;
    @FXML
    private ChoiceBox<String> movieChoiceBox;
    @FXML
    private ChoiceBox<String> timeChoiceBox;
    @FXML
    private ChoiceBox<String> dateChoiceBox;
    @FXML
    private Button bookButton;
    @FXML
    private Button backButton;
    @FXML
    private TextField billTextField;
    @FXML
    private Button proceedToFandB;
    @FXML
    private Button backToBookingSeat;

    @FXML
    private CheckBox A1,A2,A3,A4,A5,A6,A7,A8,A9,A10,
             B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,
             C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,
             D1,D2,D3,D4,D5,D6,D7,D8,D9,D10,
             E1,E2,E3,E4,E5,E6,E7,E8,E9,E10;
    
    
    private Stage stage;
    private Scene scene;
    private Parent root;
    private String[] movie1 = {"Spider Man","Venom","Eternals","Doctor Strange"};
    private String[] time1 = {"11:00","13:15","14:30","15:45","17:30"};
    private String[] date1 = {"3/1/2022","4/1/2022","5/1/2022","6/1/2022","7/1/2022"};
    double sum2=0;
    String seat = "";
    
    
    public void backButton(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("Showtimes.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    public String seatCheckBox(){
        if(A1.isSelected())
            seat = "A1";
        else if(A2.isSelected())
            seat = "A2";
        else if(A3.isSelected())
            seat = "A3";
        else if(A4.isSelected())
            seat = "A4";
        else if(A5.isSelected())
            seat = "A5";
        else if(A6.isSelected())
            seat = "A6";
        else if(A7.isSelected())
            seat = "A7";
        else if(A8.isSelected())
            seat = "A8";
        else if(A9.isSelected())
            seat = "A9";
        else if(A10.isSelected())
            seat = "A10";
        else if(B1.isSelected())
            seat = "B1";
        else if(B2.isSelected())
            seat = "B2";
        else if(B3.isSelected())
            seat = "B3";
        else if(B4.isSelected())
            seat = "B4";
        else if(B5.isSelected())
            seat = "B5";
        else if(B6.isSelected())
            seat = "B6";
        else if(B7.isSelected())
            seat = "B7";
        else if(B8.isSelected())
            seat = "B8";
        else if(B9.isSelected())
            seat = "B9";
        else if(B10.isSelected())
            seat = "B10";
        else if(C1.isSelected())
            seat = "C1";
        else if(C2.isSelected())
            seat = "C2";
        else if(C3.isSelected())
            seat = "C3";
        else if(C4.isSelected())
            seat = "C4";
        else if(C5.isSelected())
            seat = "C5";
        else if(C6.isSelected())
            seat = "C6";
        else if(C7.isSelected())
            seat = "C7";
        else if(C8.isSelected())
            seat = "C8";
        else if(C9.isSelected())
            seat = "C9";
        else if(C10.isSelected())
            seat = "C10";
        else if(D1.isSelected())
            seat = "D1";
        else if(D2.isSelected())
            seat = "D2";
        else if(D3.isSelected())
            seat = "D3";
        else if(D4.isSelected())
            seat = "D4";
        else if(D5.isSelected())
            seat = "D5";
        else if(D6.isSelected())
            seat = "D6";
        else if(D7.isSelected())
            seat = "D7";
        else if(D8.isSelected())
            seat = "D8";
        else if(D9.isSelected())
            seat = "D9";
        else if(D10.isSelected())
            seat = "D10";
        else if(E1.isSelected())
            seat = "E1";
        else if(E2.isSelected())
            seat = "E2";
        else if(E3.isSelected())
            seat = "E3";
        else if(E4.isSelected())
            seat = "E4";
        else if(E5.isSelected())
            seat = "E5";
        else if(E6.isSelected())
            seat = "E6";
        else if(E7.isSelected())
            seat = "E7";
        else if(E8.isSelected())
            seat = "E8";
        else if(E9.isSelected())
            seat = "E9";
        else if(E10.isSelected())
            seat = "E10";
        
        
        return seat;
        
        
    }
    
    public void seatCheckBox1(){
        if(A1.isSelected())
            sum2 += 8.00;
        else if(A2.isSelected())
            sum2 += 8.00;
        else if(A3.isSelected())
            sum2 += 8.00;
        else if(A4.isSelected())
            sum2 += 8.00;
        else if(A5.isSelected())
            sum2 += 8.00;
        else if(A6.isSelected())
            sum2 += 8.00;
        else if(A7.isSelected())
            sum2 += 8.00;
        else if(A8.isSelected())
            sum2 += 8.00;
        else if(A9.isSelected())
            sum2 += 8.00;
        else if(A10.isSelected())
            sum2 += 8.00;
        else if(B1.isSelected())
            sum2 += 8.00;
        else if(B2.isSelected())
            sum2 += 8.00;
        else if(B3.isSelected())
            sum2 += 8.00;
        else if(B4.isSelected())
            sum2 += 8.00;
        else if(B5.isSelected())
            sum2 += 8.00;
        else if(B6.isSelected())
            sum2 += 8.00;
        else if(B7.isSelected())
            sum2 += 8.00;
        else if(B8.isSelected())
            sum2 += 8.00;
        else if(B9.isSelected())
            sum2 += 8.00;
        else if(B10.isSelected())
            sum2 += 8.00;
        else if(C1.isSelected())
            sum2 += 8.00;
        else if(C2.isSelected())
            sum2 += 8.00;
        else if(C3.isSelected())
            sum2 += 8.00;
        else if(C4.isSelected())
            sum2 += 8.00;
        else if(C5.isSelected())
            sum2 += 8.00;
        else if(C6.isSelected())
            sum2 += 8.00;
        else if(C7.isSelected())
            sum2 += 8.00;
        else if(C8.isSelected())
            sum2 += 8.00;
        else if(C9.isSelected())
            sum2 += 8.00;
        else if(C10.isSelected())
            sum2 += 8.00;
        else if(D1.isSelected())
            sum2 += 10.00;
        else if(D2.isSelected())
            sum2 += 10.00;
        else if(D3.isSelected())
            sum2 += 10.00;
        else if(D4.isSelected())
            sum2 += 10.00;
        else if(D5.isSelected())
            sum2 += 10.00;
        else if(D6.isSelected())
            sum2 += 10.00;
        else if(D7.isSelected())
            sum2 += 10.00;
        else if(D8.isSelected())
            sum2 += 10.00;
        else if(D9.isSelected())
            sum2 += 10.00;
        else if(D10.isSelected())
            sum2 += 10.00;
        else if(E1.isSelected())
            sum2 += 10.00;
        else if(E2.isSelected())
            sum2 += 10.00;
        else if(E3.isSelected())
            sum2 += 10.00;
        else if(E4.isSelected())
            sum2 += 10.00;
        else if(E5.isSelected())
            sum2 += 10.00;
        else if(E6.isSelected())
            sum2 += 10.00;
        else if(E7.isSelected())
            sum2 += 10.00;
        else if(E8.isSelected())
            sum2 += 10.00;
        else if(E9.isSelected())
            sum2 += 10.00;
        else if(E10.isSelected())
            sum2 += 10.00;
        
        
        
        
        
    }
    
    
    
    public void bookButton(ActionEvent event) {
        String movie = movieChoiceBox.getValue();
        String time = timeChoiceBox.getValue();
        String date = dateChoiceBox.getValue();
        String seatno = seatCheckBox();
    }
    
    
        
    public void bookButton1(ActionEvent event){
        bookButton(event);
        String movie = movieChoiceBox.getValue();
        String time = timeChoiceBox.getValue();
        String date = dateChoiceBox.getValue();
        String seatno = seatCheckBox();
        
        if(movie!=null&&time!=null&&date!=null&&seatno!=null){
        try {
            OnAction.bookSeat(event, movie, date, time, seat);
        } catch (SQLException ex) {
            Logger.getLogger(bookingSeatController.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        }else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("THERE IS AN ERROR");
            alert.show();
        }
        
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        movieChoiceBox.getItems().addAll(movie1);
        timeChoiceBox.getItems().addAll(time1);
        dateChoiceBox.getItems().addAll(date1);
        movieChoiceBox.setOnAction(this::bookButton);
        timeChoiceBox.setOnAction(this::bookButton);
        dateChoiceBox.setOnAction(this::bookButton);
    }
    
    //FOOD & BEVERAGE PART
    
    @FXML
    private RadioButton food1,food2,food3,food4,food5,bev1,bev2,bev3,bev4,bev5;
    @FXML
    private Button submitButton;  
    @FXML
    private AnchorPane fnbAnchorPane;
    @FXML
    private AnchorPane paymentPage;        
    @FXML
    private Text foodLabel;
    @FXML
    private Button backToFandB;

    
    double sum0=0;
    double sum1=0;
    double total;
   
    public void getFood(ActionEvent event){
        
        if(food1.isSelected()){
            sum0+=13.00;
            
        }    
        else if(food2.isSelected())
            sum0+=5.00;
        else if(food3.isSelected())
            sum0+=5.00;
        else if(food4.isSelected())
            sum0+=3.50;
        else if(food5.isSelected())
            sum0+=2.00;
    }
    
    public void getBev(ActionEvent event){
        
        if(bev1.isSelected())
            sum1+=5.00;
        else if(bev2.isSelected())
            sum1+=5.00;
        else if(bev3.isSelected())
           sum1+=7.00;
        else if(bev4.isSelected())
            sum1+=5.00;
        else if(bev5.isSelected())
            sum1+=5.00;
    }
    
     public void submitButton(){   
        double total1 = total+sum2;
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText("Total cost: RM"+total1);
        alert.show();
    }
     
     public void submitButton1(){   
        total = sum0+sum1;
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText("Total cost: RM"+total);
        alert.show();
    }
    
    public void backToBookingSeat(){
        bookingSeatPage.setVisible(true);
        fnbAnchorPane.setVisible(false);
        
    }
    public void showPaymentPage(){
        paymentPage.setVisible(true);
        fnbAnchorPane.setVisible(true);
    }
    public void showFandB(){
        fnbAnchorPane.setVisible(true);
    }
    
    public void backToFandB(){
        paymentPage.setVisible(false);
        fnbAnchorPane.setVisible(true);
    }
    
}
