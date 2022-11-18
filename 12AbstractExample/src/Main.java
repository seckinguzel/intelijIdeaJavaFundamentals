public class Main { //bir müşterinin veritabanına kaydedilmesini işliyor olacağız

    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.databaseManager = new OracleDatabaseManager();

        customerManager.getCustomers();
    }

}
