
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
    	System.out.print("출시년도 : " + getYear() + "년 ");
    	System.out.print("제조사 : " + getMake() + " ");
    	System.out.println("최고속력 : " + getSpeed() + " ");
    }
}