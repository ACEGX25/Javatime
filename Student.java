//using this keyword to refer current class instance variable

public class Student {
    int rollno;
    String name;
    float fee;
    Student(int rollno ,String name, float fee)
    {
        this.rollno=rollno;
        this.name=name;
        this.fee=fee;
    }
    void display() {
        System.out.println(rollno+" "+name+" "+fee);
    }
}

class testthis2 {
    public static void main (String args[])
    {
        Student s1=new Student(111,"Aditya",5000);
        Student s2=new Student(112,"Ankit",8000);
        s1.display();
        s2.display();
    }
}
