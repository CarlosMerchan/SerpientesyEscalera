package modelo;

import java.util.Random;

public class Jugador {
	
 
 
 private int posicion = 0;
 private int numeroJugador= 0;
 
 
 //metodo constructor que setea el numero dle jugador
 public Jugador(int numeroJugador) {	 
	 this.numeroJugador = numeroJugador ;
 } 
 
 //obtiene la posicion de la variable privada posicion
 public int  getPosicion() {
	 return posicion;
 }
 
 //setea el valor de la posicion
 public void setPosicion(int posicion) {
	 this.posicion = posicion;
 }
 
 //metodo que retorna el numero del jugador
 public int getNumeroJugador() {
	 return this.numeroJugador;
 }
 
 


 

}