class prac1{
    public static void main(String[] args) {
        complex c1 = new complex();
        complex c2 = new complex(1,1);
        complex c3 = new complex(11,11);
        complex d = new complex();
        // d.dis(c1);
        // d.dis(c3);
        // d.dis(d.add(c3, c2));
        // System.out.println("heheh");
        // d.dis(d.sub(c2, c3));
        // d.dis(d.mul(c3, c1));
        d.dis(d.div(c3, c3));
        // d.dis(d.div(c2, c2));
        // d.dis(d.div(c3, c2));
    }

    public static class complex{
        float real,imaginary;
        complex(float r, float i){
            real = r;
            imaginary = i;
        }
        complex(){
            real = imaginary = 0;
        }
        
        public complex add(complex a, complex b){
            float r = a.real + b.real;
            float i = a.imaginary + b.imaginary;
            complex c = new complex(r, i);
            return c;
        }

        public complex sub(complex a, complex b){
            float r = a.real - b.real;
            float i = a.imaginary - b.imaginary;
            complex c = new complex(r, i);
            return c;
        }

        public complex mul(complex a, complex b){
            float r = a.real * b.real - a.imaginary * b.imaginary;
            float i = a.real * b.imaginary + b.real * a.imaginary;
            complex c = new complex(r, i);
            return c;
        }

        public complex div(complex a, complex b){
            float d = b.real*b.real + b.imaginary*b.imaginary;
            float r = (a.real*b.real + a.imaginary*b.imaginary)/d;
            float i = (a.imaginary*b.real - a.real*b.imaginary)/d;
            complex c = new complex(r,i);
            return c;
        }

        public void dis(complex c){
            System.out.println("Real -> " + c.real);
            System.out.println("Imaginary -> " + c.imaginary);
        }
    }
}
