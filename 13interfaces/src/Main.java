public class Main {

    public static void main(String[] args) {

        ICustomerDal customerDal = new OracleCustomerDal(); //Interface de operasyonu kim yapacaksa o new yapılır. Interface ler de abstract class gibi new lenemezler
        customerDal.Add();

        CustomerManager customerManager = new CustomerManager();
        customerManager.seckin = new MySqlCustomerDal();
        customerManager.add();

    }

}
