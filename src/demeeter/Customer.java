package demeeter;

public class Customer {
    private String firstName;
    private String lastName;
    private Wallet myWallet;

    public String  getFirstName(){
        return firstName;
    }

    public String  getLastName(){
        return lastName;
    }

    public float makePayment(float bill){
        if (myWallet!=null){
        if (myWallet.getValue() > bill){
           myWallet.decreaseValue(bill);
        }}
        return bill;
    }
}
