package ejercicioA;

public abstract class DataSourceDecorator implements DataSource{
	
	protected DataSource archivo;

	public DataSourceDecorator(DataSource archivo) {
		super();
		this.archivo = archivo;
	}

	@Override
	public void writeData(String data) {
		
	}

	@Override
	public void readData() {
		
	}
	
//	public abstract DataSource quitarCapa();

}
