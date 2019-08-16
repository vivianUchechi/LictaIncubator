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
        Empoyee myEmployee2 = new Empoyee("Okah", "Uchechi",28000.00);
        
        System.out.printf("current salary for %s is: $%.2f ",myEmployee1);
    }
    
}
