/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentclass;

/**
 *
 * @author Nneka
 */
public class StudentClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Sclass account1 = new Sclass ("Okah Uchechi",50.0);
       Sclass account2 = new Sclass ("Ogbonna Nnekk",60.0);
       
        System.out.printf("%s's letter grade is: %s%n ",
                account1.getName(),account1.getletterGrade());
      System.out.printf("%s's letter grade is: %s%n ",
            account2.getName() , account2.getletterGrade());
    
    } 
}
