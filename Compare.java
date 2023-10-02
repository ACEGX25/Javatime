import java.util.Scanner;

class Compare{
    protected int a;
    Compare(int x){
        a=x;
    }
    Compare compare(Compare c) {
    if (a > c.a)
        return this;
    else
        return c;
}
void show(){
    System.out.println("a=="+a);
}
}
class ethan{
    public static void main(String args[]){
        int b;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        b=sc.nextInt();
        Compare c1= new Compare(b);
        System.out.println("Enter another number");
        b=sc.nextInt();
        Compare c2=new Compare(b);
        Compare c3;
        c3=c1.compare(c2);
        c3.show();
    }
}