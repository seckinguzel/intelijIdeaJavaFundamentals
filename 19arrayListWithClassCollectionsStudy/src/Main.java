import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();

        customers.add(new Customer(1, "Seçkin", "Güzel")); //Constructor sayesinde oluşturulan müşteriler
        customers.add(new Customer(2, "Zeynel", "Güzel"));
        customers.add(new Customer(3, "Filiz", "Kartal"));

        for (Customer customer : customers){
            System.out.println(customer.id);
            System.out.println(customer.firstName);
            System.out.println(customer.lastName);
        }
    }
}
