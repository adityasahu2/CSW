//Consider a scenario where you are tasked with developing a simple banking application  using Java, employing the concept of polymorphism. Your application should consist of three  classes: Account, SavingsAccount, and CurrentAccount. The Account class serves as the  base class with private attributes for account number and balance, along with abstract methods  for deposit and withdrawal. The SavingsAccount class, a subclass of Account, should include  an additional attribute for interest rate and override the deposit method to calculate interest, as  well as override the withdrawal method to ensure a sufficient balance. Similarly, the  CurrentAccount class, also a subclass of Account, asibute and override the withdrawal method to check the overdraft limit. Implement the  classes as described, ensuring proper encapsulation and abstraction. Finally, create a  BankingApplication class (Main) to demonstrate the polymorphic behavior by creating  instances of both SavingsAccount and CurrentAccount, testing deposit and withdrawal  operations, and displaying account details.
abstract class Account{
  private int accountNumber;
  private double balance;
  public Account(int accountNumber, double balance){
    this.accountNumber = accountNumber;
    this.balance = balance;
  }
  public int getAccountNumber(){return this.accountNumber;}
  public double getBalance(){return this.balance;}
  public void setAccountNumber(int accountNumber){this.accountNumber = accountNumber;}
  public void setBalance(double balance){this.balance = balance;}
  public abstract void deposit(double amount);
  public abstract void withdraw(double amount);
}
class SavingsAccount extends Account{
  private double interestRate;
  public SavingsAccount(int accountNumber, double balance, double interestRate){
    super(accountNumber, balance);
    this.interestRate = interestRate;
  }
  public double getInterestRate(){return this.interestRate;}
  public void setInterestRate(double interestRate){this.interestRate = interestRate;}
  public void deposit(double amount){
    setBalance(getBalance()+amount);
    double intrest = (getBalance() * this.interestRate)/100;
    System.out.println("Deposited " + amount + " into Savings Account " + getAccountNumber() + "\nBalance : " + getBalance() + "\nIntrest : " + intrest + "\n");
  }
  public void withdraw(double amount){
    if(getBalance() - amount < 0)
      System.out.println("Cannot withdraw " + amount + " due to insufficient balance in Savings Account " + getAccountNumber() + "\n");
    else{
      setBalance(getBalance() - amount);
      System.out.println("Withdrawn " + amount + " from Savings Account " + getAccountNumber() + "\nBalance : " + getBalance() + "\n");
    }
  }
  public void displayDetails(){
    System.out.println("Savings Account Details : \nAccount Number : " + getAccountNumber() + "\nBalance : " + getBalance() + "\n");
  }
}
class CurrentAccount extends Account{
  private double overdraftLimit;
  public CurrentAccount(int accountNumber, double balance, double overdraftLimit){
    super(accountNumber, balance);
    this.overdraftLimit = overdraftLimit;
  }
  // public double getOverdraftLimit(){return this.overdraftLimit;}
  // public void setOverdraftLimit(double overdraftLimit){this.overdraftLimit = overdraftLimit;}
  public void deposit(double amount){
    setBalance(getBalance() + amount);
    System.out.println("Deposited "+amount+" into Current Account "+getAccountNumber()+"\n");
  }
  public void withdraw(double amount){
    if(getBalance() - amount < -this.overdraftLimit)
      System.out.println("Cannot withdraw " + amount + " due to exceeded overdraft limit in Current Account "+getAccountNumber()+"\n");
    else{
      setBalance(getBalance() - amount);     
      System.out.println("Withdrawn "+amount+" from Current Account "+getAccountNumber()+"\n");
    }
  }
  public void displayDetails(){
    System.out.println("Current Account Details : \nAccount Number : " + getAccountNumber() + "\nBalance : " + getBalance() + "\n");
  }
}
//public class BankingApplication
public class Q7{
  public static void main(String[] args){
    SavingsAccount S = new SavingsAccount(1, 1000, 5); 
    CurrentAccount C = new CurrentAccount(2, 2000, -1000);
    S.deposit(500);
    S.withdraw(200);
    S.withdraw(1500);
    S.displayDetails();
    C.deposit(500);
    C.withdraw(200);
    C.withdraw(1500);
    C.displayDetails();
  }
}