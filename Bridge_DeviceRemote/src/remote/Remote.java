package remote;

import device.Device;

public class Remote {

	private Device device;
	
	public Remote(Device device) {
		super();
		this.device = device;
	}

	public boolean tooglePorwer() {
		if(device.isEnabel()) {
			device.disable();
			return false;
		}else {
			device.enable();
			return true;
		}
	}
	
	public void volumenUP() {
		device.setVolumen(device.getVolumen()+1);
	}
	
	public void volumenDow() {
		device.setVolumen(device.getVolumen()-1);
	}
	
	public void chanelUP() {
		
	}
	
	public void chanelDow() {
		
	}
	
	
}
