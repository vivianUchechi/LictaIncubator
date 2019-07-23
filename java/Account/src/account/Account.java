// creating and manipulating the AccountTest objects
package account;

import java.util.Scanner;



 

public class Account {

    
    
    
    public static void main(String[] args) {
        // createa scanner object to obtain input from command window
        Scanner input = new Scanner (System.in);
        
        // create an account object and assign it to my account
        AccountTest myAccount = new AccountTest();
        
        //display initial value of name
        System.out.printf("The initial name is:%s%n%n", myAccount.getName());// how will i initialise this so as not to get null
        
        //promt for and read name
        System.out.println("Enter a name");//prompt
        String theName = input.nextLine();// read the line of text from the above prompt
        myAccount.setName(theName);//puts the name in my account
        System.out.println();// output a blank line
        
        //display the name stored in my account
        System.out.printf("Name in my account is:%n%s%n",myAccount.getName());
    }
    
}
