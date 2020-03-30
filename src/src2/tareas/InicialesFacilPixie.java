package src2.tareas;

import libs.Input;

public class InicialesFacilPixie {
	
	public static void main(String[] args) {
		//Pedir nombre
		Input.print("Escriba su nombre completo: ");
		String nombre = Input.get_string();
		
		//Recorrer string e imprimir si es mayuscula
		for(int i=0; i< nombre.length(); i++) {
			if (nombre.charAt(i) >= 'A' && nombre.charAt(i) <= 'Z') {
				Input.print(nombre.charAt(i));
			}
		}
	}

}
