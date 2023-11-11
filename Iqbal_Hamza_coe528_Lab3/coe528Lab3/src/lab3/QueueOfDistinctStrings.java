
package lab3;

/**
 *
 * @author Hamza
 */
import java.util.ArrayList; 

public class QueueOfDistinctStrings {    
    // Overview: QueueOfDistinctStringsare mutable, bounded      
    // collection of distinct strings that operate in   
    // FIFO (First-In-First-Out) order.   
    //   
    // The abstraction function is:
    // AF (q) = a abstract QueneOfDistinctStrings  (where q is a queneOfDistinctString object)  
    //     q.items [0] = q0, where q0 would be 0th element within Arraylist, the "front" of the list 
    //     q.items [items.size - 1] = qn, where qn would be the "end" of the list
    // 
    //
    //
    // The rep invariant is:
    // if (q.items ==null)||( q.items.size !=n) where n is amount of items to be added  
    //  return false;
    //  for (int i=0;i<items.size();i++)  where i (outer loop) and j(inner loop) check if the value of each element equal each other
    //      for (int j=0;j<items.size();j++)    
    //              if (items.get(i).equals(items.get(j))) if string exists more than once,return false.
    //                      return false;
    //
    //the rep 
    private ArrayList<String> items; 
    // constructor  
    public QueueOfDistinctStrings() {     
        // EFFECTS: Creates a new QueueOfDistinctStringsobject   
        items = new ArrayList<String>();  
    }  
    // MODIFIES: this   
    // EFFECTS: Appends the element at the end of the queue     
    //          if the element is not in the queue, otherwise  
    //          does nothing.   
    public void enqueue(String element) throws Exception { 
        if(element == null) throw new Exception();
             if(false == items.contains(element))     
                    items.add(element); 
}     
    public String dequeue() throws Exception {   
    // MODIFIES: this   
    // EFFECTS: Removes an element from the front of the queue   
        if (items.size() == 0) throw new Exception();   
            return items.remove(0);    
    }  
    public boolean repOK() {     
    // EFFECTS: Returns true if the rep invariant holds for this   
    //          object; otherwise returns false 
       QueueOfDistinctStrings q = new QueueOfDistinctStrings ();
       
       q.items.add("ab");
       q.items.add("cd");
       q.items.add("ef");
       
       
     for (int i=0;i<items.size();i++){
          for (int j=0;j<items.size();j++) {   
                if (items.get(i).equals(items.get(j)))
                    return false;
          }
    }          
                  
     
    if (q.items != null && q.items.isEmpty()){
            return q.items.size()== 3 && q.items.get(0).equals("ab")&& q.items.get(1).equals("cd") && q.items.get(2).equals("ef");
    } else return false;
    } 

    public String toString() {       
    // EFFECTS: Returns a string that contains the strings in the  
    //          queue, the front element and the end element.   
    //          Implements the abstraction function. 
    // d) Write the code for the toString() here 
   
        String blank = "";
        if (items == null)
            return "The quene is empty";
        for (String s: items){
            blank += " " + s;
        }
    return blank;
    }
} 