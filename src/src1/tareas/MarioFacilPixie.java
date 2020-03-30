package src1.tareas;

import libs.Input;

public class MarioFacilPixie {
	
	public static void main(String[] args) {
		//Obtener altura de piramide
		Input.print("Height: ");
		int height = Input.get_int();
		//llamar metodo que imprime piramide
		imprimir_piramide(height);
		}	
	
	public static void imprimir_piramide(int height){
		
		for (int i=1; i <= height; i++) {
			//Imprimir espacios
			for (int j=1; j <= height-i; j++) {
				Input.print(" ");
			}
			
			//Imprimir gatitos
			for (int k=1; k <= i+1; k++) {
				Input.print("#");
			}
			
			//Salto de linea
			Input.print("\n");	
		}
	}
}
