package ejercicioA;

public class CompressionDecorator extends DataSourceDecorator {

	public CompressionDecorator(DataSource data) {
		super(data);
	}

	@Override
	public void writeData(String data) {
		
		this.archivo.writeData(compres(data));
	}

	private String compres(String data) {
		
		return "[Comprimo: "+data+"]";
	}

	@Override
	public void readData() {
		this.archivo.readData();
		System.out.println("[Descomprimo]");
	}
	
	

}
