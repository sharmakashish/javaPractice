package com.javaRevision;
import java.lang.*;
class Queue{
    int x;
    boolean val=false;
    synchronized void put(int a){
        try{
            if(val==true){
                wait();
            }
            else{
            x=a;
            System.out.println("i have produced the data" +x);
            val=true;
            notify();
        }}
        catch(Exception e){
            System.out.println(e);
        }

    }
    synchronized void  get(){
        try{
            if(val==false){
                wait();
            }else{
            System.out.println("i have consumed the data "+x);
            val=false;
            notify();
        }}
        catch(Exception e){
            System.out.println(e);
        }

    }
}
 class Producer extends Thread {
    Queue q ;
    Producer(Queue a){
        q=a;
    }
    public void run(){
       int i=1;
      while(true){
          q.put(i++);
     }


}}
 class Consumer extends Thread {
    Queue q;
    Consumer(Queue b){
        q=b;
    }
    public void run(){
    //   q.get();
       while(true){
           q.get();
       }
    }

}
public class ProConsProblem {
    public static void main(String[] args)
    {
        Queue q = new Queue();
        Producer p=  new Producer(q);
        Consumer c = new Consumer(q);
        p.start();
        c.start();

    }

}
