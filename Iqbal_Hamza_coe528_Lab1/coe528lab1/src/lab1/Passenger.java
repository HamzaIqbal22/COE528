
package lab1;

/**
 *
 * @author Hamza
 */
public abstract class Passenger {
  
    private String name;
    private int age;
    
    public Passenger (String name, int age){
        this.name = name;
        this.age = age; 
    }
    
    public void setName (String name){
        this.name= name;
    }
    
    public String getName (){
        return name;
    }
      
    public void setAge (int name){
        this.age= name;
    }
    
     public int getAge (){
        return age;
    }
    
      abstract double applyDiscount (double p);
     
     
     
}
