
package lab1;

/**
 *
 * @author Hamza
 */
public class Ticket {
   private Passenger passenger;
   private Flight flight;
   private double price;
   private int number;
   
   public Ticket (Passenger p, Flight flight, double price){
   this.passenger = p;
   this.flight = flight;
   this.price = price;
    }
   
   public void setPassenger (Passenger passenger){
   this.passenger=passenger;
   }
   
   public Passenger getPassenger (){
   return passenger;
   }
   
    public void setFlight (Flight flight){
   this.flight=flight;
   }
   
   public Flight getFlight(){
   return flight;
   }
   
   public void setPrice (double price){
   this.price=price;
   }
   
   public double getPrice (){
   return price;
   }
   
   public void setNumber (int number){
   this.number=number;
   }
   
   public double getNumber (){
   return number;
   }
   
   @Override
   public String toString (){
   
      
       
  return passenger + "Flight " + flight.getFlightNumber() + ", " + flight.getOrigin() + " to " + flight.getDestination() + ", " + flight.getDepartureTime() + ", " + "original price: $ " + flight.getOriginalPrice() + ", " + "Ticket Price: $" + this.price + "\n";
   }
   
}
