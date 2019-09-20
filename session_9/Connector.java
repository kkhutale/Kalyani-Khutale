package Session_9;

public abstract class Connector {

    //abstract methods
    public abstract void openConnection();
    public abstract void closeConnection();
    public  abstract void fireQuery();

    //Non abstract method
     public  void display(){
         System.out.println("Abstract Class");
     }
    public void loadedDBConnection(){

        System.out.println("Connection loaded.......(Abstract class) ");
    }
}
