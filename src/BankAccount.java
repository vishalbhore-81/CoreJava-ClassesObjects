public class BankAccount {
    private int accNo;
    private String custName;
    private float bal;

    // default constructor
    public BankAccount() {
        accNo = 101;
        custName = "Not Available";
        bal =0;
    }

    public BankAccount(int aNo, String str, float b) {
        accNo = aNo;
        custName = str;
        bal = b;
    }

    public void display() {
        System.out.println("Acc No = " + accNo);
        System.out.println("Cust Name = " + custName);
        System.out.println("Bal = " + bal);
        System.out.println();
    }

    public boolean deposit(float amt) {
        if (amt <= 0) {
            return false;
        }
        bal +=amt; //bal =bal+amt;
        return true;
    }

    public float withdraw(float amt) {
        if (amt > bal || amt <= 0) {
            return 0F;
        }
        bal -= amt;
        return amt;
    }
}
