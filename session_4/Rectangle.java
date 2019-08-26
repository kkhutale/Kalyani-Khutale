package Assignment;

import java.text.DecimalFormat;

public class Rectangle {

   public double len;
   public double breath;

   public Rectangle(){
       this.len = 4;
       this.breath=2;


   }

   public Rectangle(double l, double b){
       this.len = l;
       this.breath = b;
   }


   public void areaRec(){
       System.out.println("Area of circle: " + new DecimalFormat("##.##").format(len*breath));
   }

}
