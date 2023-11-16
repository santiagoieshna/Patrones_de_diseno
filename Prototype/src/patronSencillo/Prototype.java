package patronSencillo;

public interface Prototype extends Cloneable{
	public Prototype clonar()throws CloneNotSupportedException;
	public void present();
}
