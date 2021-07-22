import java.util.Scanner;

public class Email {
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String department;
    private String alternateEmail;
    private int mail_capacity;

Email(String F_name,String L_name) {
    this.firstName=F_name;
    this.lastName=L_name;
    System.out.println("EMAIL CREATED: "+this.firstName+"."+this.lastName+"@"+setDepartment());
}
private String randomPassword(int length){
    String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*";
    char[] password = new char[length]
            for(int i=0;i<length;i++){
                (int) Math.random() * passwordSet
            }
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



    //setter methods
    public void setPassword(String password) {
        this.password = password;
    }

    public void setMail_capacity(int mail_capacity) {
        this.mail_capacity = mail_capacity;
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

    public int getMail_capacity() {
        return mail_capacity;
    }
}
