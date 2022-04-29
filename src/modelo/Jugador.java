package modelo;

import java.util.Random;

public class Jugador {
	
 
 private final int  DADO_MAX= 6;
 private int posicion = 0;
 
 
 
 
 public Jugador() {
	 
	 
 }
 
 public int tirarDado() {
	 Random aleatoria = new Random();
	 int numero = aleatoria.nextInt(DADO_MAX) + 1;
	 
	 return numero;
 }
 
 
 public int  getPosicion() {
	 return posicion;
 }
 
 public void setPosicion(int posicion) {
	 this.posicion = posicion;
 }
 
 public void avanzar(int jugada) {
	 int valorDado = tirarDado();
	 System.out.println(jugada+" Dado arroja " + valorDado);
	 posicion += valorDado;
	 	
		
}
 
 

}