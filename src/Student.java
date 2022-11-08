import java.util.Scanner;

public class Student {

    private String fullName;
    private int phoneNumber;
    private String address;
    private int bankAccount;

    void setFullName(String fullName){
        this.fullName = fullName;
    }
    public String getFullName(){
        return fullName;
    }
    void setPhoneNumber(int phoneNumber){
        this.phoneNumber =phoneNumber;
    }
    public int getPhoneNumber(){
        return phoneNumber;
    }
    void setAddress(String address){
        this.address = address;
    }
    public String  getAddress(){
        return address;
    }
    void setBankAccount (int bankAccount){
        this.bankAccount = bankAccount;
    }
    public int getBankAccount(){
        return bankAccount ;
    }






    public void LiveIn(Student[] student,Apartment [] apartments){
        int result = 0;
        for (Apartment apartment:apartments) {
            if(apartment.getAddress().equals(address))
                result = bankAccount / apartment.payPerMonth(student);


        }
        System.out.println("Live in: "+result);
    }
    public void changeInfo(){
        System.out.print("Enter Full name: ");
        fullName = new Scanner(System.in).nextLine();
        System.out.print("Enter phone number: ");
        phoneNumber = new Scanner(System.in).nextInt();
        System.out.print("Enter address:");
        address = new Scanner (System.in).nextLine();
        System.out.print("Enter Bank account:");
        bankAccount = new Scanner(System.in).nextInt();
        System.out.print("The end!!");
    }


}
