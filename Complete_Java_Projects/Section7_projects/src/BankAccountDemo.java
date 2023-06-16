public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount paul = new BankAccount("Paul", 100);
        BankAccount myAccount = new BankAccount("John Baugh", 5000);
        BankAccount bobsAccount = new BankAccount("Bob Robinson");

        paul.deposit(50);
        bobsAccount.deposit(500);
        paul.printBalance();
        bobsAccount.printBalance();
        myAccount.printBalance();

        paul.withdraw(200);
        paul.withdraw(100);
        paul.printBalance();

        myAccount.withdraw(1000);
        myAccount.printBalance();


    }
    
}
