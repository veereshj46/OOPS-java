public class BankAccount{
    private double balance;
    public void deposite(double amount){
        balance=balance+amount;

    }
    public double getbalance(){
      return balance;
    }

    public void withdraw(double Balance){
        balance=balance-Balance;

        
        
    }

}