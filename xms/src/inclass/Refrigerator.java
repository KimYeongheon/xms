package inclass;

public class Refrigerator implements RemoteControl {
	public boolean onOff;
	public void turnOn() {
		onOff = true;
	}
	public void turnOff() {
		onOff = false;
	}
	public void printInfo() {
		System.out.println(onOff);
	}
}
