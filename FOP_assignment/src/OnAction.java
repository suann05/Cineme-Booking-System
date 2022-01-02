/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

/**
 *
 * @author ngsua
 */
public class OnAction {
    
    static Stage stage;
    static Scene scene;
    static Parent root;
    static int sum;
    
     
    
    public static void changeScene(ActionEvent e,String username,String fxmlfile) throws IOException{
        Parent root = null;
        
        if(username != null){
            try{
                FXMLLoader loader = new FXMLLoader(OnAction.class.getResource(fxmlfile));
                root = loader.load();
            }catch(IOException event){
                event.printStackTrace();
            }
        }
        else{
            try{
                root = FXMLLoader.load(OnAction.class.getResource(fxmlfile));
            }catch(IOException event){
                event.printStackTrace();
            }
        }
        Stage stage = (Stage) ((Node)e.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root,600,500));
        stage.show();   
        
        
    }
    
    public static void signupUser(ActionEvent event, String username, String mobile, String email , String password) throws SQLException{
        Connection connection = null;
        PreparedStatement psInsert = null;
        PreparedStatement psInsert1 = null;
        PreparedStatement psCheckUserExists = null;
        PreparedStatement psCheckUserExists1 = null;
        ResultSet resultSet = null;
        //ResultSet resultSet1 = null;
        
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javafx-loginsigup", "root", "root");
            psCheckUserExists = connection.prepareStatement("SELECT * FROM users WHERE username = ?");
            psCheckUserExists1 = connection.prepareStatement("SELECT * FROM users WHERE email = ?");
            psCheckUserExists.setString(1, username);
            psCheckUserExists1.setString(1, email);
            resultSet = psCheckUserExists.executeQuery();
            //resultSet1 = psCheckUserExists.executeQuery();
            
            if(resultSet.isBeforeFirst()){
                System.out.println("User already exists");
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("You cannot use this username");
                alert.show();
                
            }
            /*else if(resultSet1.isBeforeFirst()){
                System.out.println("Email already exists");
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("You cannot use this email");
                alert.show();
            }
*/
            
            else{
                psInsert = connection.prepareStatement("INSERT INTO users(username,`mobile number`,email,password) VALUES (?,?,?,?)");
                psInsert.setString(1, username);
                psInsert.setString(2, mobile);
                psInsert.setString(3, email);
                psInsert.setString(4, password);
                psInsert.executeUpdate();
                
            }
        } catch(SQLException e){
            e.printStackTrace();
        } finally{
            if(resultSet != null){
                try{
                resultSet.close();
                //resultSet1.close();
                }catch(SQLException e){
                    e.printStackTrace();
                }
            }
            if(psCheckUserExists != null && psCheckUserExists1 != null ){
                try{
                psCheckUserExists.close();
                psCheckUserExists1.close();
                }catch(SQLException e){
                    e.printStackTrace();
            
        }
    }
            if(psInsert != null && psInsert1 != null ){
                try{
                psInsert.close();
                psInsert1.close();
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
    
    public static void loginUser(ActionEvent event,String username,String password)throws SQLException, IOException{
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet2 = null;
        
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javafx-loginsigup", "root", "root");
            preparedStatement = connection.prepareStatement("SELECT password FROM users WHERE username = ?");
            preparedStatement.setString(1, username);
            resultSet2 = preparedStatement.executeQuery();
            
            if(!(resultSet2.isBeforeFirst())){
                System.out.println("User not found");
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Provided credentials are incorrect");
                alert.show();
            }
            else{
                while(resultSet2.next()){
                    String retrivedPassword = resultSet2.getString("password");
                    if(retrivedPassword.equals(password)){
                         changeScene(event,username,"chooseChar.fxml"); 
                        
                    }
                    else{
                        System.out.println("Password is incorrect");
                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setContentText("Provided credentials are incorrect");
                        alert.show();
                        
                    }
                }
            }
            
        }catch(SQLException e){
            e.printStackTrace();
        } finally{
            if(resultSet2!=null){
                try{
                    resultSet2.close();
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
    
    public static void bookSeat(ActionEvent event,String movie,String date,String time,String seat)throws SQLException{
        
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookingseat", "root", "root");
            preparedStatement = connection.prepareStatement("SELECT * FROM seat WHERE movie = ? and date = ? and time=? and seat=?");
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
                
               sum+=8;
               Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
               alert.setContentText("Total cost: RM"+sum);
               alert.show(); 

               preparedStatement = connection.prepareStatement("INSERT INTO seat(movie,date,time,seat) VALUES (?,?,?,?)");
               preparedStatement.setString(1, movie);
               preparedStatement.setString(2, date);
               preparedStatement.setString(3, time);
               preparedStatement.setString(4, seat);
               int k = preparedStatement.executeUpdate();
               
               if(k==1){
                   alert = new Alert(Alert.AlertType.CONFIRMATION);
                   alert.setContentText("THE SEAT "+seat+" IS NOW RESERVED FOR YOU");
                   alert.show();
               }else{
                   alert = new Alert(Alert.AlertType.ERROR);
                   alert.setContentText("THERE IS AN ERROR");
                   alert.show();
               }
            
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
    
}
