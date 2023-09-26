//Name-Geetesh Ganesh Karjavkar
// Roll no- 36
//batch-S2
//Program 1-Arithmatic operations on Complex Numbers

public class ComplexNumbers {
    int real,img;
    ComplexNumbers(int r, int i)
    {
        this.real=r;
        this.img=i;
    }
    public void show()
    {
        System.out.println(this.real+"+"+this.img+"i");
    }
    public static ComplexNumbers add(ComplexNumbers n1, ComplexNumbers n2)
    {
        ComplexNumbers add= new ComplexNumbers(0,0);
        add.real=n1.real+n2.real;
        add.img=n1.img+n2.img;
        return add;
    }
    public static ComplexNumbers sub (ComplexNumbers n1,ComplexNumbers n2)
    {
        ComplexNumbers sub= new ComplexNumbers(0,0);
        sub.real=n1.real-n2.real;
        sub.img=n1.img-n2.img;
        return sub;
    }
    public static ComplexNumbers mul (ComplexNumbers n1,ComplexNumbers n2)
    {
        ComplexNumbers mul= new ComplexNumbers(0,0);
        mul.real=n1.real-n2.real;
        mul.img=n1.img-n2.img;
        return mul;
    }
    public static ComplexNumbers div (ComplexNumbers n1,ComplexNumbers n2) {
        ComplexNumbers div = new ComplexNumbers(0, 0);
        div.real = n1.real - n2.real;
        div.img = n1.img - n2.img;
        return div;
    }
    public static void main (String args[])
    {
        ComplexNumbers c1= new ComplexNumbers(12,13);
        ComplexNumbers c2 = new ComplexNumbers(14, 15);
        System.out.println("The first complex number is--");
        c1.show();
        System.out.println("The second complex number is--");
        c2.show();
        ComplexNumbers add= add(c1,c2);
        System.out.println("Addition is");
        add.show();
        ComplexNumbers sub= sub(c1,c2);
        System.out.println("Subtraction is ");
        sub.show();
        ComplexNumbers mul=mul (c1,c2);
        System.out.println("Multiplication is");
        mul.show();
        ComplexNumbers div=div(c1,c2);
        System.out.println("Division is ");
        div.show();
    }
}

// The first complex number is--
//12+13i
//The second complex number is--
//14+15i
//Addition is
//26+28i
//Subtraction is
//-2+-2i
//Multiplication is
//-2+-2i
//Division is
//-2+-2i
//
//Process finished with exit code 0