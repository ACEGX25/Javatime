//using this keyword to refer current class instance variable

public class Student {
    int rollno;
    String name;

    Student(int rollno ,String name )
    {
        this.rollno=rollno;
        this.name=name;

    }
    void display() {
        System.out.println(rollno+" "+name+" ");
    }
}

class testthis2 {
    public static void main (String args[])
    {
        Student s1=new Student(111,"Aditya");
        Student s2=new Student(112,"Ankit");
        s1.display();
        s2.display();
    }
}
