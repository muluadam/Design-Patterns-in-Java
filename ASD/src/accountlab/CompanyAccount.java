package accountlab;

import java.util.Date;

public class CompanyAccount extends Account{
    private int numberOfEmp;
    public CompanyAccount(AccountType accountType, String name, String street, String city, String state, String zip, String email, int numberOfEmp) {
        super(accountType, name, street, city, state, zip, email);
        this.numberOfEmp=numberOfEmp;
    }

    @Override
    public void addInterest(){
        this.setBalance(this.getBalance()*1.2);

    }
}
