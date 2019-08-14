
class Website{
    String name = "welcomeToIndia.org";
    int age = 5;
    String type ="Tourism";

//default constructor will be used

    //check the how updated the info is
     public void update(String name, int age){
         if(age < 5){
             System.out.println(name+ " is recently updated.");
         }
         else{
             System.out.println(name+ " may have outdated information");
         }

     }
}