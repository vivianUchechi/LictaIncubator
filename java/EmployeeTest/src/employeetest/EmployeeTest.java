/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeetest;

/**
 *
 * @author Nneka
 */
public class EmployeeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creating two empoyee object.
       
        Empoyee myEmployee1 = new Empoyee("Okafor", "Mezie",20000.00);
        Empoyee myEmployee2 = new Empoyee("Okah", "Uchechi",26000.00);
        
        System.out.printf("Yealry salary for %s %s is: $%.2f %n ",myEmployee1.getFirstName(),myEmployee1.getlastName(),myEmployee1.getsalary());
        System.out.printf("His raise is %.2f %n " , myEmployee1.increase(myEmployee1.getsalary()));
        System.out.printf("Yealry salary for %s %s is: $%.2f %n",myEmployee2.getFirstName(),myEmployee2.getlastName(),myEmployee2.getsalary());
        System.out.printf("Her raise is %.2f %n " , myEmployee2.increase(myEmployee2.getsalary()));

       
        
       
        
       
        // give them both a 10% raise.
        
    }
    
}
