import java.util.*;
class Point {
    int x,y;
    Point(int X,int Y)
    {
        x = X;
        y = Y;
    }
    void display()
    {
        double d = Math.sqrt((x*x)+(y*y));
        System.out.println("Distance:"+d);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter point:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        Point p = new Point(x,y);
        p.display();
    }
    
}
