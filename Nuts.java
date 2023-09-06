import java.lang.reflect.Method;

public class Nuts {
    static void myMethod(String fname , int age)
    {
        System.out.println(fname+" is "+age);
    }
    public static void main (String args[])
    {
        myMethod("Ram",9);
        myMethod("Seetha",8);
        myMethod("Laxman",7);
    }
}
