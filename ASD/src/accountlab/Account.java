package accountlab;

public abstract class  Account {
    private  AccountType accountType;
    private   String name;
    private String street;
    private String city;
    private  String state;
    private String zip;
    private String email;
    private double balance;

    public Account(AccountType accountType, String name, String street, String city, String state, String zip, String email) {
        this.accountType = accountType;
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.email = email;
        this.balance=0.0;
    }
     public void deposit(String name, int ammount ){
    this.balance=this.balance+ammount;
    }

    public  void withdraw(String name, int ammount){
      //  System.out.println("withdraw");
        this.balance=this.balance-ammount;
    }

    public void addInterest(){
        this.balance=this.balance*1.1;
       // System.out.println("addInterest To be overriden");
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public String getName() {
        return name;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    public String getEmail() {
        return email;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountType=" + accountType +
                ", name='" + name + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                ", email='" + email + '\'' +
                ", balance=" + balance +
                '}';
    }
}
