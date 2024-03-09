public class BankApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500.00);

        try{
            account.withdraw(200.0);
            System.out.println("Saldo Saat ini :$" + account.getBalance());

            account.withdraw(400.0);
        }catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
