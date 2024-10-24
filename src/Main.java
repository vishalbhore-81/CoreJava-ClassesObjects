public class Main {
    public static void main(String[] args) {
        BankAccount b1;
        b1 = new BankAccount();
        b1.display();
        b1.deposit(200);
        b1.display();

        BankAccount b2 = new BankAccount(202, "Vishal Bhore", 2000);
        b2.display();
        b2.withdraw(200);
        b2.display();

        System.out.println();
        System.out.println(b1);
        System.out.println(b2);

        System.out.println();

        BankAccount b3 = b1;
        b3.deposit(300);
        b1.display();

    }
}