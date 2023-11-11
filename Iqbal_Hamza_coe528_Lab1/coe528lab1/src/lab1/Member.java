/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 * @author Hamza
 */
public class Member extends Passenger {
    
    int yearsOfMembership;
    
    public Member (String name, int age, int memYears){
       super (name,age);    
       this.yearsOfMembership= memYears;
    }
    
    
    @Override
    public double applyDiscount (double p){
        if (yearsOfMembership> 5){
           System.out.println("Congratulations! You are eligible for our loyal membership discount!");
           System.out.println("Your new price is $" + (p*0.5));
            return (p * 0.5); 
        }
    else if (1<yearsOfMembership && yearsOfMembership<=5){
           System.out.println("Congratulations! You are eligible for our new membership discount!");
           System.out.println("Your new price is $" + (p*0.9));
           return (p * 0.9);
        }
    else return p;
    }        
}
