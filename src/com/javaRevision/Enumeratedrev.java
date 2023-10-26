package com.javaRevision;
import java.lang.*;
import java.sql.SQLOutput;

import java.util.Locale;
import java.util.Scanner;

enum Result{
    //EXAMPLE OF HAVING METHODS AND CONSTRUCTOR IN ENUMS
    PASS , FAIL , NA;
    // public static final Result PASS = new Result();
    // public static final Result FAIL= new Result();
    // public static final Result NA = new Result();
    int marks;
    Result(){
        System.out.println("constructor in enum");
    }
    void setMarks(int marks){
        this.marks=marks;
    }
    int getMarks(){
        return marks;
    }
}
enum MONTH{
    JAN , FEB , MAR , JUNE, JULY , AUG ;
}
public class Enumeratedrev {
    //switch case example
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter valuee---");
        String mon= sc.next().toUpperCase();
        MONTH m2=MONTH.valueOf(mon);
        switch(m2)
        {
            case JAN:
            System.out.println("jan....");
            break;
            case FEB:
                System.out.println("febbb");
                break;
            case MAR:
                System.out.println("marchhh");
                break;
            default:
                System.out.println("doneee");



        }

        Result.PASS.setMarks(100);
        int m=Result.PASS.getMarks();
        int m1 = Result.NA.getMarks();
        System.out.println(m+" "+m1);



//EXAMPLE OF USING THE VALUES IN ENUMS
enum Week{
    MON , TUE , WED;
}

        int index = Week.MON.ordinal();
        System.out.println(index);
       Week[] w= Week.values();
        System.out.println(Week.valueOf("WED"));
       for(Week wr : w){
           System.out.println(wr +"index -" +wr.ordinal());
       }

    }

}
