package src2.tareas;

import libs.Input;

public class InicialesDificilPixie {

	public static void main(String[] args) {
		//Pedir nombre
		Input.print("Escriba su nombre completo: ");
		String nombre = Input.get_string();
		
		//Trim spaces
		nombre = nombre.trim();
		
		//Split string by N number of simultaneous spaces
		String[] nameArray = nombre.split("\\s+"); 
		/* 
		 * "\s" White space
		 * "+" One or more occurrences
		 * */
		
		//Print Iniciales
		for(int y=0; y < nameArray.length; y++) {
			//Convertir todo a minusculas
			nameArray[y]= nameArray[y].toLowerCase();
			//Asignar primera letra a "inicial"
			String inicial = Character.toString(nameArray[y].charAt(0));
			//Imprimir inicial en Mayuscula
			Input.print(inicial.toUpperCase());
		}
	}
	
}
