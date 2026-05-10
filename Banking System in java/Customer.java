import BankingSystem.Check;
import BankingSystem.Savings;

public class Customer {
    private String Name;
    private String Surname;
    private String ID;
    public Check check;
    public Savings savings;

        public Customer(String ID, String Name , String Surname) {
            this.ID = ID;
            this.Name = Name;
            this.Surname = Surname;
        }

        public void CreateCheckAccount(double initialBalance) {
            this.check = new Check();
        }

        public void CreateSavingsAccount(double initialBalance) {
            this.savings = new Savings();
        }

        public String toString() {
            return "Customer Name: " + Name + " " + Surname + "\nID: " + ID;
        }






}
