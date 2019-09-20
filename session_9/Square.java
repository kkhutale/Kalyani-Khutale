package Session_9;

public class Square extends Rectangle {

    double s;


    public Square(double s){
        this.s = s;
    }
    @Override
    public void calArea(){

        System.out.println("Area of Square: "+Math.sqrt(this.s));

    }

    @Override
    public void sysout(Rectangle r){
        System.out.println("The Square instance member is side ["+this.s+"]");
    }

}
