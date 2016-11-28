/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author C13555907
 */
class Date implements Comparable <Date>{
    
    //Public data members declared here
    private int day; 
    private int month; 
    private int year;
    
    //User-defined constructor
    public Date(int d, int m, int y) {
       try {
           setDay(d);
       }catch(IllegalArgumentException e) {
           System.out.println("Exception thrown  :" + e);
       }
       try {
           setMonth(m);
       }catch(IllegalArgumentException e) {
            System.out.println("Exception thrown  :" + e);
       }
       try {
           setYear(y);
       }catch(IllegalArgumentException e) {
           System.out.println("Exception thrown  :" + e);
       }
    }
    
    //public member methods
    public void setDay(int d){
        if(d > 0 && d < 32){
            day = d;
        }else{
            throw new IllegalArgumentException("Invalid day! ");
        }
    }
    public void setMonth(int m){
        if(m > 0 && m < 13){
            month = m;
        }else{
            throw new IllegalArgumentException("Invalid month! ");
        }
    }
    public void setYear(int y){
        if(y > 2015) {
            year = y;
        }else{
            throw new IllegalArgumentException("Invalid year! ");
        }
    }
    
    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }

    public String toString(){
        return this.day + "/" + this.month + "/" + this.year;
    }

    @Override
    public int compareTo(Date compareDate) {
        if(compareDate.getYear() != this.getYear()){
            return compareDate.getYear() - this.getYear();
        }
        else if(compareDate.getMonth() != this.getMonth()){
            return compareDate.getMonth() - this.getMonth();
        }
        else if(compareDate.getDay() != this.getDay()){
            return compareDate.getDay() - this.getDay();
        }
        return 0;
    }
}
