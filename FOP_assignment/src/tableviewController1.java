
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ngsua
 */
public class tableviewController1 implements Initializable {
    
    @FXML
    private TableView<Fnb> tableView1;
    @FXML
    private TableColumn<Fnb, String> nameCol;
    @FXML
    private TableColumn<Fnb, String> desCol;
    @FXML
    private TableColumn<Fnb, String> priceCol;
    
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    String query = null;
    Connection connection = null ;
    PreparedStatement preparedStatement = null ;
    ResultSet resultSet = null ;
    Fnb fnb = null ;
    
    ObservableList<Fnb>  fnbList = FXCollections.observableArrayList();
    
    public void refreshTable(){
         try {
            fnbList.clear();
            
            query = "SELECT * FROM fandb";
            preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()){
                fnbList.add(new Fnb(
                        
                        resultSet.getString("name"),
                        resultSet.getString("des"),
                        resultSet.getString("price")));
                tableView1.setItems(fnbList);
                
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(tableviewController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        loadDate();
    }
    
    public void loadDate(){
        
        connection = OnAction.getConnect1();
        refreshTable();
        
        
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        desCol.setCellValueFactory(new PropertyValueFactory<>("des"));
        priceCol.setCellValueFactory(new PropertyValueFactory<>("price"));
        
    }
    
    public void backButton(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("staff.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
}
