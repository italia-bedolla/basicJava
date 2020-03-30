package src1.tareas;

import libs.Input;

public class MonedasPixie {
	
	public static void main(String[] args) {
		//Pedir al usuario cuanto cambio se le debe
		Input.print("Hola!, Cuanto cambio te debo?");
		float cambio = Input.get_float();
		
		//llamar metodo
		calcular_cambio_monedas(cambio);
		
	}
	
	public static void calcular_cambio_monedas(float cambio) {
		
		//acumulador de monedas
		int cont_25c;
		int cont_10c;
		int cont_5c;
		int cont_1c;
		//contador del resto del cambio
		float residuo;
		//Verificar si cambio tiene centavos
		if(cambio%1!=0){
			cambio = cambio*100;
		}
		
		//Dividir entre moneda 25c, acumular en monedas de 25c
		cont_25c = (int)cambio/25;
		//Sacar el residuo para cambio sobrante
		residuo = cambio%25;
		
		//Dividir entre moneda 10c, acumular en monedas de 10c
		cont_10c = (int)residuo/10;
		//Sacar el residuo para cambio sobrante
		residuo = residuo%10;
	
		//Dividir entre moneda 5c, acumular en monedas de 5c
		cont_5c = (int)residuo/5;
		//Sacar el residuo para cambio sobrante
		residuo = residuo%5;
	
		//Dividir entre moneda 1c, acumular en monedas de 1c
		cont_1c = (int)residuo/1;
		//Sacar el residuo para cambio sobrante
		residuo = residuo%1;
		
		Input.print("Num de monedas de 25c: " + cont_25c + "\n");
		Input.print("Num de monedas de 10c: " + cont_10c + "\n");
		Input.print("Num de monedas de 5c: " + cont_5c + "\n");
		Input.print("Num de monedas de 1c: " + cont_1c + "\n");
	}
}
