import java.awt.print.Book;
import java.util.Scanner;

class Publication {
    //Publication is class is a base class
    String title; //Common data member
    int price, copies;
    public static int total=0; //total sale of publication which will remain static even after various iterations of the code
    public int saleCopy(){
        System.out.println("Total sale of publications is:"+(copies*price));
        return (copies*price);
    }
    public int getcopies(){
        return this.copies;
    }
    public int setcopies(int cp){
        return this.copies=cp;
    }
    public int setprice(int p){
        return this.price=p;
    }

}

class book extends Publication
{
    //book is the derived class of publication
    String author; //author of the book
    int pcopies,price1; //temporary variables to set the values of the price and copies
    public int salecopy(){ // overidden method
        System.out.println("Total sale book is :"+(copies*price));
        total=total+(copies*price);
        return (copies*price);
    }

    public void orderCopies(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the title of the Book to be ordered: ");
        title=sc.nextLine();
        System.out.println("Enter the author of the book to be ordered:");
        author=sc.nextLine();
        System.out.println("Enter the no of copies of the book to be ordered:");
        pcopies=sc.nextInt();
        System.out.println("Enter the price of the book to be ordered");
        price1=sc.nextInt();
        setcopies((getcopies()+pcopies));
        setprice(price1);
    }
}

/*class magazine extends Publication{
    private int orderQty;
    private String currIssue;
    public String getCurrIssue(){
        return this.currIssue;
    }
    public void setCurrIssue(String issue){
        this.currIssue=issue;
    }
    public int getOrderQty(){
        return this.orderQty;
    }
    public int salecopy(){
        System.out.println("Total sale of magazine is: "+(copies*price));
        total=total+(copies*price);
        return (copies*price);
    }
    public void recvNewIssue(String pNewIssue){
        setcopies(orderQty);
        currIssue=pNewIssue;
    }
}*/
public class EXP2 {
    public static void main (String args[]){
        book b1=new book();
        b1.orderCopies();
        System.out.println("Total Copies of the book 1 ordered :"+b1.copies);
        System.out.println("Name of the book 1 ordered:"+b1.title);
        b1.salecopy();

        book b2=new book();
        b2.orderCopies();
        System.out.println("Total Copies of the book 2 ordered :"+b2.copies);
        System.out.println("Name of the book 2 ordered:"+b2.title);
        b2.salecopy();
        System.out.println("\n Total Sale of Publication is: "+b1.total);

    }
}
