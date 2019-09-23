
//Custom Exception
package Session_10;

public class CalculateAreaNotSupported extends Exception {


    CalculateAreaNotSupported(int i){
        if ( i < 10){
            System.out.println("CalculateAreaNotSupported");

        }
    }

}
