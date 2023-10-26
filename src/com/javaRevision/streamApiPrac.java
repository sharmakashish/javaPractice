package com.javaRevision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.stream.Stream;
import java.util.*;

public class streamApiPrac {
    public static void main(String[] args) {
//        Stack<String> s = new Stack<>();
//        s.push("hi kashish");
//        s.push("hi gursimran");
//        s.push("hi shubhan");
//        s.forEach(s1-> System.out.println(s1));
//        Stream<String> s2=s.stream();
        List<Integer> a = Arrays.asList(1,2,3,5,1,4,3,10);
        //method chaining is done or i can perform operation and collect it in another stream and then again perform operation
        Stream<Integer> st=a.stream().map(n->n*3).filter(n1->(n1%2==0)).sorted();

        st.forEach(s-> System.out.println(s));


    }
}
