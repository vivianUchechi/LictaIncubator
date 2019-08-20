/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author Nneka
 */
public class Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int sum = 0;
       int x = 0;
       
       
       sum +=x;
        System.out.printf("The sum is %d%n",sum);
        
        while (x <= 3)
        {
           int y = x * x;
           sum += y;
          ++ x;
        }
        
        System.out.printf("sum of numbers %d",sum);

    }
    
}
