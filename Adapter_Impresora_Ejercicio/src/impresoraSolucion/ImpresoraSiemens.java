package impresoraSolucion;

public class ImpresoraSiemens {
	private String idModelo;
	private int[] rgb;

	public ImpresoraSiemens(String idModelo) {
		super();
		this.idModelo=idModelo;
		this.rgb = new int[3];
	}
	
	public void imprimirDocumento() {
		System.out.println("Te imprimo!");
	}
	
	public boolean establecerColor(int[] color) {
		try {
			this.rgb=color;			
		}catch(Exception e) {
			return false;
		}
		return true;
	}
	
	void establecerFormato(FormatoHoja formato) {
		System.out.println("Formato de impresion: "+formato.name());
	}

	public int[] getRgb() {
		return rgb;
	}
	
}
