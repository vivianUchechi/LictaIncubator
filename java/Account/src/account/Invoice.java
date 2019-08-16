/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

/**
 *
 * @author Nneka
 */
public class Invoice {
    private String number;
    private String description;
    private int QuantityBeingPurchased;
    private double pricePerItem;
    public Invoice(String number, String description, int QuantityBeingPurchased,double pricePerItem)
    {
        this.number = number;
    }
   
    
    
   public void setNumber (String number)
   {
      this.number = number;
   }
   
   public String getNumber()
   {
     return number;
   }
  
   public void Setdescription(String description)
   {
     this.description = description;
   }
   
   public String getDescription()
   {
     return description;
   }
   
   public void SetQuantityBeingPurchased(int QuantityBeingPurchased )
   {
     this.QuantityBeingPurchased =QuantityBeingPurchased ; 
    
   }
    
   public int getQuantityBeingPurchased()
   {
   return QuantityBeingPurchased;
  
   }
    
   public void setpricePerItem(double pricePerItem ) 
   {
     this.pricePerItem = pricePerItem ; 
    
   }
    
   public double getpricePerItem()
   {
   return pricePerItem;
   }
  
   public void getInvoice(double Invoice)
   {
     Invoice = QuantityBeingPurchased * pricePerItem ;
     
     if (QuantityBeingPurchased < 1)
         
           System.out.println("0");
     if( pricePerItem < 1 )
           System.out.println("null");
   }
}
