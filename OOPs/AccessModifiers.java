package OOPs;

public class AccessModifiers {
    public static void main(String[] args) {
       BankAccount bn = new BankAccount();
       bn.HolderName = "Lucky"; 
    //    bn.Password = "0264cgdgf"; It is not visible because it is private
    bn.setPassword("fvrv65");
    System.out.println(bn.HolderName);
    }
}

class BankAccount {
    public String HolderName;
    // private String Password;
    public void setPassword(String password) {
        // Password = password;
    }
}
