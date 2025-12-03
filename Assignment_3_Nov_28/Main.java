class BankAccount {
    protected String accountNo;
    protected double balance;
    public BankAccount(String accountNo,double balance){
        this.accountNo=accountNo;
        this.balance=balance;
    }
    public void deposit(double amount){
        if (amount>0){
            balance+=amount;
            System.out.println("Deposited " + amount);
        } else{
            System.out.println("Invalid deposit amount!");
        }
    }
    public void withdraw(double amount){
        if (amount>0&& amount<=balance) {
            balance-=amount;
            System.out.println("Withdrawn " + amount);
        } else{
            System.out.println("Invalid or insufficient funds!");
        }
    }
    public void showBalance(){
        System.out.println("Account No: " + accountNo + " | Balance: " + balance);
    }
}
class SavingsAccount extends BankAccount{
    private double interestRate;
    public SavingsAccount(String accountNo, double balance, double interestRate) {
        super(accountNo,balance);
        this.interestRate=interestRate;
    }
    public void addInterest(){
        double interest =balance*interestRate/100;
        balance+=interest;
        System.out.println("Interest Added " + interest);
    }
}
class SalaryAccount extends BankAccount{
    private double monthlySalary;
    public SalaryAccount(String accountNo, double balance,double monthlySalary) {
        super(accountNo,balance);
        this.monthlySalary=monthlySalary;
    }
    public void creditSalary(){
        balance+=monthlySalary;
        System.out.println("Salary Credited " + monthlySalary);
    }
}

public class Main{
    public static void main(String[] args) {
        SavingsAccount s1=new SavingsAccount("SA1001", 5000, 5);
        s1.deposit(1000);
        s1.addInterest();
        s1.showBalance();

        System.out.println("---------------------------------");

        SalaryAccount sal1=new SalaryAccount("SAL2001", 2000, 30000);
        sal1.creditSalary();
        sal1.withdraw(5000);
        sal1.showBalance();
    }
}
