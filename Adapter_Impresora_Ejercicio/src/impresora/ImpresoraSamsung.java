package impresora;

public class ImpresoraSamsung implements Iimpresora {
	private String mac;
	private String color;
	
	public ImpresoraSamsung(String mac) {
		super();
		this.mac = mac;
	}

	@Override
	public void imprimirDocumento() {
		System.out.println("Te imprimo!");
	}

	@Override
	public boolean establecerColor(String colorHexadecimal) {
		
		return true;
	}

	public String getMac() {
		return mac;
	}

	public String getColor() {
		return color;
	}

	private void setMac(String mac) {
		this.mac = mac;
	}

	private void setColor(String color) {
		this.color = color;
	}

	@Override
	public void establecerFormato(FormatoHoja formato) {
		System.out.println("Formato de impresion: "+formato.name());

	}

}
