package Session_7.Session_8;

public class Main {


    public static void main(String [] args){


        Immutable obj1 = new Immutable(12,24);

        System.out.println("len = "+obj1.getBreath()+"b = "+obj1.getLength());

        Immutable temp = obj1.setBreath_Len(30,89);

        System.out.println("len = "+temp.getLength()+"b = "+temp.getBreath());

}
}