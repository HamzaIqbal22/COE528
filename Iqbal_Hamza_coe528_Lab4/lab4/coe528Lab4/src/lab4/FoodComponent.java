
package lab4;

/**
 *
 * @author Hamza
 */
public abstract class FoodComponent {
    
    private String name;
    
    public FoodComponent (){}
    
    public abstract double getPrice();
    
    public abstract void print (int level); 
    
    public void setName (String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
}
