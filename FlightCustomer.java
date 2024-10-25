public class FlightCustomer extends Customer {
    //named variables
    private int seatNumber;
    private double ticketPrice;

    //constructor with no parameters
    FlightCustomer(){
    }

    //constructor with parameters
    FlightCustomer(String name, int age, int seatNumber, double ticketPrice){
        setName(name);
        setAge(age);
        this.seatNumber = seatNumber;
        this.ticketPrice = ticketPrice;
    }

    //get methods for 2 variables
    int getSeatNumber(){
        return seatNumber;
    }

    double getTicketPrice(){
        return ticketPrice;
    }

    //set methods for 2 variables
    public void setSeatNumber(int seatNumber){
        this.seatNumber = seatNumber;
    }

    public void setTicketPrice(double ticketPrice){
        this.ticketPrice = ticketPrice;
    }

    //importanceLevel method to override Customer
    //no values given for ticketPrice and rankings, 1000+ Gold, 500-999 Silver, 250-499 Bronze, 0-250 Regular
    //EXTRA CREDIT: Seat assignments depending on ranking added
    @Override
    public String importanceLevel(){
        if (ticketPrice >= 1000.00){
            this.seatNumber = (int)(Math.random() * 50);
            return "Gold";
        } else if (ticketPrice >= 500.00){
            this.seatNumber = (int)(Math.random() * 50) + 50;
            return "Silver";
        } else if (ticketPrice >= 250.00){
            this.seatNumber = (int)(Math.random() * 50) + 100;
            return "Bronze";
        } else this.seatNumber = (int)(Math.random() * 50) + 150;
         return "Regular";
    }

    //toString method
    public String toString(){
        return  "Flight Customer: " + "\n" +
                "Customer name: " + getName() + "\n" +
                "Customer age: " + getAge() + "\n" +
                "Customer's importance level: " + importanceLevel() + "\n" +
                "Customer seat number: " + seatNumber + "\n" +
                "Customer ticket price: " + ticketPrice;
    }
}
