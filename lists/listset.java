import java.util.* ;
public class listset 
{
    public static void main(String[] args) 
    {
        List<Integer> li = new ArrayList<Integer>();
        Set<Integer> set = new HashSet<>();
        Map<Integer,Integer> map = new HashMap<>();

        li.add(3);
        map.put(1, 1);
        map.put(3, 1);

        for(int i = 0 ; i < 7 ; i++ )
        {
            li.add(i);
            map.put(i, map.getOrDefault(i,0)+1);
        }
        for(int i : li)
        {
            if(set.contains(i))
            {
                continue ;
            }
            else
            {
                set.add(i);                
            }
        }
        System.out.println(li+"   "+set+"  "+map);
    }
}
