
public class YourFirstAccount {

    public static void main(String[] args) {
        
        Account minhaConta = new Account("Joao",100);
        
        minhaConta.deposit(20);
        
        System.out.println(minhaConta.toString());
        
    }
}
