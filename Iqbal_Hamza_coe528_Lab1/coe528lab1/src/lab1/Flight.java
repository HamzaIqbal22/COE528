
package lab1;

/**
 *
 * @author Hamza
 */
public class Flight {
   
    private int flightNumber;
    private String origin;
    private String destination;
    private String departureTime;
    private int capacity;
    private int numberOfSeatsLeft;
    private double originalPrice;

    Flight(int flightNumber, String origin, String destination, String departureTime, int capacity, double originalPrice) {
        this.flightNumber= flightNumber;
    this.origin= origin;
    this.destination=destination;
    this.departureTime = departureTime;
    this.capacity=capacity;
    this.numberOfSeatsLeft= capacity;
    this.originalPrice=originalPrice;
    
    if (origin.equals(destination)){
    throw new IllegalArgumentException (" Origin and destination are the same.");
        }
    }

   
   //Setter and Getter for flight number
  public void setFlightNumber (int flightNum){
      this.flightNumber = flightNum;
    }
    
  public int getFlightNumber (){
        return this.flightNumber;
    }
  
  //Setter and Getter for destination
  public void setOrigin (String Origin){
      this.origin = Origin;
    }
    
  public String getOrigin (){
        return this.origin;
    }
  
  //Setter and Getter for destination
  public void setDestination (String Destination){
      this.destination = Destination;
    }
    
  public String getDestination (){
        return this.destination;
    }
  
  //Setter and Getter for destination
  public void setDepartureTime (String DeptTime){
      this.departureTime = DeptTime;
    }
    
  public String getDepartureTime (){
        return this.departureTime;
    }
  
  //Setter and Getter for capacity
  public void setCapacity (int Capacity){
      this.capacity = Capacity;
    }
    
  public int getCapacity (){
        return this.capacity;
    }
  
  //Setter and Getter for number of seats 
  public void setNumofSeatsLeft (int SeatsLeft){
      this.numberOfSeatsLeft = SeatsLeft;
    }
    
  public int getNumofSeatsLeft (){
        return this.numberOfSeatsLeft;
    }
  
  //Setter and Getter for number of seats 
  public void setOriginalPrice (int OrigPrice){
      this.originalPrice = OrigPrice;
    }
    
  public double getOriginalPrice (){
        return this.originalPrice;
    }

public boolean bookASeat (){
    System.out.println ("You have successfully booked a seat");
    if (this.numberOfSeatsLeft>0){
     numberOfSeatsLeft--;
     System.out.println ("Number of seats left: " + numberOfSeatsLeft);
        return true;
    }
    else 
        return false;

    }
    
@Override
public String toString (){
return "Flight " + flightNumber + ", " + origin + " to " + destination + ", " + departureTime +
         ", " + "original price: $" + originalPrice;
    }


}
