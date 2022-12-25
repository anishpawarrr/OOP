import java.util.Scanner;

class prac5{
    public static void main(String[] args) {
        System.out.println("Hello");
        int d;
        Scanner s = new Scanner(System.in);

        while(true){
            System.out.println("Enter");
            System.out.println("1. to ride bicycle");
            System.out.println("2. to ride bike");
            System.out.println("3. to drive car");
            System.out.println("4. to exit");
            d = s.nextInt();
            if(d==1){
                p5bicycle b = new p5bicycle();
                b.ride();
            }else if(d==2){
                p5bike b = new p5bike();
                b.ride();
            }else if(d==3){
                p5car c = new p5car();
                c.ride();
            }else{
                break;
            }
        }
    }
}
