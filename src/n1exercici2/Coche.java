package n1exercici2;

public class Coche {

	private static final String MARCA = "Kia"; //ES UNA CONSTANTE
	private static String modelo; // variable de clase
	private String potencia; // variable de instancia
	
	public Coche(String modelo, String potencia1) {
		this.potencia = potencia1;
		this.modelo = modelo;
	}
	
	public Coche(){};

	public static void frenar(String modelo, String potencia) {
		System.out.println("El vehiculo marca " + MARCA + ", modelo " + modelo + " y potencia " + potencia + " esta frenando");
	};
	
	public void acelerar() {
		System.out.println("El vehiculo marca " + MARCA + ", modelo " + modelo + " y potencia " + potencia + " esta acelerando");
	};
	
	public static void main(String[] args) {
		
		Coche.frenar("Sportage", "100");
		
		Coche coche = new Coche("Sport 2000", "200");
		coche.acelerar();
		
	}
	
}