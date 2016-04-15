/**
 * Created by kyletang on 4/1/16.
 */
public class Gamble {

    private double chanceofA;
    private double chanceofB;

    public static Gamble createobject(double chanceofA, double chanceofB) {
        return new Gamble(chanceofA,chanceofB);
    }

    private Gamble(double chanceofA, double chanceofB){
        this.chanceofA = chanceofA;
        this.chanceofB = chanceofB;
    }

    public double notA(){
        return 1 - chanceofA;
    }

    public double bothAB() {
        return chanceofA * chanceofB;
    }

    public double AorB() {
        return chanceofA + chanceofB - chanceofA * chanceofB;
    }















}
