public class Main {
    public static void main(String[] args) {

        SBI mehran = new SBI("mehran", "123", 200000);
        IOB alhan = new IOB("alhan", "456", 150000);

        System.out.println("Alhan account No = " + alhan.accountNo);
        System.out.println("Mehran account No = " + mehran.accountNo);

        String mehranaddmoney;
        mehranaddmoney = mehran.addMoney(75, "1233");
        System.out.println(mehranaddmoney);

        mehranaddmoney = mehran.addMoney(75, "123");
        System.out.println(mehranaddmoney);

        String alhanaddmoney;
        alhanaddmoney = alhan.addMoney(75, "1233");
        System.out.println(alhanaddmoney);

        alhanaddmoney = alhan.addMoney(75, "456");
        System.out.println(alhanaddmoney);

        System.out.println(mehran.rateOfInterest(5));
        System.out.println(alhan.rateOfInterest(5));

    }
}