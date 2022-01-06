import java.util.*;
class student
{
    int roll_no;String name;int eng,hin,sst,mat,sc,cta;
    void input()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter name and rollno:");
        name = s.nextLine();
        roll_no = s.nextInt();
        System.out.println("Enter marks:");
        eng = s.nextInt();
        hin = s.nextInt();
        sst = s.nextInt();
        mat = s.nextInt();
        cta = s.nextInt();
        sc = s.nextInt();
    }
    int total()
    {
        int t = eng+mat+sst+hin+cta+sc;
        return t;
    }
    void display()
    {
        System.out.println("Name:"+name);
        System.out.println("Roll no:"+roll_no);
        int t = total();
        double p = (t*100)/600;
        System.out.println("Total:"+t);
        System.out.println("Percentage:"+p+"%");
        if(eng<40||hin<40||sst<40||mat<40||cta<40||sc<40)
        {
            System.out.println("Result:Fail");
            System.out.println("Division:NIL");
        }
        else
        {
            System.out.println("Result:Pass");
            if(p>=60)
            System.out.println("Division:First");
            else if(p>=45)
            System.out.println("Division:Second");
            else
            System.out.println("Division:Third");
            
        }
       
    }
    public static void main(String[] args) {
        student ob = new student();
        ob.input();
        ob.display();
    }
}