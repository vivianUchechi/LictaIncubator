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
public class Sclass {
    private String name;
    private double studentAverage;
    
    
    public Sclass (String name , double studentAvarage)
    {
        this.name = name;
        
        if(studentAverage > 0)
            if(studentAverage<=100)
                
        this.studentAverage = studentAverage;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setstudentAvarage(double studentAverage)
    {     
        if(studentAverage > 0)
            
            if(studentAverage<=100)
                
        this.studentAverage = studentAverage;
    }
    
    public double  getstudentAverage()
    {
        return studentAverage;
    }
    
    public String getletterGrade()
    {
       String letterGrade ;
       
       if (studentAverage >= 90.0 )
       letterGrade = "A";
       else if (studentAverage >= 80.0 )
           letterGrade = "B";
       else if (studentAverage >= 70.0 )
           letterGrade = "C";
       else if (studentAverage >= 60.0 )
           letterGrade = "D";
       else if (studentAverage >= 50.0) 
          letterGrade = "E";
       else
          letterGrade = "F";
       
       
       return letterGrade;

    }
            
            

 }