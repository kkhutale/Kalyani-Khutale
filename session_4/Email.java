package Session_4;

public class Email {

    public String userName;
    public String passWord;

    public Email(){
        this.userName  = "kkhutale";
        this.passWord = "java";
    }

    public Email(String uN, String pW){
        this.passWord = pW;
        this.userName = uN;
    }

    public void display(String passWord) {
        System.out.println("Username =  "+this.userName);
        System.out.println("PassWord =  "+this.passWord);
    }
}
