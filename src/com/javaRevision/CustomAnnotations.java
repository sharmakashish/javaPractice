package com.javaRevision;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface CricketPlayer{
    String country()  default "countryy";

}
@CricketPlayer(country="INDIA")
class Virat{
    int runrate;
    String team;

    public String getTeam() {
        return team;

    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getRunrate() {
        return runrate;

    }

    public void setRunrate(int runrate) {
        this.runrate = runrate;
    }


    void displ(){
        System.out.println("displayingggg");

    }
}
public class CustomAnnotations {
    public static void main(String[]args){
        Virat v = new Virat();
        v.setRunrate(150);
        v.setTeam("rcb");
       int r =  v.getRunrate();
       String s = v.getTeam();
        System.out.println("runrate -- "+r +"  team "+ s);
        Class c =v.getClass();
        Annotation a=c.getAnnotation(CricketPlayer.class);
        CricketPlayer cp =(CricketPlayer)a;
        System.out.println(cp.country());
    }


}
