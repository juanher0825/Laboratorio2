package ui;

/*This is the MagicSquare's Controller and you can do more things that can´t do in SceneBuilder
 * 
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Region;
import javafx.scene.layout.RowConstraints;
import model.*;

public class MagicSquareController {
	
	private MagicSquare control;

    @FXML
    private TextField txtField1;

    @FXML
    private ComboBox<String> comboBox1;

    @FXML
    private ComboBox<String> comboBox2;

    @FXML
    private Button Buttom1;

    @FXML
    private GridPane grid;

    @FXML
    
    /*This method is to control the event of buttom
     * @param : ActionEvent event
     * @return: void
     */
    void Buttom1(ActionEvent event) throws Exception, NumberFormatException{
    	try {
    		grid.getChildren().clear();
        	grid.getColumnConstraints().add(new ColumnConstraints(40));
        	grid.getRowConstraints().add(new RowConstraints(35));
        	grid.setAlignment(Pos.CENTER);
        	boolean flag=true;
        	String startD= comboBox1.getValue();
        	 MouseEvent m = null;
        	boolean inFlag=items(m,startD);
            int num=Integer.parseInt(txtField1.getText());      
            String directionW=comboBox2.getValue();
            
            if(num%2==0) {
            	flag=false;
            	Alert alert = new Alert(AlertType.INFORMATION, "Incorrect", ButtonType.OK);
            	alert.getDialogPane().setMinHeight(Region.USE_PREF_SIZE);
            	alert.show();
            	txtField1.setText("");
            } 
            if(flag==true && inFlag==true) {
            	int[][]ma=control.initSquare(num,directionW,startD);
             	for (int rowIndex = 0; rowIndex < num; rowIndex++) { 
             	   for (int colIndex = 0; colIndex < num; colIndex++) {  
             		 int n=ma[rowIndex][colIndex];
             		 Button lab = new Button(""+n); 
             		 lab.setStyle("-fx-border-color: Black; -fx-fond-size: 10;-fx-background-color: LightGray;");
             		 GridPane.setConstraints(lab, colIndex, rowIndex, 1, 1);
             		 grid.getChildren().addAll(lab);
             	    
             	   }
             	}
             	comboBox2.getItems().clear();
             	comboBox2.setVisible(false);
             	Buttom1.setText("Continue");
             	Buttom1.setStyle("-fx-background-color: Red");
            }
    	}catch(NullPointerException e) {
    		System.out.println("Error");
    	}catch(NumberFormatException a) {
    		System.out.println("Coloca un numero valido");
    	}
    	
       
    }
    @FXML
    /*This method is to initialize the comboBox with items
     * @param:
     * @return: void
     */
    void initialize() {
    	comboBox2.setVisible(false);
    	control = new MagicSquare();
        comboBox1.getItems().add("Up");
        comboBox1.getItems().add("Right");
        comboBox1.getItems().add("Down");
        comboBox1.getItems().add("Left");
        Buttom1.setText("Continue");
   
    }
    /*This method is to the diferents magicSquare that you can select
     * @param: MouseEvent ivent, String option
     * @return: boolean
     */
    public boolean items(MouseEvent ivent, String option) {
    	boolean go=false;
    	comboBox2.setVisible(true);
        if(option.equals("Up")) {
        	comboBox2.getItems().add("NO");
        	comboBox2.getItems().add("NE");    
        }else if(option.equals("Down")) {
        	comboBox2.getItems().add("SO");
        	comboBox2.getItems().add("SE");
        }else if(option.equals("Right")) {
        	comboBox2.getItems().add("NE");   
        	comboBox2.getItems().add("SE");
        }else if(option.equals("Left")) {	
        	comboBox2.getItems().add("NO");   
        	comboBox2.getItems().add("SO");
        }
        go=true;
        Buttom1.setText("Start");
        Buttom1.setStyle("-fx-background-color: LightBlue");
        return go;
   }	
}
    




