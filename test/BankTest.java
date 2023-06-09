
import bank.Bank;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BankTest {
    private Bank obj = new Bank();
    private Bank obj1 = new Bank();

    @Test
    public void testBankObjectExists() {
        assertNotNull(obj);
    }

    @Test
    public void customerCanCreateNewAccountTest() {
        obj.registerNewAccount("name", "secondName", "01234567890","1234");
        assertEquals(1, obj.getCounter());
    }

//    @Test
//    public void testNewAccountNoIsGenerated(){
//        obj.registerNewAccount("name","secondName","phoneNumber","bvn","pin");
//        String accno = obj.getAccountNumberByPin("pin");
//        assertEquals("1234567890",accno);
//    }

    @Test
    public void testBankCanDeposit() {
        obj.registerNewAccount("torin", "ade", "09022344568", "8946");
        String accno = "9022344568";
        System.out.println(accno);
        obj.deposit(accno, 500);
        int balance = obj.requestBalance(accno, "8946");
        System.out.println(balance);
        assertEquals(500, balance);
    }

    @Test
    public void testBankCanWithdraw() {
        obj.registerNewAccount("torin", "ade", "09022344568", "8946");
        String accno = "9022344568";
        obj.deposit(accno, 1000);
        obj.withdraw(accno, 500, "8946");
        int balance = obj.requestBalance(accno, "8946");
        assertEquals(500, balance);
    }

    @Test
    public void testBankCanTransfer() {

        obj.registerNewAccount("torin", "ade", "09022344568", "8946");
        obj1.registerNewAccount("tosin", "ola", "09022375686", "8900");
        System.out.println(obj.generateAccountNumber("09022344568"));
        System.out.println(obj1.generateAccountNumber("09022375686"));
        String accno = "9022344568";
        String recipient = "9022375686";
        obj.deposit(accno, 1000);
        obj.transfer(accno, recipient, 500, "8946");
        int balance1 = obj.requestBalance(accno, "8946");
        assertEquals(500, balance1);
//        int balance2 = obj.requestBalance(recipient, "8900");
//        assertEquals(500, balance2);


    }



}
