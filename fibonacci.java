
class fibonacci
{
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int c = a+b;
        while(a<=15)
        {
            System.out.print(a+",");
            a=b;
            b=c;
            c=a+b;

        }
    }
}