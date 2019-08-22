public class Car {
    public int no;
    public String color;

    public static int count = 0;


    public Car() {
        this.color = "Blue";
        this.no = 19713;
        count++;

    }

    public Car(int n, String c) {

        this.no = n;
        this.color = c;

        count++;

    }


    public static void objects() {
        System.out.println("Number of objects created so far : "+count);


    }
}
