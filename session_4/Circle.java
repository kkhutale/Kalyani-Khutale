package Assignment;

import java.text.DecimalFormat;

public class Circle {

    public double radius;
    final double PI = 3.14;


    public Circle(){
        this.radius = 2;

    }

    public Circle(double r){

        this.radius=r;
    }


    public void areaCircle(){
        System.out.println("Area of circle: " + new DecimalFormat("##.##").format(this.radius * PI));
    }


}
