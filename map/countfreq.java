import java.util.* ;

public class countfreq 
{
    public static void main(String[] args) 
    {
        // int[] arr = new int[]{5,6,8,9,7,9,5,6,4,6,2,48,8,2,1,21,6,4,4};
        // Map<Integer, Integer> hm = new HashMap<Integer,Integer>();
        // for(int i : arr)
        // {
        //     hm.put(i, hm.getOrDefault(i, 0) + 1);
        // }
        // System.out.println(hm);
        Set<Integer> l = new HashSet<>();
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(2);
        l.remove(2);
        System.out.println(l);
    }    
}