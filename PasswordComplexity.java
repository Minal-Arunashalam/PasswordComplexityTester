//Minal
import java.util.Scanner;

public class PasswordComplexity {
	
	public static boolean isComplex(String password) {
		
		 boolean isComplex = false;
		
		 boolean passwordLength=false;
		 boolean hasLower=false;
		 boolean hasUpper=false;
	     boolean hasDigit=false;
	     boolean hasSpecialChar=false;
	     
	     //convert password to an array of characters
	     char[] passwordCharacters = password.toCharArray();
	     //specify special characters in char array
	     char[] specialChars = {'.','_','!','@',']','#','$','%','^','&','*'};
	     
	     for (int i=0; i<password.length(); i++){
	    	 
	    	 	//check password length
	    	 	if (password.length() >= 8) 
	    	 		passwordLength=true; 
	    	 	
	    	 	//seperate if statements so that they run individually, instead of changing the boolean vars everytime
	    	 	//check if character i is lowercase
	    	    if (Character.isLowerCase(passwordCharacters[i])) 
	                hasLower=true;
	            
	    	    //check if character is uppercase
	            if (Character.isUpperCase(passwordCharacters[i]))
	                hasUpper=true;
	            
	            //check if char is digit
	            if (Character.isDigit(passwordCharacters[i])) 
	                hasDigit=true;
	            
	          //create for loop within first for loop to check if there are any special chars
	          for (int i2=0; i2<specialChars.length; i2++) {   
	          //check if char i in specialChars array is equal to the current char i from the passwordCharacters array
	            if (specialChars[i2]==passwordCharacters[i]) 
	            	hasSpecialChar=true;
	          }
	            
	       }
	     
	     //if all conditions are true, then password is complex enough
	     if (passwordLength==true && hasDigit==true && hasLower==true && hasUpper==true && hasSpecialChar==true) {
	    	 
	    	 isComplex=true;
	    	 
	     }
	     
	     //return updated isComplex var
	     return isComplex;
	     
	     
	     }
	      
	     
	     
	
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a password: ");
	    String password = scanner.nextLine();

	    System.out.println(isComplex(password));
	    System.out.println("If output is true, password is complex enough. If false, choose a stronger password. ");
	    
	    
	}


}
