public class p5bike implements p5vehicle{
    int lg = 1, ug = 6, curgear=1,minspeed = 0, maxspeed = 120, speed;
    public int changegear(int g){
        while(g<lg || g>ug){
            System.out.println("Enter valid gear");
            g = s.nextInt();
        }
        curgear = g;
        System.out.println("Gear changed successfully");
        return curgear;
    }
    public int changespeed(int s){
        while(s<minspeed || s>maxspeed){
            System.out.println("Enter valid change in speed");
            s = p5bicycle.s.nextInt();
        }
        speed+=s;
        System.out.println("Speed changed successfully");
        return speed;
    }
    public int applybrakes(){
        speed = 0;
        curgear = 1;
        System.out.println("Brakes applied successfully");
        return speed;
    }
    public void ride(){
        int c;
        while (true) {
            System.out.println("Enter");
            System.out.println("1. to show speed");
            System.out.println("2. to show current gear");
            System.out.println("3. to change speed");
            System.out.println("4. to change gear");
            System.out.println("5. to apply brakes");
            System.out.println("6. to stop riding");
            c = s.nextInt();
            if(c==1){
                System.out.println("Current speed is -> "+speed);
            }else if(c==2){
                System.out.println("Current gear is -> "+curgear);
            }else if(c==3){
                System.out.println("Enter desired speed");
                int sp = s.nextInt();
                changespeed(sp);
            }else if(c==4){
                System.out.println("Enter desired gear");
                int sp = s.nextInt();
                changegear(sp);
            }else if(c==5){
                applybrakes();
            }else{
                break;
            }
        }
    }
}