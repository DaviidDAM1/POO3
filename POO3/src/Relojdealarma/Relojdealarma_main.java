package Relojdealarma;

public class Relojdealarma_main {

	public static void main(String[] args) {
		Relojdealarma miReloj = new Relojdealarma();
		 System.out.println("Hora de Alarma: " + miReloj.gethoraalarmaa());
	        System.out.println("Hora Actual: " + miReloj.getHoraActual());
	        System.out.println("Alarma Activada: " + miReloj.isalarmaactivadaXD());
	        miReloj.comprobarAlarma();
	    }
	

	}


