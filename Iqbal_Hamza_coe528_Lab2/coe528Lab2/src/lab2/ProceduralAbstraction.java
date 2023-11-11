package lab2;
import java.util.Scanner;
/**
 *
 * @author Hamza
 */
public class ProceduralAbstraction {
 
    
//Requires: None 
//Modifies: None 
//Effects: Returns the smallest positive integer n for which n! 
//      (i.e. 1*2*3*...*n) is greater than or equal to x, for positive  
//       integer x. Otherwise returns 1. 

    public static int reverseFactorial (int x){
   //initialize n to 1 
    int n=1;
       
//if x is less than or equal to zero, return 1
        if (x<=0){
            return 1;
        }
        
        //looping for all factorial numbers
        for (int i=1;i<100000;i++){
        
            n=n*i;
        //checks to see if n is greater than or equal to x    
        if (n>=x){
            //if that is the case, returns the index i 
            return i;
            }
        }
        return 1;   
    }    
//Requires: None 
//Modifies: None 
//Effects: If the matrix arr satisfies Nice property, prints the sum and  
//         returns true. Otherwise returns false.
    
    public static boolean isMatrixNice (int [] [] arr){
        
/*
//indexs for rows, columns
        int i,j;
        
        // total variable to compare result 
        int total = 0;
        
        // total variable for addition of rows
        int totalPerRow;
        
        // total variable for addition of columns
        int totalPerCol;
       
        // total variables for diagonal sum
        int TopLeftToBottomRight;
        int TopRightToBottomLeft;



        // Checking to make sure array isnt null or vacant
            if (arr == null || arr.length ==0){
                return false;
                }
             
            //return false if not lengths are not same since its not a square matrix
            for (i=0;i<arr.length; i++){
                if (arr[i].length != arr.length){
                    return false;
                }    
                totalPerRow = 0;
                //determing the total sum of each row
                for (j=0;j<arr[i].length;j++){
                    
                    totalPerRow = totalPerRow + arr[i][j];
                }
                
                 if (i==0){
                    total= totalPerRow;
                }
                 
                 else if (total !=totalPerRow){
                     return false;
                 }
           
            }
            
       
             //determing the total sum of each column
           for (i=0;i<arr.length;i++){
                 totalPerCol = 0;
               for (j=0;j<arr.length;j++){
                  totalPerCol= totalPerCol + arr[j][i];
               }
               // if 
               if (totalPerCol!=total){
                   return false;
                }
                   
            }
     
           //determining the total sum of each diagonal
            TopLeftToBottomRight= 0;
            TopRightToBottomLeft= 0;
           
           for (i=0;i<arr.length;i++){
               
           TopLeftToBottomRight= TopLeftToBottomRight + arr[i][i];
           TopRightToBottomLeft= TopRightToBottomLeft + arr [arr.length-1-i][i]; 
           } 
           
           if (TopLeftToBottomRight !=total || TopRightToBottomLeft !=total ){
               return false;
           }
           
           else {
           System.out.println("The sum of the matrix is " + total);
           return true;
           }
*/  


//indexs for rows, columns
        int i,j;
        
        // total variable to compare result 
        int total = 0;
        
        // total variable for addition of rows
        int totalPerRow;
        
        // total variable for addition of columns
        int totalPerCol;
       
        // total variables for diagonal sum
        int TopLeftToBottomRight;
        int TopRightToBottomLeft;



        // Checking to make sure array isnt null or vacant
            if (arr == null || arr.length ==0){
                return false;
                }
             
            //return false if not lengths are not same since its not a square matrix
            for (i=0;i<arr.length; i++){
                if (arr[i].length != arr.length){
                    return false;
                }    
                totalPerRow = 0;
                //determing the total sum of each row
                for (j=0;j<arr[i].length;j++){
                    
                    totalPerRow = totalPerRow + arr[i][j];
                }
                
                 if (i==0){
                    total= totalPerRow;
                }
                 
                 else if (total !=totalPerRow){
                     return false;
                 }
           
            }
            
            //determining the total sum of each diagonal
            TopLeftToBottomRight= 0;
            TopRightToBottomLeft= 0;
           
           for (i=0;i<arr.length;i++){
               
           TopLeftToBottomRight= TopLeftToBottomRight + arr[i][i];
           TopRightToBottomLeft= TopRightToBottomLeft + arr [arr.length-1-i][i]; 
           } 
           
           if (TopLeftToBottomRight !=total || TopRightToBottomLeft !=total ){
               return false;
           }
            
       
             //determing the total sum of each column
           for (i=0;i<arr.length;i++){
                 totalPerCol = 0;
               for (j=0;j<arr.length;j++){
                  totalPerCol= totalPerCol + arr[j][i];
               }
               // if 
               if (totalPerCol!=total){
                   return false;
                }
               else {
           System.out.println("The sum of the matrix is " + total);
           return true;
           }
    }
     return true;              
 }      


   
        
        
        

    public static void main (String [] args){
    
        Scanner input = new Scanner(System.in); 
        
        
       
    System.out.println("Enter Number to get Reverse Factorial of:");
    int num = input.nextInt();
    System.out.println("The Reverse Factorial of " + num + " is " + reverseFactorial(num));
    
    int niceMatrix [][]= {{1,1,1},{1,1,1},{1,1,1}};
    int notNiceMatrix[][]= {{5,2,6},{7,4,5},{3,3,2}};
    
    if(isMatrixNice (niceMatrix)){
        System.out.println("The Matrix is Nice!");
    } 
    else {
        System.out.println("The Matrix is not Nice");
    }
    

    if(isMatrixNice (notNiceMatrix)){
        System.out.println("The Matrix is Nice!");
    } 
    else {
        System.out.println("Matrix is not Nice");
      }
    }
}