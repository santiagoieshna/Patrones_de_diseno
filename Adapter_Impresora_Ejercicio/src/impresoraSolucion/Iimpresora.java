package impresoraSolucion;

public interface Iimpresora {
	void imprimirDocumento();
	boolean establecerColor(String colorHexadecimal);
	void establecerFormato(FormatoHoja formato);
}
