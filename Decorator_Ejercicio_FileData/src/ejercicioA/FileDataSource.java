package ejercicioA;

public class FileDataSource implements DataSource {
	
	private String datos;
	
	@Override
	public void writeData(String data) {
		System.out.println("[Ecribo: "+data+"]");
		this.datos = data;
	}

	@Override
	public void readData() {
		System.out.println("[Leo: "+datos+"]");
	}

}
