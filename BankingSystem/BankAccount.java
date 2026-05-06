package BankingSystem;

public class BankAccount {
   private String ACCNumber ;
   private Double Balance ;
   private String Name ;
   private String Surname ;
   private String IDnumber ;
   public static int unique = 1;

    public BankAccount(String IDnumber , String Name , String Surname ){
        this.IDnumber = IDnumber ;
        this.Name = Name ;
        this.Surname = Surname;
        Balance = 0.0 ;
        ACCNumber = IDnumber.substring(0,9) + unique;
        unique++;
    }

    
    public Double getBalance(){
        return Balance ;
    }

    public String getACCnumber(){
        return ACCNumber;
    }

    public void Deposite (Double amount){
        if(amount > 0){
            Balance += amount;
            System.out.println("+"+amount+" ,Money in. Available amount: "+Balance);
        }else{
            System.out.println("Ensure the amount is > 0 ");
        }
    }

    public void Withdraw(Double amount){
        if(amount <= Balance){
            Balance -= amount;
            System.out.println("-"+amount+" ,Money out. Available amount: "+Balance);
        }else{
            System.out.println("Insufficient funds. You only have: "+Balance+" vailable.");
        }
    }

    public String toString(){
        return("Name: "+Name+" Surname: "+Surname+"\n"+
                "ID numner: "+IDnumber+"\n"+
                "Account number: "+ACCNumber+"\n"+
                "Balance: "+Balance);
    }
}
