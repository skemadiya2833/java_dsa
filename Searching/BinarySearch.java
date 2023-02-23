public class BinarySearch 
{
    public int binarySearch(int[] arr, int key, int start,int end)
    {
        int mid = ( start + end ) / 2 ;
        if(start == end)
            return -1 ;
        if(arr[mid] == key)
            return mid ;
        else if(arr[mid] > key)
           return binarySearch(arr, key, start, mid-1 );
        else
           return binarySearch(arr, key, mid+1, end );
    }
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        int key = 128 ;
        BinarySearch b = new BinarySearch();
        System.out.println("index = "+b.binarySearch(arr, key,0,arr.length) );
    }
}
