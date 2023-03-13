public interface Band_Interface {
    public int getBalance(String  password);

    public String addMoney(int money,String password);

    public String wirhdrawMoney(int money, String password);

    public String changePassword(String oldPassword, String newPassword);

    public double rateOfInterest(int years);



}
