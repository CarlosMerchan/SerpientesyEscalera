package controlador;

import java.util.Random;

import modelo.Jugador;

public class Movimientos {

	private static final int  DADO_MAX= 6;
	
	//Metodo que retorna un numero aleatorio entre 1 y 6
		 public static int tirarDado() {
			 Random aleatoria = new Random();
			 int numero = aleatoria.nextInt(DADO_MAX) + 1;		 
			 return numero;
		 }
		 
		//obtiene el valor del dado y lo suma a la posicion actual del jugador
		 public static void avanzar(int jugada,Jugador jugador) {
			 int valorDado = tirarDado();
			 System.out.println(jugada+" Dado arroja " + valorDado);
			 jugador.setPosicion(jugador.getPosicion() +valorDado);
			 	
				
		}
}
