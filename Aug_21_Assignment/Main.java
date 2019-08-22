import java.util.Scanner;

public class Main {

    public static void main (String[] args){


//method_1 arrays of objects

        System.out.println("How many Car objects do you want to create?");

        Scanner scan = new Scanner(System.in);
        int noObj= scan.nextInt();

        Car obj[]=new Car[noObj];
        for (int i = 0; i < obj.length;i++){
            obj[i]=new Car(i+100,"color_"+i);

        }
        System.out.println("Created arrays of Objects........");
        Car.objects();

// please comment the above code and uncomment the block below to see the output.
/*
//method_2 manual object created.
        System.out.println("/n--------------------------------------------------------") ;
        System.out.println("Objects created manually......");
        Car obj1 = new Car();
        Car obj2 = new Car(1920,"Blue");
        Car obj3 = new Car();
        Car obj4 =  new Car(1930,"Red");

        Car.objects();

        Car obj5 = new Car();
        Car obj6 = new Car(1920,"Blue");
        Car obj7 = new Car();
        Car obj8 =  new Car(1930,"Red");


        Car.objects();

*/

    }
}
