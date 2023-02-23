public class LinearSearch
{
    public int linearSearch(int[] arr, int key)
    {
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] == key)
                return i ;
        }
        return -1 ;
    }
    public static void main(String[] args)
    {
        int[] arr = new int[5];
        for (int i = 0 ; i < 5 ; i++) 
        {
            arr[i] = i + 1;
        }    
        int key = 2 ;
        LinearSearch l = new LinearSearch();
        System.out.println("Index is : "+l.linearSearch(arr, key));
    }
}