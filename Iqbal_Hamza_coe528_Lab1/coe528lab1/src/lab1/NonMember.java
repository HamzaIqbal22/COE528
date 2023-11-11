package lab1;

/**
 *
 * @author Hamza
 */
public class NonMember extends Passenger{
    
   
   //constructor of nonMember subclass
   //calls to super, the passenger class
    public NonMember (String name, int age) {
    super(name,age);
    }
    
    //discount for non members. If older than 65, then 10%off.
    @Override
    public double applyDiscount (double p){
        
        if (this.getAge()>= 65){
            System.out.println("You're elligible for the senior discount!");
            System.out.println("Your new price is $" + (p*0.9));
            return ( p * 0.9 );
        }
        else
            System.out.println("Your new price is $" + p);
            return p;
        }    
}
