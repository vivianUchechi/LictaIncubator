/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoicetest;

import java.util.Scanner;

/**
 *
 * @author Nneka
 */
public class InvoiceTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //create a scanner object to save user input
       Scanner input = new Scanner (System.in);
               
   // create an object of class in the main method and assign it to theInvoice
  invoice myInvoice = new invoice("1.","Corn Flakes", 4 , 400.00);
  //print out the first invoice generated
       System.out.println("Hard ware store");
       System.out.printf("%s Item:%s%n Quantity:%d%n Price: $%.2f%n",myInvoice.getNumber(),
               myInvoice.getDescription(),myInvoice.getQuantity(),myInvoice.getprice());
       
        System.out.println("Generating invoice for another purchase ");
        System.out.println("Enter invoice number:");
        String number = input.next();
        System.out.println("Enter item purchased:");
        String description = input.next();
        System.out.println("Quantity:");
        int quantity = input.nextInt();
        System.out.println("Price:");
        double price = input.nextDouble();
        
        System.out.println("Total amount of purchase is:"+ myInvoice.getInvoice(quantity,price));
        
        //double InvoiceAmount = input.nextDouble();
        //myInvoice.getInvoice(InvoiceAmount) ;
    }
    
    
}
