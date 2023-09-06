//this keyword to invoke current class constructor

public class AA {
    AA(){
        System.out.println("hello a");
    }
    AA (int x){
     this();
        System.out.println(x);
    }
}
class testthis5{
    public static void main (String args[]){
        AA a=new AA(10);
    }
}