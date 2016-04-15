/**
 * Created by kyletang on 4/1/16.
 */
public class Convert {
    private double input;

    public static Convert createobject(double input) {
        return new Convert(input);
    }

    private Convert(double input) {
        this.input = input;

    }

    public double inchToyard() {
        return input / 36;
    }

    public double inchTofeet() {
        return input / 12;
    }

    public double feetToyard() {
        return input / 3;
    }

    public double feetToinch() {
        return input * 12;
    }

    public double yardToinch() {
        return input * 36;
    }

    public double yardTofeet() {
        return input * 3;
    }
}

