class BankAccount{
    private double balance;
    public void setBalance(double balance){
        if(balance>0){
        this.balance =balance;
    }
    else{
        System.out.println("Input not valid");
    }
    }
    public double getBalance(){
        return balance;
    }

    public void withdraw(double  amount){
        if(balance -amount >=0 ){
        balance -=amount; 
        System.out.println("Amount depited"+ amount);
    
    }
    else{
        System.out.println("Enter invalid Amount");
    }
}

    public void deposit(double amount){
        if(amount >0){
            balance +=amount;
        }
    }
}


public class Encapsulation {
    public static void main(String [] args){
        BankAccount b = new BankAccount();
        b.setBalance(14); 
        System.out.println(b.getBalance());
        b.withdraw(14);
        System.out.println(b.getBalance());
    }
}