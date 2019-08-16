/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Account test class that has a name instance variable
// creates method th set the name and gets its value
package account;

/**
 *
 * @author Nneka
 */
public class AccountTest
{ 
   /* private String name; //instance variable
    //constructor for the account test class
    public AccountTest(String name)
    {
    this.name=name;
   }
    //method to set the name in the object
    public void setName(String name)
    {
     this. name = name ;//stores the name
    }
    
    // method to retrieve the name
    public String getName()
    {
     return name;
    }*/
    private String name;
    private double balance;
    public AccountTest(String name, double balance)
    {
    this.name=name;
    
    if (balance > 0.0)
        this.balance = balance;
   }      
       public void deposit(double depositAmount)
       {
       if(depositAmount > 0.0)
           balance = balance + depositAmount ;
       }
       
       public void withdraw(double withdrawAmount)
       {
       if (withdrawAmount < balance)
           balance = balance - withdrawAmount;
      
       if(withdrawAmount > balance )
               System.out.println("Withdrawal amount exceeded account balance.");
       }
       
       public double getBalance()
       {
        return balance;
       }
       public void setName(String name)
       {
       this.name = name;
        
       }
       
       public String getName()
       {
        return name;
       }
        
}//end of class braces
