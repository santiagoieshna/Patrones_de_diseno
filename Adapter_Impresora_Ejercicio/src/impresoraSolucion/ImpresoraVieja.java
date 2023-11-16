package impresoraSolucion;

import java.util.Arrays;

import impresora.Documento;

public class ImpresoraVieja {

	private int[] rgb;

	public ImpresoraVieja() {
		super();
		this.rgb = new int[3];
	}

	public void imprimir(Documento documento) {
		System.out.println("Te imprimo!");
	}

	public boolean setColor(int[] color) {
		try {
			this.rgb = color;
		} catch (Exception e) {
			
			return false;
		}
		return true;
	}

	public int[] getRgb() {
		return rgb;
	}

	@Override
	public String toString() {
		return "ImpresoraVieja [rgb=" + Arrays.toString(rgb) + "]";
	}
}
