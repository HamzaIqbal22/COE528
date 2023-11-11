
package lab1;
import java.util.Scanner; //Importing Scanner Class
import java.util.ArrayList;
/**
 *
 * @author Hamza
 */
public class Manager{
    
   private static ArrayList < Flight> listOfFlights = new ArrayList();
   private ArrayList < Ticket> Tickets = new ArrayList();
    
  
    //creating numerous flights
    public void createFlights (){
    
    Flight f1 = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 100, 1000.0);
    listOfFlights.add(f1);
    
    listOfFlights.add(new Flight(1021, "Kolkata", "Toronto", "03/03/99 8:30 pm", 200, 1500.0));
    listOfFlights.add(new Flight(1020, "Toronto", "New York", "03/02/99 4:50 am", 100, 600.0));
    listOfFlights.add(new Flight(1033, "New York", "Toronto", "03/02/99 5:00 pm", 100, 600.0));
    listOfFlights.add(new Flight(1023, "New York", "Tokyo", "03/09/99 6:30 am", 400, 6000.0));
    listOfFlights.add(new Flight(1044, "Toronto", "Vancouver", "03/02/99 1:00 pm", 300, 400.0));
    listOfFlights.add(new Flight(1003, "Vancouver", "Toronto", "03/00/99 10:10 pm", 300, 400.0));
    listOfFlights.add(new Flight(1002, "Toronto", "Kolkata", "04/01/99 4:00 pm", 300, 2000.0));
    listOfFlights.add(new Flight(1022, "Toronto", "New York", "03/04/99 6:00 pm", 150, 600.0));
   
    
    
    
    }
  
    
    public void displayAvailableFlights (String origin, String destination){
    Flight f4;
        for (int i=0; i<listOfFlights.size(); i++)
            if (listOfFlights.get(i).getOrigin() == origin && listOfFlights.get(i).getDestination() == destination){
                f4 =  listOfFlights.get(i);
            }
        }

    public Flight getFlight (int flightNumber){
       for (int i=0; i<listOfFlights.size(); i++)
            if (listOfFlights.get(i).getFlightNumber() == flightNumber)
                return listOfFlights.get(i);
            
        return null;
    }
    
    public void bookSeat (int flightNumber, Passenger p){
       
       int i=0;
       Flight f4;
       double p1;
       
       
       for (i=0; i<listOfFlights.size(); i++){
          
         if (listOfFlights.get(i).getFlightNumber() == flightNumber){
            
             System.out.println(f4=listOfFlights.get(i));
             f4=listOfFlights.get(i);
             p1=listOfFlights.get(i).getOriginalPrice();
             f4.bookASeat();
             
             }
         }
                
     
    }   
   
    public static void main (String [] args){
        
    String n,n2,origin,destination;
    int age, memYrs, flightNum;
    System.out.println ("Welcome to the Olympus International Airport!");
    System.out.println ("Are u a member or non-member? :");
    Scanner input1 = new Scanner (System.in);
    n= input1.nextLine();
    
    if (n.equalsIgnoreCase("member")){
         System.out.println ("Enter your Name:");
         Scanner input = new Scanner (System.in);
         n2= input.nextLine();
    
         System.out.println ("Enter your age:");
         age = input.nextInt();
        
         
         System.out.println ("Enter how many years you have been a member for:");
         memYrs = input.nextInt();
         
         
         Member m2 = new Member(n2,age,memYrs);
         Manager m = new Manager();
         m.createFlights();
         
         System.out.println ("Enter the flight number of your flight:");
         flightNum = input.nextInt();
         
         
         for (int i=0; i<listOfFlights.size(); i++){
            if (flightNum == listOfFlights.get(i).getFlightNumber()){
                double p = listOfFlights.get(i).getOriginalPrice();
                m.bookSeat(flightNum,m2);
                System.out.println ("Checking for Discount..");
                m2.applyDiscount(p);
                m.getFlight(flightNum);
                origin = listOfFlights.get(i).getOrigin();
                destination = listOfFlights.get(i).getDestination(); 
                m.displayAvailableFlights(origin, destination);
                
                
         } else {}
            
         }
         
    }else{
        System.out.println ("Enter your Name:");
         Scanner input = new Scanner (System.in);
         n2= input.nextLine();
    
         System.out.println ("Enter age:");
         age = input.nextInt();
         NonMember m1 = new NonMember(n2,age);
         
         Manager m = new Manager();
         m.createFlights();
         
         System.out.println ("Enter the flight number of your flight:");
         flightNum = input.nextInt();
         
         
         for (int i=0; i<listOfFlights.size(); i++){
            if (flightNum == listOfFlights.get(i).getFlightNumber()){
               double p = listOfFlights.get(i).getOriginalPrice();
                m.bookSeat(flightNum,m1);
                System.out.println ("Applying Discount..");
                m1.applyDiscount(p);
                m.getFlight(flightNum);
                origin = listOfFlights.get(i).getOrigin();
                destination = listOfFlights.get(i).getDestination();
                m.displayAvailableFlights(origin, destination);
            } 
          }
        }
      }
    }