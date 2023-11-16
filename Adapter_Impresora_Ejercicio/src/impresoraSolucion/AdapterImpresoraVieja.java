package impresoraSolucion;

public class AdapterImpresoraVieja implements Coloreable {

	private ImpresoraVieja impresoraVieja;
	
	public AdapterImpresoraVieja() {
		super();
	}
	
	public AdapterImpresoraVieja(ImpresoraVieja impresoraVieja) {
		super();
		this.impresoraVieja = impresoraVieja;
	}

	@Override
	public boolean establecerColor(String colorHexadecimal) {
		int[] rgb = convertToRgb(colorHexadecimal);
		return impresoraVieja.setColor(rgb);
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
