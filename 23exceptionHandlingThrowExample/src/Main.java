public class Main { //bankamızdan para çekmek için atm ye gidiyoruz. Mesela biz hesabımızdan 100 lira para çekmeye çalışacağız ama hesabımızda 90 tl var bu durumda yetersiz bakiye hatası almamız lazım. Bu örnekte bunu inceleyeceğiz.

    public static void main(String[] args) {
        AccountManager manager = new AccountManager();

        manager.deposit(100);

        System.out.println("Money has been deposited account = " + manager.getBalance());

        try{
            manager.withdraw(90);
        }
        catch (Exception exception){
            System.out.println(exception.getMessage());
        }

        System.out.println("Money has been withdrawn account = " + manager.getBalance());

        try{
            manager.withdraw(20);
        }
        catch (Exception exception){
            System.out.println(exception.getMessage());
        }

        System.out.println("Account balance = " + manager.getBalance());
    }
}
