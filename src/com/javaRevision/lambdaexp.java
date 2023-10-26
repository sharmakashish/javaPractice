package com.javaRevision;

import java.util.*;
import java.util.stream.Stream;
interface bike{
    public void drivebike();
}
interface truck{
    public void drivetruck(int avg);
}
interface car{
   public void drive(int avg , int topspeed);
}
public class lambdaexp {
    public static void main(String[] args) {
        // when there is no parameter
        bike b = ()-> System.out.println("driving a bike...");
        // single parameter
        truck t = avg -> System.out.println("avg is.."+avg);
        // 2 parameters and multiple lines of code in block
        car c = (a , ts)->{
            System.out.println("avg is--"+a);
            System.out.println("top speed is" +ts);
   };
        b.drivebike();
        t.drivetruck(40);
        c.drive(120,150);

        List<Integer> l2 = Arrays.asList(2,3,4,5,6,8);
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(12);
        ll.add(13);
        ll.add(15);
        ll.forEach(n2-> System.out.print("linked list--"+n2));

        l2.forEach(n2-> System.out.print("arrays--- "+n2));


    }}
