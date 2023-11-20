package impresoraSolucion;

public class ImpresoraLG implements Iimpresora {
	private String mac;
	private boolean cartuchoBW;
	private boolean cartuchoColor;
	private String color;
	
	public ImpresoraLG(String mac, boolean cartuchoBW, boolean cartuchoColor) {
		super();
		this.mac = mac;
		this.cartuchoBW = cartuchoBW;
		this.cartuchoColor = cartuchoColor;
	}

	@Override
	public void imprimirDocumento() {
		System.out.println("Te imprimo!");
	}

	@Override
	public boolean establecerColor(String colorHexadecimal) {
		setColor(colorHexadecimal);
		return false;
	}


	@Override
	public void establecerFormato(FormatoHoja formato) {
		System.out.println("Formato de impresion: "+formato.name());

	}

	private void setMac(String mac) {
		this.mac = mac;
	}
	
	public void setCartuchoBW(boolean cartuchoBW) {
		this.cartuchoBW = cartuchoBW;
	}
	
	public void setCartuchoColor(boolean cartuchoColor) {
		this.cartuchoColor = cartuchoColor;
	}
	
	private void setColor(String color) {
		this.color = color;
	}
}
