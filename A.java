//this keyword to invoke current class method

public class A {
    void m(){
        System.out.println("hello m");
    }
    void n(){
        System.out.println("hello n");
        m();
    }
}
class testthis4{
    public static void main(String args[])
    {
     A a=new A();
     a.n();
    }

}