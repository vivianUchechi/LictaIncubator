// This program displays  numbers in the first array that would sum up to give number on the second array using the for loop and if statement
package addarrays;


public class AddArrays {

   // main method begins here
    public static void main(String[] args) {
        // first array that would be calculated
        
        int firstArray [] = new int []{1,2,3,4,5,6,7,8,9,10};
        // second array can be regarded as the result array.
        
        int secondArray [] = new int []{1,2,3,4,5,6,7,8,9,10};
        int sum=0;//to sum up numbers in the first array
        int i = 0; 
        boolean found = false;
        
        // runs through the first array
        for ( i = 0; i<firstArray.length;) 
        {   
            //calcultes the values in the first array
            for (int j = i+1; j<firstArray.length; j++) {
                
                // sum variable gets the values of the addition of values in the first array
                sum = firstArray[i] + firstArray[j];
                
                // for loop that runs through the second array
                for (int k =0; k < secondArray.length; k++) {
                    if(firstArray[k]==sum)
                    {
                        System.out.println(sum);
                       found  = false;
                           break;     
                    }
                }
                if(found==true){}
                
                i++ ;
            }
             break;
        } 

    }//end main method
    
}// end class
