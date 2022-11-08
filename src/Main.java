import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Apartment apartment = new Apartment();
        apartment.setTitle("Kochmon");
        apartment.setAddress("Suzak");
        apartment.setPrice(30000);

        Apartment apartment1 = new Apartment();
        apartment1.setTitle("Ak Orgo");
        apartment1.setAddress("Nookat");
        apartment1.setPrice(25000);


        Student student = new Student();
        student.setFullName("Altynbek");
        student.setPhoneNumber(1);
        student.setAddress("Suzak");
        student.setBankAccount(5000);

        Student student1 = new Student();
        student1.setFullName("Yryskeldi");
        student1.setPhoneNumber(2);
        student1.setAddress("Nookat");
        student1.setBankAccount(5000);


        Student student2 = new Student();
        student2.setFullName("Jenish");
        student2.setPhoneNumber(3);
        student2.setAddress("Suzak");
        student2.setBankAccount(5000);

        Student student3 = new Student();
        student3.setFullName("Alymbek");
        student3.setPhoneNumber(4);
        student3.setAddress("Nookat");
        student3.setBankAccount(5000);


        Student student4 = new Student();
        student4.setFullName("Harun");
        student4.setPhoneNumber(5);
        student4.setAddress("Suzak");
        student4.setBankAccount(5000);


        Student student5 = new Student();
        student5.setFullName("Baytik");
        student5.setPhoneNumber(6);
        student5.setAddress("Nookat");
        student5.setBankAccount(6000);

        Apartment[] apartments = {apartment, apartment1};
        Student[] students = {student, student1, student2, student3, student4, student5};


        while (true) {
            System.out.println("1.Students address | 2.Pay per Month | 3.Live In | 4.Change Info");
            int input = new Scanner(System.in).nextInt();
            if (input == 1) {
                System.out.println("Enter title: ");
                String inputTitle = new Scanner(System.in).nextLine();
                if(inputTitle.equals("Kochmon")){
                    findStudents("Suzak",students);
                }else if(inputTitle.equals("Ak Orgo")){
                    findStudents("Nookat",students);
                }

            }if(input == 2){
                System.out.println("Enter number title: ");
                int titleNumber = new Scanner(System.in).nextInt();
                if (titleNumber == 1) {
                    System.out.println(apartment.payPerMonth(students));
                } else if (titleNumber == 2) {
                    System.out.println(apartment1.payPerMonth(students));
                }
            }
            if (input == 3) {
                System.out.println("Full Name: ");
                String inputFullName = new Scanner(System.in).nextLine();
                for (Student student6:students) {
                    if(student6.getFullName().equals(inputFullName));
                }
                student.LiveIn(students,apartments);
            }
            if (input == 4) {
                System.out.println("Full Name:");
                String inFullName = new Scanner(System.in).nextLine();
                for (Student student6: students) {
                    if(student6.getFullName().equals(inFullName)){
                        student6.changeInfo();
                    }
                }

            }
        }
        }
        public static  void findStudents(String address, Student [] students){
            for (Student student: students) {
                if(student.getAddress().equals(address)){
                    System.out.printf("""
                            Full name: %s
                            address: %s
                            phone number: %s
                            bank account: %s
                            """,student.getFullName(),student.getAddress(),student.getPhoneNumber(),student.getBankAccount());
                    System.out.println("====================================");
                }

            }
        }
    }