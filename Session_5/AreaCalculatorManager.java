package Session_5;

public class AreaCalculatorManager {
    public void printAreaofObjects(Rectangle objects[]){

        //call each reactangle instance calArea() method

        for(int i = 0; i< objects.length;i++){
            objects[i]=new Rectangle(i,i+1);
            objects[i].calArea();
        }
    }
}
