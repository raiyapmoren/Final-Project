/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raisa
 */
public class Mionth {
     private int monthNumber;
    String month;

    public Mionth() {
        monthNumber = 1;
    }

    public Mionth(int monthNumber) {
        this.monthNumber = monthNumber;
        
        //setMonthNumber(monthNumber);
    }

    public Mionth(String month) {
        this.month = month;

        if (this.month.equalsIgnoreCase("January")) {
            this.monthNumber = 1;
        } else if (this.month.equalsIgnoreCase("February")) {
            this.monthNumber = 2;
        } else if (this.month.equalsIgnoreCase("March")) {
            this.monthNumber = 3;
        } else if (this.month.equalsIgnoreCase("April")) {
            this.monthNumber = 4;
        } else if (this.month.equalsIgnoreCase("May")) {
            this.monthNumber = 5;
        } else if (this.month.equalsIgnoreCase("June")) {
            this.monthNumber = 6;
        } else if (this.month.equalsIgnoreCase("July")) {
            this.monthNumber = 7;
        } else if (this.month.equalsIgnoreCase("August")) {
            this.monthNumber = 8;
        } else if (this.month.equalsIgnoreCase("September")) {
            this.monthNumber = 9;
        } else if (this.month.equalsIgnoreCase("October")) {
            this.monthNumber = 10;
        } else if (this.month.equalsIgnoreCase("November")) {
            this.monthNumber = 11;
        } else if (this.month.equalsIgnoreCase("December")) {
            this.monthNumber = 12;
        }
    }

    public void setMonthNumber(int monthNumber) {
        
        //this.monthNumber = monthNumber;
        if (monthNumber >= 1 && monthNumber <= 12) {
            this.monthNumber = monthNumber;
        } else {
            monthNumber = 1;
        }
    }

    public int getMonthNumber() {
        return monthNumber;
    }

    public String getMonthName() {
        switch (monthNumber) {
            case 1:
                return "Janaury";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "January";
        }
    }

    @Override
    public String toString(){
        return getMonthName();
    }
    
    public boolean equals(Mionth m){
         return m.getMonthNumber() == this.getMonthNumber();
    }
    
    public boolean greaterThan(Mionth m){
         return this.getMonthNumber() > m.getMonthNumber();
    }
    
    public boolean lessThan(Mionth m){
         return this.getMonthNumber() < m.getMonthNumber();
    }
}

