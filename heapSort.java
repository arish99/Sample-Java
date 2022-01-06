public class heapSort{
    public static void main(String[] args) {
        int[] a = {6,1,2,3,5,4};
        heapsort(a,a.length);
        for(int i : a)System.out.print(i+" ");
    }
    static void heapsort(int[] a,int n)
    {
        for(int i=n/2-1;i>=0;i--)
        {
            maxHeapify(a,i,n);
        }
        for(int i=n-1;i>0;i--)
        {
            int t = a[0];
            a[0] = a[i];
            a[i] = t;
            maxHeapify(a,0,i);
        }
    }
    static void maxHeapify(int[] a,int i,int n)
    {
        int largest = i;
        int l = 2*i+1;
        int r = 2*i+2;
        if(l<n && a[l]>a[largest])
        {
            largest = l;
        }
        if(r<n && a[r]>a[largest])
        {
            largest = r;
        }
        if(largest!=i)
        {
            swap(a,i,largest);
            maxHeapify(a,largest,n);
        }
    }
    static void swap(int[] a,int i,int j)
    {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}