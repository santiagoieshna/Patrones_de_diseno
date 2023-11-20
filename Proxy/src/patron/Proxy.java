package patron;

public class Proxy implements ServiceInterface {
	
	private Service realService;
	
	public Proxy(Service s) {
		super();
		this.realService = s;
	}
	
	public boolean checkAccess() {
		return true;
	}

	@Override
	public void operation() {
		if(checkAccess()) {
			this.realService.operation();
		}
	}

}
