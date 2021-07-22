import java.util.Scanner;

public class Email {
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String department;
    private String alternateEmail;
    private int passwordLength =  10;
    private int mail_capacity = 500;
    private String company="bluematrix.com";

 Email(String F_name,String L_name) {
    this.firstName=F_name;
    this.lastName=L_name;
    this.department=setDepartment();
    this.password=randomPassword(passwordLength);
    System.out.println("Your password is: "+this.password);
    email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+company;
    System.out.println("Your email: "+email);
}
private String randomPassword(int length){
    String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*";
    char[] password = new char[length];
            for(int i=0;i<length;i++){
                int randomInt=(int) (Math.random() * passwordSet.length());
                password[i]= passwordSet.charAt(randomInt);
            }
            return new String(password);
}


    private String setDepartment(){
    System.out.println("Enter the department \n1 for Sales\n2 for Development\n3 for Accounting\n0 for none");
    Scanner scanner = new Scanner(System.in);
    int choice=scanner.nextInt();
    if(choice==1){
        return  "sales";
    }
    else if(choice==2){
        return "development";
    }
    else if (choice==3){
        return "accounting";
    }
    else{
        return "";
    }

    }

    public String showInfo(){
     return "NAME: "+firstName+" "+lastName+
             "\nCOMPANY EMAIL: "+email+
             "\nMAILBOX CAPACITY: "+mail_capacity + "Mb";
    }


    //setter methods
    public void setPassword(String password) {
        this.password = password;
    }

    public void setMail_capacity(int mail_capacity) {
        this.mail_capacity = mail_capacity;
    }

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }
    //getter methods
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getMail_capacity() {
        return mail_capacity;
    }
}
