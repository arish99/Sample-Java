import java.util.*;
class menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        int ch;
        System.out.println("Enter 2 numbers:");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("\tMenu");
        System.out.println("1.ADD");
        System.out.println("2.SUBTRACT");
        System.out.println("3.MULTIPLY");
        System.out.println("4.DIVIDE");
        ch = sc.nextInt();
       switch(ch)
       {
           case 1:
           System.out.println("SUM="+(a+b));
           break;
           case 2:
           System.out.println("DIFFERENCE="+Math.abs(a-b));
           break;
           case 3:
           System.out.println("PRODUCT="+(a*b));
           break;
           case 4:
           System.out.println("DIVISION="+(a/b));
           break;
           default:
           System.out.println("Wrong Choice");
           break;
       }
}
    
}
