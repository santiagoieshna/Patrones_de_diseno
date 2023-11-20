package patron;

public class Invoker {
	private Command comando;

	public Invoker() {
		super();
	}
	
	public void setCommand(Command command){
		
	}
	
	public void executeCommand(){
		this.comando.execute();
	}
	
}
