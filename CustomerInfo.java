import java.lang.Math;
import java.util.ArrayList;

public class CustomerInfo {
    public static void main(String[] args) {
        //declare an Array of Customers: 2 Customers, 2 Flight Customers, 2 Retail Customers
        ArrayList<Customer> customerList = new ArrayList<>();
        Customer customer1 = new Customer();
        Customer customer2 = new Customer("Julie", 30);
        FlightCustomer flightCustomer1 = new FlightCustomer();
        FlightCustomer flightCustomer2 = new FlightCustomer("Tato", 7, ((int)(Math.random() * 200)), 1002.56);
        RetailCustomer retailCustomer1 = new RetailCustomer();
        RetailCustomer retailCustomer2 = new RetailCustomer("Riley", 6, 454.65, 2);

        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(flightCustomer1);
        customerList.add(flightCustomer2);
        customerList.add(retailCustomer1);
        customerList.add(retailCustomer2);

        //loop to print out each Customer object
        for (int i = 0; i < customerList.size(); i++){
            System.out.println(customerList.get(i));
            System.out.println();
        }

/*
        System.out.println();
        customer1.setName("Customer1");
        System.out.println(customer1.getName()); */


    }
}
