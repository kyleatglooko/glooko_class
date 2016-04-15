import java.io.*;
import java.util.Scanner;
/**
 * Created by kyletang on 3/29/16.
 */
public class rectangle {

    private double width;
    private double height;

    public static rectangle createrectangle(double width, double height) {
        return new rectangle(width,height);
    }
    public static rectangle createsquare(double side){
        return new rectangle(side, side);
    }

    private rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * width + 2 * height;
    }

}

    