package ca.stevenlyall;


public class Main {

    public static void main(String[] args) {

        BankAccount sallyAccount = new BankAccount();

        sallyAccount.deposit(4.0);
        System.out.println(sallyAccount.getBalance());

        sallyAccount.withdraw(2.0);
        System.out.println(sallyAccount.getBalance());


        BankAccount bobAccount = new BankAccount();
        sallyAccount.transfer(bobAccount, 2.0);

        System.out.println("Transferring 2 from Sally to Bob...");
        System.out.println(sallyAccount.getBalance());
        System.out.println(bobAccount.getBalance());

        // TODO let's write our first unit test for the withdraw method
    }

}
