package Session_7.Session_8;

public final class Immutable {


    private double breath;
    private double length;


    public Immutable(double b, double l){

        this.breath = b;
        this.length = l;

    }

    public Immutable setBreath_Len(double b,double l) {
        Immutable obj = new Immutable(b,l);
        return obj;




    }



    public double getBreath() {
        return breath;
    }

    public double getLength() {
        return length;
    }


}
