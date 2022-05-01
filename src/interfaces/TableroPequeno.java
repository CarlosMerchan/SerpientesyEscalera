package interfaces;

import modelo.Jugador;
import modelo.Tablero;

public class TableroPequeno extends Tablero implements ITableros {

	private final int MAX_CUADROS = 25;
	
	/*metodo que valida a traves de la posicion del jugador si termino en una escalera o una serpiente y 
	 * lo mueve a la casilla correspondiente
	 */
	@Override
	public void validarPosicion(Jugador jugador) {
		
		switch(jugador.getPosicion()) {
		
		case 3 :
			jugador.setPosicion(11);
			System.out.println(this.getJugada()+" Jugador N."+jugador.getNumeroJugador()+" sube por escalera  a:" + jugador.getPosicion());
			 this.incrementarJugada();;
			break;
			
		case 6:
			jugador.setPosicion(17);
			System.out.println(this.getJugada()+" Jugador N."+jugador.getNumeroJugador()+" sube por escalera  a:" + jugador.getPosicion());
			 this.incrementarJugada();;
			break;
			
		case 9:
			jugador.setPosicion(18);
			System.out.println(this.getJugada()+" Jugador N."+jugador.getNumeroJugador()+" sube por escalera  a:" + jugador.getPosicion());
			 this.incrementarJugada();;
				break;
				
		case 10:
			jugador.setPosicion(12);
			System.out.println(this.getJugada()+" Jugador N."+jugador.getNumeroJugador()+" sube por escalera  a:" + jugador.getPosicion());
			 this.incrementarJugada();;
			break;	
	
		case 14:
			jugador.setPosicion(4);
			System.out.println(this.getJugada()+" Jugador N."+jugador.getNumeroJugador()+" deciende   a:" + jugador.getPosicion());
			this.incrementarJugada();
			break;
			
		case 19:
			jugador.setPosicion(8);
			System.out.println(this.getJugada()+" Jugador N."+jugador.getNumeroJugador()+" deciende   a:" + jugador.getPosicion());
			this.incrementarJugada();
			break;
			
		case 22:
			jugador.setPosicion(20);
			System.out.println(this.getJugada()+" Jugador N."+jugador.getNumeroJugador()+" deciende   a:" + jugador.getPosicion());
			this.incrementarJugada();
				break;
				
		case 24:
			jugador.setPosicion(16);
			System.out.println(this.getJugada()+" Jugador N."+jugador.getNumeroJugador()+" deciende   a:" + jugador.getPosicion());
			this.incrementarJugada();
			
			break;
			
		default :
			System.out.println(this.getJugada()+" Jugador N."+jugador.getNumeroJugador()+" avanza a cuadro :" + jugador.getPosicion());
			this.incrementarJugada();

			break;
	
		}
		
	}

	/*metodo para validar deternimar si ya llego a la casilla 25 para acabar el loop
	 * sin no, valida si callo sea en serpiente o escalera y mueve al jugador por el tablero
	 */
	@Override
	public boolean validarFin(Jugador jugador) {
		if(jugador.getPosicion() == this.MAX_CUADROS){
			System.out.println(this.getJugada()+ " El jugador N."+ jugador.getNumeroJugador()+" llego al cuadro "+ this.MAX_CUADROS + " ha Ganado!!");
			System.out.println((this.getJugada()+1)+" Fin" );
			return false;
		}else if(jugador.getPosicion() > this.MAX_CUADROS){
			int valorRetroceso = jugador.getPosicion() - this.MAX_CUADROS;
			jugador.setPosicion(this.MAX_CUADROS - valorRetroceso);			
			System.out.println(this.getJugada() + " El jugador N."+jugador.getNumeroJugador()+" retrocedio "+valorRetroceso+" ya que supero la casilla 25");
			System.out.println("Posicion Actual jugador N."+jugador.getNumeroJugador()+" es =" + jugador.getPosicion());
			this.incrementarJugada();;
		}else{
			validarPosicion(jugador);
		}
	
		return true;
	}
	
	//llama al metodo get de la clase padre tablero
		@Override
		public int getJugada() {
			return super.getJugada();
		}
		
		//llama al metodo de clase padre tablero para incrementar el contador de jugadas
		@Override
		public void incrementarJugada() {
		super.incrementarJugada();	
		}

}
