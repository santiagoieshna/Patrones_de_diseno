package patron;

public class Context {
	private ConcreteStates state;

	public Context(ConcreteStates state) {
		super();
		this.state = state;
		this.state.setContext(this);
	}
	
	public void changeState(ConcreteStates state) {
		this.state = state;
	}
	
	public void doThis() {
		state.doThis();
	}
	
	public void doThat() {
		state.doThat();
	}
	
	
	
}
