package BankingSystem;

public class Bank {
    public static void main(String[] args) {
        BankAccount ACC = new BankAccount("0505095743082", "Phethuxolo" ,"Maphela");

        ACC.Deposite(500.0);
        System.out.println("The Balance is: "+ACC.getBalance());

        ACC.Withdraw(253.64);
        ACC.Withdraw(253.64);

    }
}
