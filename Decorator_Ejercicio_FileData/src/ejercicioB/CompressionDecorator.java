package ejercicioB;

public class CompressionDecorator extends DataSourceDecorator {

	public CompressionDecorator(DataSource data) {
		super(data);
	}

	@Override
	public void writeData(String data) {
		System.out.print("[Comprimo: ");
		this.archivo.writeData(compres(data));
		System.out.print("]");
	}

	private String compres(String data) {
		return data;
	}

	@Override
	public String readData() {
		return "[Descomprimo: "+this.archivo.readData()+"]";
	}
	
}
