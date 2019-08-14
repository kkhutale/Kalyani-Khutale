public class College {
    String name ;
    String department;
    int noOfemployee;
    int noOfStudents;


    //default constructor
    College(){

        this.name = "University of delaware";
        this.department = "Computer Science";
        this.noOfemployee = 100;
        this.noOfStudents = 2000;

    }

    College(String n, String d, int e, int s){

        this.name = n;
        this.department = d;
        this.noOfemployee = e;
        this.noOfStudents = s;
    }


    void info(String college, String depart, int emp, int stud){
        System.out.println("College: "+college);
        System.out.println(depart+ "department has "+emp+" employees and "+ stud+" students");


    }

}
