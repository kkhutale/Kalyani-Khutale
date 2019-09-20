package Session_9;

import Session_7.Session_8.Immutable;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String [] args){


        Circle c = new Circle();


        System.out.println("Area of the circle: "+ c.calArea(4));
        System.out.println("\n--------------------------------------------\n");
       // --------------------------------------------------------------------------------------------------------------------

        //Instance of child class created

        MySqlConnector sql = new MySqlConnector();

        sql.openConnection();
        sql.closeConnection();
        sql.fireQuery();
        sql.display();
        sql.loadedDBConnection();

        //------------------------------------------------------------------------------------------------------------------
        System.out.println("\n--------------------------------------------\n");
        OracleConnector or =new OracleConnector();
        or.openConnection();
        or.closeConnection();
        or.fireQuery();
        or.display();
        or.loadedDBConnection();

        //------------------------------------------------------------------------------------------------------------------
        System.out.println("\n--------------------------------------------\n");

        Rectangle rec = new Rectangle(20,5);
        rec.sysout(rec);
        rec.calArea();

        //------------------------------------------------------------------------------------------------------------------
        System.out.println("\n--------------------------------------------\n");

        Rectangle sqr = new Square(4);
        sqr.sysout(sqr);
        sqr.calArea();


    }
}
