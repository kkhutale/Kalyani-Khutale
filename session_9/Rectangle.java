package Session_9;

public class Rectangle {

    double len, bred;



    public Rectangle(){
        this.bred=10;
        this.len=20;
    }

    public Rectangle(double l,double b){
        this.bred=b;
        this.len=l;
    }
    public void  calArea(){

        System.out.println("Area of rectangle: "+this.len*this.bred);

    }

    public void sysout(Rectangle r){
        System.out.println("The Rectangle instance member is Length ["+this.len+"] Bredth ["+this.bred+"]");
    }
}
