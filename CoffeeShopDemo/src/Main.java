import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Concrete.CustomerCheckManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		CustomerCheckManager customerCheckManager = new CustomerCheckManager();
		BaseCustomerManager customerManager = new StarbucksCustomerManager(customerCheckManager);
		
		customerManager.Save(new Customer(1, "Engin", "Demiroð", 1980, "12345678910"));
		

	}

}
