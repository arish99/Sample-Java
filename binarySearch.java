public class binarySearch{
    public static void main(String[] args)
    {
        int[] a ={1,2,3,4,5,6};
        int x = 6;
        System.out.print("Found at:"+search(a,x,0,a.length-1));
    }
    static int search(int[] a,int x,int l,int h)
    {
        if(l<=h)
        {
            int mid = (l+h)/2;
            if(x==a[mid])
            {
                return mid;
            }
            else if(x<a[mid])
            {
                return search(a, x, l, mid-1);
            }
            else
            {
                return search(a, x, mid+1, h);
            }


        }
        return -1;
    }
}