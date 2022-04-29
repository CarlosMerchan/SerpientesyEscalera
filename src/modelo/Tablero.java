package modelo;

public class Tablero {
	
	public static final int MAX_TABLERO = 25;
	private boolean play =true;
	private Jugador jugador;
	private int  jugada=1;
	
	
	
	
	//metodo constructor que setea la instacia del jugador e inicia el juego, tambien indica el numero del jugador
	public Tablero(Jugador jugador,int numeroJugador) {
		this.jugador = jugador;
		jugador.setNumeroJugador(numeroJugador);
		iniciarJuego();
	}
	
	//metodo que inicia el bucle del juego
	private void iniciarJuego() {
		 System.out.println("Nuevo Jugador numero de jugador "+ jugador.getNumeroJugador());
		 while(play) {
			 jugador.avanzar(jugada);
			 jugada++;
			 validarFin(jugador.getPosicion());
			 
			 
			 }
	 }
	 
	/*metodo que valida a traves de la posicion del jugador si termino en una escalera o una serpiente y 
	 * lo mueve a la casilla correspondiente
	 */
	private void validarPosicion(int posicion) {
		
		switch(posicion) {
		
		case 3 :
			jugador.setPosicion(11);
			System.out.println(jugada+" Jugador N."+jugador.getNumeroJugador()+" sube por escalera  a:" + jugador.getPosicion());
			 jugada++;
			break;
			
		case 6:
			jugador.setPosicion(17);
			System.out.println(jugada+" Jugador N."+jugador.getNumeroJugador()+" sube por escalera  a:" + jugador.getPosicion());
			 jugada++;
			break;
			
		case 9:
			jugador.setPosicion(18);
			System.out.println(jugada+" Jugador N."+jugador.getNumeroJugador()+" sube por escalera  a:" + jugador.getPosicion());
			 jugada++;
				break;
				
		case 10:
			jugador.setPosicion(12);
			System.out.println(jugada+" Jugador N."+jugador.getNumeroJugador()+" sube por escalera  a:" + jugador.getPosicion());
			 jugada++;
			break;	
	
		case 14:
			jugador.setPosicion(4);
			System.out.println(jugada+" Jugador N."+jugador.getNumeroJugador()+" deciende   a:" + jugador.getPosicion());
			 jugada++;
			break;
			
		case 19:
			jugador.setPosicion(8);
			System.out.println(jugada+" Jugador N."+jugador.getNumeroJugador()+" desciende a:" + jugador.getPosicion());
			 jugada++;
			break;
			
		case 22:
			jugador.setPosicion(20);
			System.out.println(jugada+" Jugador N."+jugador.getNumeroJugador()+" desciende a:" + jugador.getPosicion());
			 jugada++;
				break;
				
		case 24:
			jugador.setPosicion(16);
			System.out.println(jugada+" Jugador N."+jugador.getNumeroJugador()+" desciende a:" + jugador.getPosicion());
			 jugada++;
			
			break;
			
		default :
			System.out.println(jugada+" Jugador N."+jugador.getNumeroJugador()+" avanza a cuadro :" + jugador.getPosicion());
			 jugada++;

			break;
	
		}
		
	}
	
	/*metodo para validar deternimar si ya llego a la casilla 25 para acabar el loop
	 * sin no, valida si callo sea en serpiente o escalera y mueve al jugador por el tablero
	 */
	public void validarFin(int posicion) {
		if(posicion == MAX_TABLERO){
			System.out.println(jugada+ " El jugador N."+ jugador.getNumeroJugador()+" llego cuadro "+MAX_TABLERO);
			System.out.println((jugada+1)+ "Jugador N."+jugador.getNumeroJugador() +" Fin" );
			play = false;
		}else if(posicion > MAX_TABLERO){
			int valorRetroceso = posicion - MAX_TABLERO;
			jugador.setPosicion(MAX_TABLERO - valorRetroceso);
			
			System.out.println(jugada + " El jugador N."+jugador.getNumeroJugador()+" retrocedio "+valorRetroceso+" ya que supero la casilla 25");
			System.out.println("Posicion Actual jugador N."+jugador.getNumeroJugador()+" es =" + jugador.getPosicion());
			jugada++;
		}else{
			validarPosicion(jugador.getPosicion());
		}
	}
	
	public int getJugada() {
		return jugada;
	}
	

}
