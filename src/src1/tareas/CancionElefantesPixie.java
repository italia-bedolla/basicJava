package src1.tareas;

import libs.Input;

public class CancionElefantesPixie {
	
	public static void main(String[] args) {
		//define el numero de elefantes
		int num_elefantes = 100;
		
		//Iniciar ciclo
		
		for (int i=1; i<=num_elefantes; i++) {
			//llamar metodo para imprimir estrofa
			estrofa_elefantes(i);
		}	
	}
	
	public static void estrofa_elefantes(int num){
		if(num<2){
			Input.print(num+" elefante se columpiaba sobre la tela de una araña,\n"
					+ "como veia que resistia, fue a llamar a otro elfante.");
		}
		else {
			Input.print(num+" elefantes se columpiaban sobre la tela de una araña,\n"
					+ "como veian que resistia, fueron a llamar a otro elfante.");
		}
		Input.print("\n\n");
	}

}
