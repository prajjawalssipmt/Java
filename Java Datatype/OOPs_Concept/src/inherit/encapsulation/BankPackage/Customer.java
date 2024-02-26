package inherit.encapsulation.BankPackage;

public class Customer {
    public static void main(String[] args) {
        BankAccount account=new BankAccount("303303319035","Prajjawal");
        account.depositMoney(500);
        System.out.println(account.withdrawMoney(300));
        account.depositMoney(-40);
        account.withdrawMoney(0);
        System.out.println(account);
    }
}
