package inclass;

public class RemoteControlTest {

	public static void main(String[] args) {
		RemoteControl rc = new Television();
		rc.turnOn();
		rc.printInfo();	

		RemoteControl rf = new Refrigerator();
		rf.turnOff();
		rf.printInfo();
	}
}