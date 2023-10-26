package com.javaRevision;
import java.time.*;

public class DateyimeAPI {    public static void main(String[] args) {
    java.util.Date dt= new java.util.Date();
    System.out.println(dt);
    long l = dt.getTime();
    java.sql.Date sq= new java.sql.Date(l);
    System.out.println(sq);
    LocalDateTime lp=LocalDateTime.now();
    System.out.println(lp);}
}
