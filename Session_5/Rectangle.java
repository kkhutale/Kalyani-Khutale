package Session_5;

public class Rectangle {
    int len;
    int bred;


    //default constructor

    public Rectangle() {
        System.out.println("Constructor called");
        this.len = 100;
        this.bred = 20;
    }

   // parametric constructor

    public Rectangle(int l, int b) {
        System.out.println("Constructor called");
        this.len = l;
        this.bred = b;
    }


    public void calArea(){
        System.out.println("Area of the current object is " + this.len*this.bred);
    }
}
