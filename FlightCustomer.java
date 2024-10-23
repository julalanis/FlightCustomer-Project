public class FlightCustomer extends Customer {
    //named variables
    private int seatNumber;
    private double ticketPrice;

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
        if (ticketPrice <= 50){
            return "Gold";
        } else if (ticketPrice <= 100){
            return "Silver";
        } else if (ticketPrice <= 150){
            return "Bronze";
        } else return "Regular";
    }

    //toString method
    public String toString(){
        return //unsure what to return yet.
    }
}
