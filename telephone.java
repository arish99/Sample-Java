import java.util.*;
class telephone {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float r=150;
        float bill=0;
        System.out.println("Enter phone calls:");
        int p = sc.nextInt();
        if(p<=100)
        {
            bill += r;
        }
        else if(p>100 && p<=200)
        {
            bill = bill+(r+p);
        }
        else 
        {
            bill = (float) (bill+(r+(0.40*p)));
        }
        System.out.println("Bill:Rs."+bill);


    }
    
}
