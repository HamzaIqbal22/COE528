package lab4;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.IOException;

/**
 *
 * @author Hamza
 */
public class Record {
    
    // Name of the associated file     
    private String filename; 
    
    //implementing the Singleton pattern
    private static Record r = new Record("record.txt");
    
    private Record (){}
    
    public static Record getInst (){
        if (r == null){
            r = new Record ();
        }
        return r;
    }
    
    public Record(String n) {         
        filename = n;    
    }    
    
    // Effects: Reads and prints the contents of the associated  
    // file to the standard output.   
    public void read() {    
        try { 
            Scanner scan = new Scanner (new File(filename));
            
            while (scan.hasNextLine())
                System.out.println(scan.nextLine());
            
        } catch (IOException e) {      
            System.out.println("An error occurred.");  
            e.printStackTrace();  
        } 
    }
    
    //Effects: Appends the specified message, msg, to the 
    //associated file.
    public void write (String msg){
    
        try {
    FileWriter fileWrite= new FileWriter(filename,true);
    fileWrite.write(msg);
    fileWrite.close();
        } catch (IOException e ){
          System.out.println("An error has occured.");
          e.printStackTrace();    
        }
    
    }
    
    public static void main (String [] args ) {
        //Fill in the blank below that obtain the sole instance 
        //of the record class
        // (You should not invoke the Record constructor here.)
    
        
        
        r.write ("Hello-1\n");
        r.write ("Hello-2\n");
        
        System.out.println("Currently the file record.txt " + "contains the following lines:");
        r.read();
    }
}
