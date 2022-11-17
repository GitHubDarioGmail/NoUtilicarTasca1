package n1exercici1;

public class InstrumentoDeCuerda extends Instrumento {

	private static String nombreInstrumento;
	private String instrumento = "arpa";
	private int precio;	
	
	static {
		nombreInstrumento = "guitarra acustica";
	}
	
	{
		instrumento = nombreInstrumento;
	}
	
	
	public InstrumentoDeCuerda(String instrumento) {
		this.instrumento = instrumento;
		}
	
	public InstrumentoDeCuerda() {
		instrumento = "guitarra electrica";
	}
	
	@Override
	public void tocar() {

		System.out.println("Está tocando un instrumento de Cuerda: " + instrumento);
		
	}

}