// this keyword to return current class instance

public class AAA {
    AAA getAAA(){
        return this;
    }
    void msg(){
        System.out.println("Hello Java");
    }
}
class test1{
    public static void main ( String args[]){
        new AAA().getAAA().msg();
    }
}
