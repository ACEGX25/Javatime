public class myclass{
    private int attribute1;
    private String attribute2;
    private double attribute3;

    public myclass(int attribute1, String attribute2 ,double attribute3){
        this.attribute1=attribute1;
        this.attribute2=attribute2;
        this.attribute3=attribute3;
    }
    public void mymethod(myclass obj){
        System.out.println("Attribute 1 "+obj.attribute1);
        System.out.println("Attribute 2 "+obj.attribute2);
        System.out.println("Attribute 3 "+obj.attribute3);
    }
    public static void main(String args[]){
        myclass myobject1=new myclass(10,"Hello",3.14);
        myclass myobject2=new myclass(20,"World",6.28);
        myobject2.mymethod(myobject1);

    }
}
//In the code above we have used java object as our parameter
//n summary, this code defines a class with private attributes and a method to print those attributes for a given object.
// It demonstrates object creation and method invocation in Java. When the main method is executed,
// it creates two objects and calls the mymethod to display the attributes of one object using the other object as an argument.
// The output is as follows
//Attribute 1 20
//Attribute 2 World
//Attribute 3 6.28