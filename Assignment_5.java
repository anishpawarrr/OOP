import java.util.Scanner;
public class Assignment_5 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int x,d=0;
        System.out.println("Enter \n1 to ride Bicycle\n2 to ride Bike\n3 to drive Car");
        d=s.nextInt();
        while(d<0 || d>3){
            System.out.println("Enter valid number ");
            d=s.nextInt();
        }
        if(d==1){
            Bicycle m = new Bicycle();
            while(d!=6){

                System.out.println("Enter \n1 to display speed of "+m.getv()+"\n2 to increase/decrease speed\n3 to break\n4 to display current gear\n5 to change gear\n6 to stop driving");
                d=s.nextInt();
                while(d<0 || d>6){
                    System.out.println("Enter valid number");
                    d=s.nextInt();
                }
                if(d==1){
                    m.dispped();
                }else if(d==2){
                    System.out.println("To increase enter desired increment of speed \nTo decrease speed enter desired decrement of speed with negative sign");
                    x=s.nextInt();
                    m.ispeed(x);
                }else if(d==3){
                    m.apbreak();
                }else if(d==4){
                    System.out.println("Currently "+m.v+"is in "+m.gear+" gear");
                } else if (d==5) {
                    System.out.println("Enter desired gear");
                    x=s.nextInt();
                    m.chgear(x);
                } else if (d==6) {
                    break;
                }
            }
        } else if (d==2) {
            Bike m = new Bike();
            while(d!=6){

                System.out.println("Enter \n1 to display speed of "+m.getv()+"\n2 to increase/decrease speed\n3 to break\n4 to display current gear\n5 to change gear\n6 to stop driving");
                d=s.nextInt();
                while(d<0 || d>6){
                    System.out.println("Enter valid number");
                    d=s.nextInt();
                }
                if(d==1){
                    m.dispped();
                }else if(d==2){
                    System.out.println("To increase enter desired increment of speed \nTo decrease speed enter desired decrement of speed with negative sign");
                    x=s.nextInt();
                    m.ispeed(x);
                }else if(d==3){
                    m.apbreak();
                }else if(d==4){
                    System.out.println("Currently "+m.v+"is in "+m.gear+" gear");
                } else if (d==5) {
                    System.out.println("Enter desired gear");
                    x=s.nextInt();
                    m.chgear(x);
                } else if (d==6) {
                    break;
                }
            }
        }else {
            Car m = new Car();
            while(d!=6){

                System.out.println("Enter \n1 to display speed of "+m.getv()+"\n2 to increase/decrease speed\n3 to break\n4 to display current gear\n5 to change gear\n6 to stop driving");
                d=s.nextInt();
                while(d<0 || d>6){
                    System.out.println("Enter valid number");
                    d=s.nextInt();
                }
                if(d==1){
                    m.dispped();
                }else if(d==2){
                    System.out.println("To increase enter desired increment of speed \nTo decrease speed enter desired decrement of speed with negative sign");
                    x=s.nextInt();
                    m.ispeed(x);
                }else if(d==3){
                    m.apbreak();
                }else if(d==4){
                    System.out.println("Currently "+m.v+" is in "+m.gear+" gear");
                } else if (d==5) {
                    System.out.println("Enter desired gear");
                    x=s.nextInt();
                    m.chgear(x);
                } else if (d==6) {
                    break;
                }
            }
        }

    }
}
interface Vehicle {
    void dispped();
    void ispeed(int i);
    void apbreak();
    void chgear(int g);
    int getspeed();
    String getv();
}
import java.util.*;
 class Bicycle implements Vehicle{
      Scanner s = new Scanner(System.in);
     int speed=0;
     int gear = 1;
     boolean breek = false;
     String v = "Bicycle";

      @Override
      public void dispped() {
           System.out.println("Speed of "+v+" is "+speed+"Kmph");
      }

      @Override
      public void ispeed(int i) {
          speed+=i;
      }


      @Override
      public void apbreak() {
           speed=0;
      }
      @Override
      public String getv(){
          return v;
      }
      @Override
      public void chgear(int g) {
          while(g<0 || g>21){
               System.out.println("Enter valid gear number ");
               g= s.nextInt();
          }
          gear=g;
      }
      @Override
     public int getspeed(){
          return speed;
      }
 }
import java.util.Scanner;
class Bike implements Vehicle{
    Scanner s = new Scanner(System.in);
    int speed=0;
    int gear = 1;
    boolean breek = false;
    String v = "Bike";
    @Override
    public void dispped() {
        System.out.println("Speed of "+v+" is "+speed+"Kmph");
    }
    @Override
    public int getspeed(){
        return speed;
    }
    @Override
    public String getv(){
        return v;
    }



    @Override
    public void ispeed(int i) {
        speed+=i;
    }


     @Override
     public void apbreak() {
         speed=0;
     }

     @Override
     public void chgear(int g) {
         while(g<0 || g>6){
             System.out.println("Enter valid gear number ");
             g= s.nextInt();
         }
         gear=g;
     }

 }
import java.util.Scanner;
class Car implements Vehicle{
    Scanner s = new Scanner(System.in);
    int speed=0;
    int gear = 1;
    boolean breek = false;
    String v = "Car";
     @Override
     public void dispped() {
         System.out.println("Speed of "+v+" is "+speed+"Kmph");
     }
    @Override
    public int getspeed(){
        return speed;
    }
     @Override
     public void ispeed(int i) {
         speed+=i;
     }
     @Override
     public String getv(){
        return v;
    }


    @Override
     public void apbreak() {
        speed=0;
     }

     @Override
     public void chgear(int g) {
         while(g<0 || g>6){
             System.out.println("Enter valid gear number ");
             g= s.nextInt();
         }
         gear=g;
     }


 }
