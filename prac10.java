import javax.sound.sampled.AudioFormat.Encoding;

public class prac10 {
    public static void main(String[] args) {
        decicar d = new decicar();
        car c = d.retcar(0);
        c.displayinfo();
    }
    public interface car{
        void displayinfo();
    }
    public class hatchback implements car{
        int engcapa=1200, wheeldrive=2, people=4, weight=1300, average=25;
        boolean airbag=false;
        public void displayinfo(){
            System.out.println("Welcome to hatchback");
            System.out.println("Engine capacity of the car in cc is " + engcapa);
            System.out.println("This car is " +wheeldrive+ " wheeldrive");
            System.out.println("This car can accomodate "+people+" people");
            System.out.println("Weight of the car is " + weight);
            System.out.println("Average kilometers travelled per litre of petrol are " + average);
            System.out.println("Status of airbags -> " + airbag);
        }
    }
    public class sedan implements car{
        int engcapa=1500, wheeldrive=4, people=5, weight=1500, average=20;
        boolean airbag=false;
        public void displayinfo(){
            System.out.println("Welcome to sedan");
            System.out.println("Engine capacity of the car in cc is " + engcapa);
            System.out.println("This car is " +wheeldrive+ " wheeldrive");
            System.out.println("This car can accomodate "+people+" people");
            System.out.println("Weight of the car is " + weight);
            System.out.println("Average kilometers travelled per litre of petrol are " + average);
            System.out.println("Status of airbags -> " + airbag);
        }
    }
    public class suv implements car{
        int engcapa=2000, wheeldrive=2, people=4, weight=1400, average=17;
        boolean airbag=true;
        public void displayinfo(){
            System.out.println("Welcome to suv");
            System.out.println("Engine capacity of the car in cc is " + engcapa);
            System.out.println("This car is " +wheeldrive+ " wheeldrive");
            System.out.println("This car can accomodate "+people+" people");
            System.out.println("Weight of the car is " + weight);
            System.out.println("Average kilometers travelled per litre of petrol are " + average);
            System.out.println("Status of airbags -> " + airbag);
        }
    }
    // public class decicar{
    //     public car retcar(int s){
    //         if(s == 1){
    //             return new hatchback();
    //         }else if(s == 2){
    //             return new sedan();
    //         }
    //         return new suv();
    //     }
    // }

}
