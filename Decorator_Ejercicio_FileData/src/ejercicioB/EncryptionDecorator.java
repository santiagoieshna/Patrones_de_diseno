package ejercicioB;

public class EncryptionDecorator extends DataSourceDecorator{


	
	public EncryptionDecorator(DataSource data) {
		super(data);
	}

	@Override
	public void writeData(String data) {
		System.out.print("[Encripto: ");
		this.archivo.writeData(encrypt(data));
		System.out.println("]");
	}

	private String encrypt(String data) {
		
		return data;
	}

	@Override
	public String readData() {
		return "[Desencripto: "+this.archivo.readData()+"]";
	}
	
	
}
