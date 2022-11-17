package n1exercici1;

public class App {

	public static void main(String[] args) {

		/*
		 * Definimos 2 variablas String, una de ellas static
		 * En el bloque estático le asignamos valor a la variable estática
		 * El el bloque de inicialización le asignamos a la variable de instancia el valor de la variable estática
		 * Creamos 2 constructores para instanciar las clases.
		 * En cada clase pusimos estos 3 pasos mencionados anteriormente en distinto orden y verificamos el proceso de carga ya
		 * que siempre quedaba el último valor de los 3 que menciono a continuacion indipendientemente del orden
		 * en el que figuran en la clase:
		 * 
		 * 1 bloque estático
		 * 2 bloque de inicialización
		 * 3 constructor
		 * 
		 **/
		
		//  Instrumento de Viento
		System.out.println("Instrumento de Viento");
		Instrumento viento1 = new InstrumentoDeViento("Trompeta", 200);
		viento1.tocar();
		Instrumento viento2 = new InstrumentoDeViento();
		viento2.tocar(); 
		Instrumento viento3 = new InstrumentoDeViento("Flauta", 1000);
		viento3.tocar();		
		Instrumento viento4 = new InstrumentoDeViento();
		viento4.tocar();
		
		System.out.println("----------------");
		
		// Instrumento de cuerda
		System.out.println("Instrumento de cuerda");
		Instrumento cuerda1 = new InstrumentoDeCuerda("mandolina");
		cuerda1.tocar();
		Instrumento cuerda2 = new InstrumentoDeCuerda();
		cuerda2.tocar();

		System.out.println("----------------");
		
		// Instrumento de percusión
		Instrumento percusion1 = new InstrumentoDePercusion();
		percusion1.tocar();
		/*
		 * En el bloque de inicialiazacion cree un acumulador para comrpobar que este 
		 * bloque se ejecuta solo una vez y por lo tanto no va a acumular
		 */
		Instrumento percusion2 = new InstrumentoDePercusion("");
		percusion2.tocar();
		Instrumento percusion3 = new InstrumentoDePercusion("bateria");
		percusion3.tocar();
		
		
		
	}

}