public class CustomerInfo {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        Customer customer2 = new Customer("Julie", 30);

        FlightCustomer flightCustom1 = new FlightCustomer();
        FlightCustomer flightCustom2 = new FlightCustomer("Tato", 7, 175, 590.99);

        System.out.println(customer1.toString());

        System.out.println();

        System.out.println(customer2.toString());

        System.out.println();

        System.out.println(flightCustom1.toString());

        System.out.println();

        System.out.println(flightCustom2.toString());


    }
}
