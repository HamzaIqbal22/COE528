
package lab4;

/**
 *
 * @author Hamza
 */
public class Driver {


public static void main(String[] args) {
 
    FoodComponent fi1 = new FoodItem("blueberries", 2.5);
    FoodComponent fi2 = new FoodItem("strawberries", 3.5);
    FoodComponent fi3 = new FoodItem("egg", 4.5);
    FoodComponent fi4 = new FoodItem("chicken", 5.0);
    FoodComponent fi5 = new FoodItem("peas", 6.0);
    FoodComponent fi6 = new FoodItem("icecream", 7.0);

    FoodComponent fc1 = new FoodCategory("frozen");
    FoodComponent fc2 = new FoodCategory("meat");
    FoodComponent fc3 = new FoodCategory("vegetables");
    
    ((FoodCategory)fc1).addComponent(fc2);
    ((FoodCategory)fc1).addComponent(fc3);
    ((FoodCategory)fc1).addComponent(fi6);

    ((FoodCategory)fc2).addComponent(fi3);
    ((FoodCategory)fc2).addComponent(fi4);
    
    ((FoodCategory)fc3).addComponent(fi1);
    ((FoodCategory)fc3).addComponent(fi2);
    ((FoodCategory)fc3).addComponent(fi5);

    fc1.print(0);    
   }
}
