package decorators;

import components.Component;

public abstract class BaseDecorator extends Component{
	private Component wrapper;

	public BaseDecorator(Component wrapper) {
		super();
		this.wrapper = wrapper;
	}
	
	public void execute() {
		wrapper.execute();
	}
	
	
}
