package n1exercici1;

public class InstrumentoDePercusion extends Instrumento {
	
	private static String nombreInstrumento;
	private String instrumento = "tambor";
	private int precio;	
	
	
	/*
	 * En el bloque de inicialiazacion cree un acumulador para comrpobar que este 
	 * bloque se ejecuta solo una vez y por lo tanto no va a acumular
	 */
	{
		instrumento = instrumento + " " + nombreInstrumento + " " + " pandereta";
	}
	
	static {
		nombreInstrumento = "platillo";
	}
	
	public InstrumentoDePercusion() {

	}
	
	public InstrumentoDePercusion (String instrumento) {
		this.instrumento = instrumento;
	}
	
	@Override
	public void tocar() {

		System.out.println("Está tocando un instrumento de percusion: " + instrumento);
		
	}

}