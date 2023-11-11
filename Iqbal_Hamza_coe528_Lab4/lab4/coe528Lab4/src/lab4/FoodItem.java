
package lab4;

/**
 *
 * @author Hamza
 */
public class FoodItem extends FoodComponent {
    
    private double price;
    private FoodItem item;
    
    public FoodItem (String name, double price){
        
        super.setName(name);
        this.price= price;
    }
   
    //prints the sum type of item and price of each item
    @Override
    public void print (int level){
            
            for (int i=-1;i<level;i++)
            System.out.print("    ");
            System.out.println("FoodItem: " + super.getName() + ", " + this.getPrice()); 
           
        }
    
    @Override
    public double getPrice(){
        return price;
    }
    
    }
     

