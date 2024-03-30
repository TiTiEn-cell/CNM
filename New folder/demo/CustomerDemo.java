package demo;

import java.time.LocalDate;
import java.util.Arrays;

import com.mongodb.client.MongoDatabase;

import dao.CustomerDAO;
import entities.Customer;
import entities.Phone;
import utils.DBConnection;

public class CustomerDemo {

	public static void main(String[] args) {
		DBConnection conn = new DBConnection();
		MongoDatabase db = conn.getDatabase();

		CustomerDAO customerDAO = new CustomerDAO(db);

		// Get customer
//		Customer customer = customerDAO.getCustomer("EMMI16");
//		System.out.println(customer);

		// Add customer
//		Customer customer1 = new Customer("TEST_01", "Test", "01", LocalDate.of(1980, 02, 01));
//		customer1.setPhones(Arrays.asList(new Phone("Home", "123456789"), new Phone("Company", "023456789")));
//		boolean result = customerDAO.addCustomer(customer1);
//		System.out.println(result);
//
//		Customer customer2 = new Customer("TEST_02", "John2", "Smith2", LocalDate.of(1982, 02, 15));
//		Customer customer3 = new Customer("TEST_03", "John3", "Smith3", LocalDate.of(1986, 12, 01));
//		boolean result2 = customerDAO.addCustomers(Arrays.asList(customer2, customer3));
//		System.out.println(result2);
		
//		boolean resultUpdate = customerDAO.updateCustomerFirstName("TEST_01", "John 01");
//		System.out.println(resultUpdate);
//		
//		Customer customer = new Customer("TEST_01","John01", "Smith01", LocalDate.of(1980, 02, 10));
//		customerDAO.updateCustomer(customer);
		
//		customerDAO.deleteCustomer("TEST_01");
		
		customerDAO.getCustomerList(0, 4)
		.forEach(cus -> System.out.println(cus));
	
	}

}
