
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        
        Account conta1 = new Account("Matthews account",1000);
        Account conta2 = new Account("My account",0);
        
        conta1.withdrawal(100.0);
        conta2.deposit(100.0);
        
        System.out.println(conta1.toString());
        System.out.println(conta2.toString());
        
        
    }
}
