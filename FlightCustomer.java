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
    @Override
    public String importanceLevel(){
        if (seatNumber <= 50){
            return "Gold";
        } else if (seatNumber <= 100){
            return "Silver";
        } else if (seatNumber <= 150){
            return "Bronze";
        } else return "Regular";
    }

    //toString method
    public String toString(){
        return  "Customer name: " + getName() + "\n" +
                "Customer age: " + getAge() + "\n" +
                "Customer's importance level: " + importanceLevel() + "\n" +
                "Customer seat number: " + seatNumber + "\n" +
                "Customer ticket price: " + ticketPrice;
    }
}
