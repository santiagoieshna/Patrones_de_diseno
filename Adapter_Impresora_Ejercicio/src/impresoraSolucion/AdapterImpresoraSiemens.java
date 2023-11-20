package impresoraSolucion;

public class AdapterImpresoraSiemens implements Iimpresora {

	private ImpresoraSiemens impresoraSiemens;
	
	public AdapterImpresoraSiemens() {
		super();
	}
	
	public AdapterImpresoraSiemens(ImpresoraSiemens impresoraVieja) {
		super();
		this.impresoraSiemens = impresoraVieja;
	}
	
	@Override
	public void imprimirDocumento() {
		impresoraSiemens.imprimirDocumento();
	}

	@Override
	public boolean establecerColor(String colorHexadecimal) {
		int[] rgb = convertToRgb(colorHexadecimal);
		return impresoraSiemens.establecerColor(rgb);
	}
	
	@Override
	public void establecerFormato(FormatoHoja formato) {
		impresoraSiemens.establecerFormato(formato);		
	}
	
	 public static int[] convertToRgb( String colorHexadecimal){
		 colorHexadecimal =colorHexadecimal.replace("#", "");
	     final int[] ret = new int[3];
	     for (int i = 0; i < 3; i++)
	     {
	         ret[i] = Integer.parseInt(colorHexadecimal.substring(i * 2, i * 2 + 2), 16);
	     }
	     return ret;
	 }

}
