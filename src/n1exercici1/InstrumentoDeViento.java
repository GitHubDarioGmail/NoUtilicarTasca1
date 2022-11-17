package n1exercici1;

public class InstrumentoDeViento extends Instrumento {

	public InstrumentoDeViento() {}
	
	public InstrumentoDeViento(String instrumento, int precio) {
		this.instrumento = instrumento;
		this.precio = precio;
	}		
	
	static {
		nombreInstrumento = "saxo";
	}

	{
		instrumento = nombreInstrumento;
	}
	
	@Override
	public void tocar() {

		System.out.println("Está tocando un instrumento de Viento: " + instrumento);
		
	}

	private static String nombreInstrumento;
	private String instrumento;
	private int precio;	

}