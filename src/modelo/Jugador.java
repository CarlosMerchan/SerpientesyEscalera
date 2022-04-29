package modelo;

import java.util.Random;

public class Jugador {
	
 
 private final int  DADO_MAX= 6;
 private int posicion = 0;
 private int numeroJugador = 0;
 
 
 
 
 public Jugador() {
	 
	 
 }
 
 //Metodo que retorna un numero aleatorio entre 1 y 6
 public int tirarDado() {
	 Random aleatoria = new Random();
	 int numero = aleatoria.nextInt(DADO_MAX) + 1;
	 
	 return numero;
 }
 
 //obtiene la posicion de la variable privada posicion
 public int  getPosicion() {
	 return posicion;
 }
 
 //setea el valor de la posicion
 public void setPosicion(int posicion) {
	 this.posicion = posicion;
 }
 
 //obtiene el valor del dado y lo suma a la posicion actual del jugador
 public void avanzar(int jugada) {
	 int valorDado = tirarDado();
	 System.out.println(jugada+" Dado arroja " + valorDado);
	 posicion += valorDado;
	 	
		
}

 public void setNumeroJugador(int jugadores) {
	 this.numeroJugador = jugadores;
 }
 
 
 public int getNumeroJugador() {
	 return this.numeroJugador;
 }
 

}