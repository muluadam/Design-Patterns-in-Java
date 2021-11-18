package accountlab;

import java.util.Date;

public class Client {
    public static void main(String[] args) {
        Account pa1= new PersonalAccount(AccountType.Cheeking,"adam","100N 4st","fairfield","IA","52557","adam@gmail.com",new Date());
        Account ca1= new CompanyAccount(AccountType.Saving,"adam","100N 4st","fairfield","IA","52557",
                "adam@gmail.com",10);

        System.out.println(pa1);

        System.out.println(System.lineSeparator());
        System.out.println(pa1.getBalance());

        pa1.deposit("adam",1000);
        System.out.println(pa1.getBalance());
        pa1.withdraw("adam",100);
        System.out.println(pa1.getBalance());


        pa1.addInterest();
        System.out.println(String.format(" %.2f",pa1.getBalance()));
        System.out.println(pa1.getBalance());
        System.out.println(System.lineSeparator());

        System.out.println(ca1.getBalance());
        ca1.deposit("Instant",2000);
        System.out.println(ca1.getBalance());
        ca1.addInterest();
        System.out.println(ca1.getBalance());
        ca1.withdraw("Instant",400);
        System.out.println(ca1.getBalance());
        System.out.println();


       // System.out.println(pa2);
    }
}
