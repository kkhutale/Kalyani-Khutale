public class Employe {
    String name;
    int employeeSalary;
    int empId;
//default constructor
    Employe(){
        this.name="Kalyani";
        this.employeeSalary = 80000;
        this.empId = 2019;

    }

   //parameterized constructor
    Employe(String n, int salary, int id){
        this.name = n;
        this.employeeSalary = salary;
        this.empId = id;

    }

//method to print emp name and his id;
    public void info(String n, int id){
        System.out.println("Employee name: "+ name+ " | ID: "+id);

    }

    //print the position of the employee
    public void position(String n, int salary){

        if (salary < 10000){
            System.out.println(n+ " is a associate");
        }

        else{
            System.out.println(n+" is a manager");

        }
    }

}
