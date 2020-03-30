package src1.tareas;

import libs.Input;

public class BotellasDeAguaPixie {
	
	public static void main(String[] args) {
		//Obtener minutos de baño
		Input.print("Cuantos minutos te tomas al bañarte? : ");
		int minutos = Input.get_int();
		
		//Calcular cuantas botellas de agua gasto
		int gasto = botellas_gastadas(minutos);
		
		//Imprimir resultado
		Input.print("Has gastado "+gasto+" botellas de agua.");
		
	}
	
	public static int botellas_gastadas(int minutos) {
		int botellas = 12;
		return minutos * botellas;
	}

}
