package accountlab;

import java.util.Date;

public class PersonalAccount extends Account{
    private Date dob;
    public PersonalAccount(AccountType accountType, String name, String street, String city, String state, String zip, String email, Date dob) {
        super(accountType, name, street, city, state, zip, email);
        this.dob=dob;
    }
//    @Override
//    public void deposit(String name, int ammount ){
//
//        System.out.println("deposit to personal account");
//    }
//
//    @Override
//    public  void withdraw(String name, int ammount){
//        System.out.println("withdraw personal account");
//    }
//
//    @Override
//    public void addInterest(){
//        System.out.println("addInterest  personal account");
//    }

    @Override
    public String toString() {
        return "PersonalAccount{" +
                "dob=" + super.toString() +
                '}';
    }
}
