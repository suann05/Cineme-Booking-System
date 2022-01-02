
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ngsua
 */
public class foodandBevController {
    
    @FXML
    RadioButton food1,food2,food3,food4,food5,bev1,bev2,bev3,bev4,bev5;
    @FXML
    Button submitButton;   
    
    
    
    double sum=0;
    double sum1=0;
   
    public void getFood(ActionEvent event){
        
        if(food1.isSelected())
            sum+=13.00;
        else if(food2.isSelected())
            sum+=5.00;
        else if(food3.isSelected())
            sum+=5.00;
        else if(food4.isSelected())
            sum+=3.50;
        else if(food5.isSelected())
            sum+=2.00;
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
        double total = sum+sum1;
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText("Total cost: RM"+total);
        alert.show();
       
    }
    
}
