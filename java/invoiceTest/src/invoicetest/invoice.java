/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoicetest;

/**
 *
 * @author Nneka
 */
public class invoice {

    //invoice(String string, String corn_Flakes, int i, double d) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}
    //public class Invoice {
    // instance variables for the app
    private String number;
    private String description;
    private int Quantity;
    private double price;
    private double Invoice;
    
    //constructor for class invoice.
    public invoice(String number, String description, int Quantity,double price)
    {
        this.number = number;
        this.description = description;
        this.Quantity = Quantity; 
        this.description = description;
        this.price = price;
   }
   
    
    // Creating set and get methods to be caed in the main method
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
   
   public void SetQuantity(int Quantity )
   {
     this.Quantity=Quantity ; 
    
   }
    
   public int getQuantity()
   {
   return Quantity;
  
   }
    
   public void setprice(double price ) 
   {
     this.price = price ; 
    
   }
    
   public double getprice()
   {
   return price;
   }
  
   public double getInvoice(double quantity, double price)
   {
       if(quantity < 0)
           quantity = 0;
       if(price < 0)
           price = 0;
     Invoice = quantity * price ;      
     return Invoice;
     
   }
    
}
