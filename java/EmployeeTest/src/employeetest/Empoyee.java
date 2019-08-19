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
public class Empoyee {
    private String firstName;
    private String lastName;
    private double salary;
    
    public Empoyee (String firstName, String lastName,double salary)
    {
      this.firstName = firstName;
      this.lastName = lastName;
      this.salary = salary;
    }
    
    public void setFirstName(String firstName)
    {
     this.firstName = firstName;
    }
    
    public String getFirstName()
    {
      return firstName;
    }
    
    public void setlastName(String lastName)
    {
     this.lastName = lastName;
    }
    
    public String getlastName()
    {
      return lastName;
    }
    
    public void setSalary(double salary)
    { 
        if (salary<0)
            salary = 0;
     this.salary = salary;
    }
    
    public double getsalary()
    {
       
            
      return salary;
    }
    
    public double increase(double increase)
    {
      salary = salary  + (salary * .2);
      return salary ;

    }
    
}
