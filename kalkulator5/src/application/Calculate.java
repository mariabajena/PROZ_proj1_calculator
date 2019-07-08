package application;

import java.util.List;

import jdk.jshell.JShell;
import jdk.jshell.SnippetEvent;

public class Calculate {
	public static String calculateResult(int operation, String data) {
		String ans = "";
		Float ansFl = 1f;

		if(operation == 0) {
    		ans=calculateResultShell(data);	
		}
    		
		else if (operation == 1) { //power
			String[] parts = data.split("\\^"); // String array, each element is text between dots
			String firstOperandString = parts[0];  //before ^  
			String secondOperandString = parts[1]; //after ^

			Float firstOperand = Float.parseFloat(firstOperandString); 
			Float secondOperand = Float.parseFloat(secondOperandString);
		
			while (secondOperand!=0)
			{ 
				 ansFl = ansFl * firstOperand;
				 secondOperand--;
			}
			
			ans=String.valueOf(ansFl);
			
		}
		
		else if (operation == 2) { //fact
			String[] parts = data.split("\\!"); // String array, each element is text between dots
			String firstOperandString = parts[0];
			Float firstOperand = Float.parseFloat(firstOperandString);
			
			while(firstOperand!=1) {
				ansFl = ansFl * firstOperand;
				firstOperand--;
			}
			ans=String.valueOf(ansFl);
		}
		return ans;
	}
	    
	public static String calculateResultShell(String data) {
		String ans = "";
		JShell jshell = JShell.create();
		try (jshell) { 
			List<SnippetEvent> events = jshell.eval(data);
			for (SnippetEvent e : events) {
			if (e.causeSnippet() == null) {
			switch (e.status()) {
			case VALID:
			if (e.value() != null) {
				//display.setText( e.value());
				System.out.printf(e.value());
				ans = e.value();
			}
			break;
			default: System.out.printf("Error\n"); break;
			} 
			} } }
		return ans;
		} 
}
