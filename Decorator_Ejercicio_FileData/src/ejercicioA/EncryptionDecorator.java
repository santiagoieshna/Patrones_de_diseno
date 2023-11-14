package ejercicioA;

public class EncryptionDecorator extends DataSourceDecorator{


	
	public EncryptionDecorator(DataSource data) {
		super(data);
	}

	@Override
	public void writeData(String data) {
		this.archivo.writeData(encrypt(data));
	}

	private String encrypt(String data) {
		
		return "[Encripto:"+data+"]";
	}

	@Override
	public void readData() {
		this.archivo.readData();
		System.out.println("[Desencripto]");
	}
	
	
}
