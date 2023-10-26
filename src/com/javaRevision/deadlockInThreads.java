package com.javaRevision;
import java.lang.*;
class Library implements Runnable{

    String r1 = new String("JAVA");
    String r2 = new String("SQL");
    String r3 = new String("DSA");
    public void run(){
        String name = Thread.currentThread().getName();
        if(name.equals("s1")){
            try{
                Thread.sleep(2000);
                synchronized (r1){
                System.out.println("s1 has acquired" +r1);
                Thread.sleep(2000);
                synchronized ((r2)){
                    System.out.println("s1 has "+r2);
                    Thread.sleep(2000);

                    synchronized ((r3)){
                        System.out.println("s1 has "+r3);
                        Thread.sleep(2000);
                    }


            }}}
            catch(Exception e){
                System.out.println("some problem");

            }
        }
        else{try
        {
            Thread.sleep(2000);
            synchronized(r3){
                System.out.println("s2 has acquired" +r3);
                Thread.sleep(2000);
                synchronized ((r2)){
                    System.out.println("s2 has "+r2);
                    Thread.sleep(2000);

                synchronized(r1){
                    System.out.println("s2 has "+r1);
                    Thread.sleep(2000);
                }}


            }}
        catch(Exception e){
            System.out.println("some problem");

        }

        }
    }

}
public class deadlockInThreads {
    public static void main(String[] args) throws  Exception{
        Library l = new Library();
        Thread t1 = new Thread(l);
        Thread t2= new Thread(l);
        t1.setName("s1");
        t2.setName("s2");
        t1.start();
        t1.join();
        t2.start();

        t2.join();
        
    }
}
