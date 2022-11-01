package oops;

class Customer{
    private int custId;
    String custName,custaddress;

    public Customer(int custId, String custName, String custaddress) {
        this.custId = custId;
        this.custName = custName;
        this.custaddress = custaddress;
    }

    public String display(){

    return "\n\nCustomerId :"+custId+"\n"+"CustomerName :"+custName+"\n"+"CustomerAddress :"+custaddress;
    }


}

class AccountInfo{
    int accountNo;
    double accountBalance ;
    String accountType;
    Customer c;

    public AccountInfo(int accountNo, double accountBalance,Customer c ,String accountType) {
        this.accountNo = accountNo;
        this.accountBalance = accountBalance;
        this.accountType = accountType;
        this.c = c;
    }

    public void display(){
        System.out.println("\n****Account Details****");
        System.out.println("\nAccount Number:"+ accountNo);
        System.out.println("Account Balance:"+ accountBalance);
        System.out.println("Account Type:"+ accountType);
        System.out.println("\n****Customer Details****"+c.display());

    }
}
public class AccountTest {
    public static void main(String[] args) {
        Customer c = new Customer(1,"Shraddha","Nashik");
        AccountInfo acc = new AccountInfo(234,45678,c,"Saving");
       // c.display();
        acc.display();
    }
}
