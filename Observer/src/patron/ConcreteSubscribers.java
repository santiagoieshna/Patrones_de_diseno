package patron;

public class ConcreteSubscribers implements Subscriber{
	private String name;

	public ConcreteSubscribers(String name) {
		this.name = name;
	}

	@Override
	public void update(String context) {
		System.out.println(this.name+": Me he enterado");
		
	}

}
