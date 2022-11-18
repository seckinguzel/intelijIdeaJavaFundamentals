public class AccountManager {
    private double balance;

    public void deposit(double amount){ //hesaba para ekleme kısmı
        balance = getBalance() + amount; //burada ilk başta balance += amount; kodu vardı biz aşağıda refactor den get koyunca bu hale dönüştü. Aynısı withdraw işlemi içinde geçerli.
    }

    public void withdraw(double amount) throws Exception { //hesaptan para çekme kısmı
        if(balance >= amount){
            balance = getBalance() - amount;
        }
        else{
            throw new Exception("Insufficient Balance!");
        }
    }

    public double getBalance() { //hesaptaki parayı okumamızı sağlıyor. bunu yukardaki balance üzerine sağ tıklayıp refactor->encapsulate fields ardından açılan pencerede set tikini kaldırıp enter a basıyoruz.
        return balance;
    }
}
