package src2.tareas;

import libs.Input;

// A = 65
// Z = 90

public class CifradoCesarPixie {
	
	public static void main(String[] args) {
		//Get Message
		Input.print("Enter message: ");
		String message = Input.get_string();
		
		//Get encrypt num
		Input.print("Enter number to encrypt: ");
		int num = Input.get_int();
		//validacion para que introduzca valor 1 y 25
		if (num<=0 || num>=26) {
			do {
				Input.print("Error, The number must be between 1-25 \n Please enter a valid number:");
				num = Input.get_int();
			}while(num<=0 || num>=26);
		}
		
		//Convert to uppercase
		message = message.toUpperCase();
		
		//call method
		EncryptMessage(message,num);
	}

	public static void EncryptMessage(String message, int num) {
		//loop through chars
		for(int i=0; i< message.length(); i++) {
			//Get ASCII position
			int asciiPosition = (int)message.charAt(i);
			Input.print(message.charAt(i) + " = " + asciiPosition + "-->");
			//Encrypt
			int encryptedChar = asciiPosition + num;
			//If higher than 90
			if (encryptedChar > 90) {
				int residuo = encryptedChar - 90;
				encryptedChar = 64 + residuo;
			}
			Input.print((char)encryptedChar + "\n");

		}
	}
}
