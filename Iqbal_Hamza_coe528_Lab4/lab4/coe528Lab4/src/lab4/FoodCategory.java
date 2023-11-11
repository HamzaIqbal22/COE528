
package lab4;

import java.util.ArrayList;

/**
 *
 * @author Hamza
 */
public class FoodCategory extends FoodComponent {
    
    private String category;
    private ArrayList < FoodComponent> listOfComponents = new ArrayList(); 
            
    public FoodCategory (String category){
        
       super.setName(category);
    }
        //adds food component to arraylist
    public void addComponent (FoodComponent component){
        
        listOfComponents.add(component);
    
    }
    //removes food component to arraylist
    public void removeComponent (FoodComponent component){
    
        listOfComponents.remove(component);
    }
    
    //gets total price of category
    @Override
    public double getPrice(){
    
        double sum=0;
        
        for (FoodComponent component : listOfComponents){
        
            sum = sum + component.getPrice();
        
        }
        
        return sum;   
    }
    
    //prints the sum price and name of each category 
    @Override
    public void print (int level){   

        //FoodComponent component = new FoodComponent();
           for (int i=0;i<level;i++){
            System.out.println("FoodCategory (" + super.getName() + ", " + this.getPrice() + ") contains"); 
          
            }
       
           
       for (FoodComponent component : listOfComponents){
            
            
            component.print(level+1);
        
        } 
    }
  
}