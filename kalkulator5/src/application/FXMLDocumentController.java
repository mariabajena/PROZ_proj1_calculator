package application;

import application.Calculate;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


/**
*
*@author Maria Bajena
 * @param <display>
*/
public class FXMLDocumentController implements Initializable {
	
		String data = "";
		int operation = 0;
		String ans = "";
		
	    @FXML
	    private Button point;

	    @FXML
	    private Button minus;

	    @FXML
	    private Button nine;

	    @FXML
	    private Button six;

	    @FXML
	    private Button mult;

	    @FXML
	    private Button fact;

	    @FXML
	    private Button mod;

	    @FXML
	    private Button one;

	    @FXML
	    private TextField display;

	    @FXML
	    private Button clear;

	    @FXML
	    private Button seven;

	    @FXML
	    private Button two;

	    @FXML
	    private Button three;

	    @FXML
	    private Button plus;

	    @FXML
	    private Button eight;

	    @FXML
	    private Button zero;

	    @FXML
	    private Button div;

	    @FXML
	    private Button four;

	    @FXML
	    private Button equals;

	    @FXML
	    private Button power;

	    @FXML
	    private Button five;
	    
	    @FXML
	    void handleButtonAction(ActionEvent event) {
	    	if(event.getSource() == one) {
	    		display.setText(display.getText() + "1");	 //display digit
	    	}else if (event.getSource() == two) {
	            display.setText(display.getText() + "2");
	        } else if (event.getSource() == three) {
	            display.setText(display.getText() + "3");
	        } else if (event.getSource() == four) {
	            display.setText(display.getText() + "4");
	        } else if (event.getSource() == five) {
	            display.setText(display.getText() + "5");
	        } else if (event.getSource() == six) {
	            display.setText(display.getText() + "6");
	        } else if (event.getSource() == seven) {
	            display.setText(display.getText() + "7");
	        } else if (event.getSource() == eight) {
	            display.setText(display.getText() + "8");
	        } else if (event.getSource() == nine) {
	            display.setText(display.getText() + "9");
	        } else if (event.getSource() == zero) {
	            display.setText(display.getText() + "0");
	        } else if (event.getSource() == clear) {
	            display.setText("");
	        } else if (event.getSource() == plus) {
	            display.setText(display.getText() + "+");
	        } else if (event.getSource() == minus) {
	            display.setText(display.getText() + "-");
	        } else if (event.getSource() == mult) {
	            display.setText(display.getText() + "*");
	        } else if (event.getSource() == div) {
	            display.setText(display.getText() + "/");
	        } else if (event.getSource() == power) {
	        	operation = 1;
	            display.setText(display.getText() + "^");
	        } else if (event.getSource() == fact) {
	        	operation = 2;
	            display.setText(display.getText() + "!");
	        } else if (event.getSource() == mod) {
	            display.setText(display.getText() + "%");
	        } else if (event.getSource() == point) {
	        	display.setText(display.getText() + ".");
	        }
	    	
	        else if(event.getSource() == equals) {
	        	data = display.getText();
	        	
	        	ans = Calculate.calculateResult(operation, data); //from calc module
	        	display.setText(ans);
	        }
	     }
	    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
}