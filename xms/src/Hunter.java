
public class Hunter {
    private int power;

    Hunter(int power){
        this.power = power;
    }
    public void attack(){
        System.out.printf("Hunter attacked Monster with a power of %d.\n",power);
    }
}