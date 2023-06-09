package bank;

public class Account {
    private String firstName;
    private String secondName;
    private String phoneNumber;
    private String accountNumber;
    private String pin;

    private int balance;




    public Account(String firstName, String secondName, String phoneNumber, String pin) {
        this.firstName = firstName;
        this.secondName = secondName;
        validatePhoneNumber(phoneNumber);
        this.phoneNumber = phoneNumber;
        validatePin(pin);
        this.pin = pin;

    }

    public Account(){

    }

    public void setAccountNumber(String acctNo) {
//        validateAccountNumber(accountNumber);
        this.accountNumber = acctNo;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void deposit(int amount) {
        validateAmountToDeposit(amount);
        validateAmountIsInstanceOfInt(amount);
        balance = balance + amount;
    }

    public void setPin(String pin) {
        validatePin(pin);
        this.pin = pin;
    }

    public void withdraw(String pin, int amount) {
        validateWithdrawPin(pin);
        validateAmountToWithdraw(amount);
        balance = balance - amount;
    }

    public int checkBalance(String pin) {
        validatePin(pin);
        return balance;
    }


    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
//        validatePhoneNumber(phoneNumber);
        this.phoneNumber = phoneNumber;
    }

    public void validatePhoneNumber(String phoneNumber) {
        if (phoneNumber.length() != 11 || !phoneNumber.matches("^[0-9]+$")) {
            throw new IllegalArgumentException("Please enter a correct phone number: ");
        }
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void validatePin(String pin) {
        if (pin.length() != 4 || !pin.matches("^[0-9]+$")) {
            throw new IllegalArgumentException("Your pin must be 4 digit");
        }
    }

    public void validateAccountNumber(String accountNumber) {
        if(!accountNumber.equals(this.accountNumber)){
        throw new IllegalArgumentException("Please enter a correct account number: ");
        }

    }

    public void validateAmountToDeposit(int amount){
        if(amount < 0){
                throw new IllegalArgumentException("Please enter a correct amount: ");}
        }

    public void validateAmountIsInstanceOfInt(int amount){
        if(!(Integer.valueOf(amount) instanceof Integer)){
            throw new IllegalArgumentException("Please enter a correct amount: ");}
    }

    public void validateAmountToWithdraw(int amount){
        if(amount < 0 || amount > balance){
            throw new IllegalArgumentException("Please enter a correct amount: ");}
    }

    public void validateWithdrawPin(String pin){

        if (!this.pin.equals(pin)){
            throw new IllegalArgumentException("Please Enter correct pin");
        }
    }
}
