package onlineshop;

/**
 * Created by CMB on 02/11/2016.
 */

class Date implements Comparable <Date>{

    private int day;
    private int month;
    private int year;

    //User-defined constructor
    public Date(int d, int m, int y) {
        setDay(d);
        setMonth(m);
        setYear(y);
    }

    //Setters & Getters
    public void setDay(int d){
        if(d > 0 || d < 32){
            day = d;
        }else{
            System.out.println("Invalid day!");
        }
    }

    public void setMonth(int m){
        if(m > 0 || m < 13){
            month = m;
        }else{
            System.out.println("Invalid month!");
        }
    }

    public void setYear(int y){
        year = y;
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

    //User-defined compareTo method
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

    @Override
    public String toString() {
        return "Date{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
