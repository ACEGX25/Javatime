import java.util.Scanner;
public class circle {
    private float a, r;

    public void accept(float x) {
        r=x;
    }

    public void compute() {
        a = 3.142f * r * r;
    }

    public void dispaly() {
        System.out.println("THE AREA OF THE CIRCLE IS " + a);
    }
}


    class theme{
        public static void main (String args[]){
            float x;
            Scanner sc=new Scanner (System.in);
            System.out.println("ENTER THE RADIUS");
            x=sc.nextFloat();
            circle c=new circle();
            c.accept(x);
            c.compute();
            
        }
    }

