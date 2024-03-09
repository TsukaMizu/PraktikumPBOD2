public class BankAccount {
    private double balance;
    private final double min_balance = 100.00;

    public BankAccount(double saldoAwal){
        this.balance = saldoAwal;
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposited: $"+ amount);
    }
    
    public void withdraw(double amount) throws InsufficientFundsException{
        if (balance - amount < min_balance){
            throw new InsufficientFundsException ("Saldo tidak mencukupi untuk melakukan penarikan");
        }
        balance -= amount;
        System.out.println("Withdraw: $" + amount);
    }

    public double getBalance(){
        return balance;
    }
}
