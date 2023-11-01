import java.util.Scanner;

public class stud {
    private String name;
    private int id,total,p,c,m;
    void accecpt(){
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the details");
        name=sc.nextLine();
        id=sc.nextInt();
        p=sc.nextInt();
        c=sc.nextInt();
        m=sc.nextInt();
        total=sc.nextInt();
        total=p+c+m;
    }
    void dispaly(){
        System.out.println(name+"\t"+id+"\t"+p+"\t"+c+"\t"+m+"\t"+total+"\t");
    }
    class getthis{
        public static void main(String args[]){
            int n,i;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter number of students");
            n=sc.nextInt();
            stud s[]=new stud[n];
            for (i=0;i<=n-1;i++){
                s[i]=new stud();
                s[i].accecpt();
            }
            System.out.println("Name\tID\tPhy\tChem\tMaths\tTotal");
            for (i=0;i<=n-1;i++){
                s[i].dispaly();
            }
        }
    }
}
