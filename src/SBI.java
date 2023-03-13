import java.util.UUID;

public class SBI implements Band_Interface {
    public String name;
    public String password;
    public int balance;
    public int interest = 7;
    UUID uuid = UUID.randomUUID();
    public String accountNo;

    public SBI(String name, String password, int balance) {
        this.name = name;
        this.password = password;
        this.balance = balance;

        this.accountNo = uuid.toString();
    }

    @Override
    public int getBalance(String password) {
        if(this.password == password)
            return balance;
        else System.out.println("Wrong password");
        return -1;
    }

    @Override
    public String addMoney(int money, String password) {
        if(this.password == password)
        {
            balance+=money;
            return (money + " added successfully!");
        }
        else {
            return "wrong password! try again";
        }
    }

    @Override
    public String wirhdrawMoney(int money, String password) {
        if(this.password == password)
        {
            balance-=money;
            return (money + " withdrawn successfully!");
        }
        else {
            return "wrong password! try again";
        }
    }

    @Override
    public String changePassword(String oldPassword, String newPassword) {
        if(this.password == oldPassword)
        {
            password = newPassword;
            return "Password changed Successfully";
        }
        else {
            return "Wrong Password! pls try again";
        }
    }

    @Override
    public double rateOfInterest(int years) {
        return (balance * interest * years)/100;
    }
}
