
public class Car {
	int year;
    String maker;
    double speed;

    public Car(int year,String maker,double speed){
        this.year=year;
        this.maker=maker;
        this.speed=speed;
    }
    public int getYear(){
        return year;
    }
    public String getMake(){
        return maker;
    }
    public double getSpeed(){
        return speed;
    }
    public void println() {
    	System.out.print("��ó⵵ : " + getYear() + "�� ");
    	System.out.print("������ : " + getMake() + " ");
    	System.out.println("�ְ�ӷ� : " + getSpeed() + " ");
    }
}