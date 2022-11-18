public class CustomerManager {

    private BaseLogger logger;

    public CustomerManager(BaseLogger logger){

        this.logger = logger;

    }

    public void Add(){

        System.out.println("Customer added ");
        this.logger.Log("Log message");

    }

}
