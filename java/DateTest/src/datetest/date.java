/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datetest;

/**
 *
 * @author Nneka
 */
public class date {
    public class Date {
    private int month;
    private int day;
     private int year;
     
     public Date (int month, int day,int year)
     {
      this.day=  day;
      this.month= month;
      this.year = year;
     }
     
      public void setDay(int Day)
      {
       this.day = day;
      }
     
       public int getDay()
       {
          return day;
       }
       
        public void setMonth(int month)
      {
       this.month = month;
      }
     
       public int getmonth()
       {
          return month;
       }
       
       public void setYear(int Year)
      {
       this.year = year;
      }
     
       public int getYear()
       {
          return year;
       }
       
       public int displayDate()
       {
         int displayDate = day/month/year;
         
         return displayDate;
       }
}

}
