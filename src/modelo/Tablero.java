package modelo;

public class Tablero {
	
	public static final int MAX_TABLERO = 25;
	private boolean play =true;
	private Jugador jugador;
	private int  jugada=1;
	
	
	
	
	
	public Tablero(Jugador jugador) {
		this.jugador = jugador;
		iniciarJuego();
	}
	
	private void iniciarJuego() {
		 
		 while(play) {
			 jugador.avanzar(jugada);
			 jugada++;
			 validarFin(jugador.getPosicion());
			 
			 
			 }
	 }
	
	private void validarPosicion(int posicion) {
		
		switch(posicion) {
		
		case 3 :
			jugador.setPosicion(11);
			System.out.println(jugada+" Jugador sube por escalera  a:" + jugador.getPosicion());
			break;
			
		case 6:
			jugador.setPosicion(17);
			System.out.println(jugada+" Jugador sube por escalera  a:" + jugador.getPosicion());
			break;
			
		case 9:
			jugador.setPosicion(18);
			System.out.println(jugada+" Jugador sube por escalera  a:" + jugador.getPosicion());
				break;
				
		case 10:
			jugador.setPosicion(12);
			System.out.println(jugada+" Jugador sube por escalera  a:" + jugador.getPosicion());
			
			break;	
	
		case 14:
			jugador.setPosicion(4);
			System.out.println(jugada+" Jugador deciende   a:" + jugador.getPosicion());
			break;
			
		case 19:
			jugador.setPosicion(8);
			System.out.println(jugada+" Jugador desciende a:" + jugador.getPosicion());
			break;
			
		case 22:
			jugador.setPosicion(20);
			System.out.println(jugada+" Jugador desciende a:" + jugador.getPosicion());
				break;
				
		case 24:
			jugador.setPosicion(16);
			System.out.println(jugada+" Jugador desciende a:" + jugador.getPosicion());
			
			break;
			
		default :
			System.out.println(jugada+" Jugador avanza a cuadro :" + jugador.getPosicion());
			 jugada++;

			break;
	
		}
		
	}
	
	public void validarFin(int posicion) {
		if(posicion > MAX_TABLERO){
			System.out.println(jugada+ " El jugador supera el cuadro "+MAX_TABLERO);
			System.out.println((jugada+1)+ " Fin" );
			play = false;
		}else {
			validarPosicion(jugador.getPosicion());
		}
	}
	
	public int getJugada() {
		return jugada;
	}
	

}
