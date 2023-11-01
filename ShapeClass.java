/*
Name-
Batch-
Roll no-
Class-
 */



import java.lang.Math.*;

abstract class shape {
    double area;
    abstract public void compute_area();
}
class rectangle extends shape
{
    double width,height;
    rectangle(double width,double height)//parameterized constructor
    {
        super();
        this.width=width;
        this.height=height;
    }
    public void compute_area()//method overriden
    {
        area=width*height;
        System.out.println("Area of rectangle: "+area);
    }
}
class triangle extends shape
{
    double side1,side2,side3;
    double result;
    triangle(double side1 , double side2, double side3)
         {
    super();
    this.side1=side1;
    this.side2=side2;
    this.side3=side3;
}
    public void compute_area()
    {
        result=0.5*(side1+side2+side3);
        area=Math.sqrt(result*(result-side1)*(result-side2)*(result-side3));
        System.out.println("Area of triangle: "+String.valueOf(area));
    }
}
public class ShapeClass
{
    public static void main(String args[])
    {
        triangle t1=new triangle(12.5,10.2,5.3);//run time
        rectangle r1=new rectangle(15,30);
        t1.compute_area();
        r1.compute_area();
    }
}
/*output
Area of triangle: 26.348814015055783
Area of rectangle: 450.0
 */
