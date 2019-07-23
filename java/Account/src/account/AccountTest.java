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
    private String name; //instance variable
    
    //method to set the name in the object
    public void setName(String name)
    {
     this. name = name ;//stores the name
    }
    
    // method to retrieve the name
    public String getName()
    {
     return name;
    }
}//end of class braces
