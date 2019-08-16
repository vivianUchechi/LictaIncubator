// creating and manipulating the AccountTest objects
package account;

import java.util.Scanner;



 

public class Account {

    
    
    
    public static void main(String[] args) {
        // create a scanner object to obtain input from command window
       Scanner input = new Scanner (System.in);
        
        // create an account object and assign it to my account
       /* AccountTest myAccount = new AccountTest("Mary Rose");
        AccountTest myAccount2=new AccountTest("Mary Jane");
        //display initial value of name
       System.out.printf("The initial name is:%s%n%n", myAccount.getName());// how will i initialise this so as not to get null
        System.out.printf("The initial name is:%s%n%n", myAccount2.getName());
        //promt for and read name
        System.out.println("Enter a name");//prompt
        String theName = input.nextLine();// read the line of text from the above prompt
        myAccount.setName(theName);//puts the name in my account
        System.out.println();// output a blank line
        
        //display the name stored in my account
        System.out.printf("Name in my account is:%n%s%n",myAccount.getName());*/
      AccountTest account1 = new AccountTest ("Mary Rose",0.75);
        AccountTest account2 = new AccountTest ("Mary Jane",0.00);
        
         //print out initial balance in the account
        System.out.printf("%s balance : $%.2f%n",account1.getName(), account1.getBalance());
         System.out.printf("%s balance : $%.2f%n",account2.getName(), account2.getBalance());
         
         System.out.println("Enter deposit amount for account 1");
         double depositAmount=input.nextDouble();
         System.out.printf("%nAdding %.2f to account1 balance %n%n ",depositAmount);
         account1.deposit(depositAmount);
         
                  
         System.out.printf("Account balance for %s is $%.2f%n",account1.getName(),account1.getBalance());
         System.out.printf("Account balance for %s is $%.2f%n%n",account2.getName(),account2.getBalance());
    
          System.out.println("Enter deposit amount for account 2");
          depositAmount=input.nextDouble();
          System.out.printf("%nAdding $%.2f to account2 balance %n%n ",depositAmount);
          account2.deposit(depositAmount);
          
          System.out.printf("Account 0.10balance for %s is $%.2f%n",account1.getName(),account1.getBalance());
          System.out.printf("Account2 balance for %s is $%.2f%n%n",account2.getName(),account2.getBalance());
     
          System.out.println("Enter Withdrawal amount for account1");
          double withdrawAmount = input.nextDouble();
          System.out.printf("%n withdrawing %.2f from accout1 balance %n%n",withdrawAmount);
          account1.withdraw(withdrawAmount);
          
          System.out.printf("Account balance for %s is $%.2f%n",account1.getName(),account1.getBalance());
    
    
    
    
    }//end ofmain method
    
}// end of main class
