package Session_7;

public class Singleton {

    private  static Singleton object = null;

    public int i = 0;

    private Singleton(){

        System.out.println("Constructor called...........");
        i++;
        System.out.println("number of objects created: "+i);
    }


    public static Singleton getObject(){

        if (object == null){

            object = new Singleton();
        }

        return object;
    }

}
