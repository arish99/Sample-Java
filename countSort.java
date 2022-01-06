public class countSort {
    public static void main(String[] args) {
        int[] a = {4,1,3,6,9,4,2,4,1};
        int max = a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max = a[i];
            }
        }
        int[] b = new int[max+1];
        int k=0;
        for(int i=0;i<a.length;i++)
        {
            b[a[i]]++;
        }
        for(int i=0;i<b.length;i++)
        {
            int c = b[i];
            while(c>0)
            {
                a[k++]=i;
                c--;
            }
        }
        for(int i=0;i<k;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
