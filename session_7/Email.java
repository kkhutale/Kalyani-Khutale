package Session_7;
public class Email {
    private static String userName;
    private static String passWord;

    static int ct=0;

     public  Email(){
        this.userName  = "kkhutale";
        this.passWord = "java";
        ct++;
    }

    public Email(String uN, String pW){
        this.passWord = pW;
        this.userName = uN;
        ct++;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void display() {
        System.out.println("Username =  "+this.userName);
        System.out.println("PassWord =  "+this.passWord);
    }
}
