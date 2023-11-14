package decorators;

import components.Component;

public class ConcreteDecorator extends BaseDecorator {

	public ConcreteDecorator(Component wrapper) {
		super(wrapper);
		
	}
	
	@Override
	public void execute() {
		super.execute();
	}

}
