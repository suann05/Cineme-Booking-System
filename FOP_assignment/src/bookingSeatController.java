
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
public class bookingSeatController implements Initializable {
    
    @FXML
    ChoiceBox<String> movieChoiceBox;
    @FXML
    ChoiceBox<String> timeChoiceBox;
    @FXML
    ChoiceBox<String> dateChoiceBox;
    @FXML
    Button bookButton;
    @FXML
    Button backButton;
    @FXML
    TextField billTextField;
    @FXML
    Button fandbButton;
    @FXML
    CheckBox A1,A2,A3,A4,A5,A6,A7,A8,A9,A10,
             B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,
             C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,
             D1,D2,D3,D4,D5,D6,D7,D8,D9,D10,
             E1,E2,E3,E4,E5,E6,E7,E8,E9,E10;
    
    private Stage stage;
    private Scene scene;
    private Parent root;
    private String[] movie1 = {"Spider Man","Venom"};
    private String[] time1 = {"14:30","17:30"};
    private String[] date1 = {"3/1/2021","7/1/2021"};
    int sum=0;
    String seat = "";
    
    
    
    public void backButton(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("customer.fxml"));
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
    
    public void fandbButton(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("foodandBev.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    /*public static void bookSeat(ActionEvent event,String movie,String date,String time,String seat)throws SQLException{
        
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookingseat", "root", "root");
            preparedStatement = connection.prepareStatement("SELECT * FROM seat WHERE movie = ? and date = ? and time = ? and seat = ?");
            preparedStatement.setString(1, movie);
            preparedStatement.setString(2, date);
            preparedStatement.setString(3, time);
            preparedStatement.setString(4, seat);
            resultSet = preparedStatement.executeQuery();
            
            if(resultSet.isBeforeFirst()){
                
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("THIS SEAT ("+seat+") HAS BEEN CHOSEN");
                alert.show();
            }
            else{
               preparedStatement = connection.prepareStatement("INSERT INTO users(movie,date,time,seat) VALUES (?,?,?,?)");
               preparedStatement.setString(1, movie);
               preparedStatement.setString(2, date);
               preparedStatement.setString(3, time);
               preparedStatement.setString(4, seat);
               preparedStatement.executeUpdate();
            }
            
        }catch(SQLException e){
            e.printStackTrace();
        } finally{
            if(resultSet!=null){
                try{
                    resultSet.close();
                }catch(SQLException e){
                    e.printStackTrace();
                }
            }
            if(preparedStatement!=null){
                try{
                    preparedStatement.close();
                }catch(SQLException e){
                    e.printStackTrace();
                }
            }
            if(connection!=null){
                try{
                    connection.close();
                }catch(SQLException e){
                    e.printStackTrace();
                }
            }
            
        }
    }
    */


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        movieChoiceBox.getItems().addAll(movie1);
        timeChoiceBox.getItems().addAll(time1);
        dateChoiceBox.getItems().addAll(date1);
        movieChoiceBox.setOnAction(this::bookButton);
        timeChoiceBox.setOnAction(this::bookButton);
        dateChoiceBox.setOnAction(this::bookButton);
    }
    
    public void bill(ActionEvent event){
        bookButton(event);
        String movie = movieChoiceBox.getValue();
        String time = timeChoiceBox.getValue();
        String date = dateChoiceBox.getValue();
        String seatno = seatCheckBox();
        
        billTextField.setText(billTextField.getText()+"********************************************************");
        billTextField.setText("***************************BILL*************************");
        billTextField.setText("Movie:"+movie);
        
        
    }
    
}
