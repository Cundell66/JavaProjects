public class BankAccount {
    private String owner;
    private int balance;

    public BankAccount(String owner){
        this(owner, 0);
    }
        
    public BankAccount(String owner, int balance){
        this.owner = owner;
        if (balance > 0){
        this.balance = balance;
        } else {
            System.out.println("invalid balance value must be greater than 0");
        }
    }

    public void deposit(int amount){
        if (amount > 0){
            balance += amount;
            System.out.println("deposit completed");
            printBalance(); 
        } else{
            System.out.println("invalid value must be greater than 0");
        }   
    }

    public void withdraw(int amount){
        if(amount > 0){
            if (amount <= balance){
                balance -= amount;
                System.out.println("withdrawal completed");
                printBalance();
            } else {
                System.out.println("insufficient funds : available funds =" + balance);
            }
        } else {
            System.out.println("invalid value must be greater than 0");
            return;
        }
    }

    public String getOwner(){
        return owner;
    }

    public int getBalance(){
        return balance;
    }

    public void printBalance(){
        
        System.out.println(owner);
        System.out.println(balance);
        System.out.println();
    }

}
