import java.util.Scanner;
public class midpoint_circle_drawing 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        int r = sc.nextInt();
        sc.close();  
        int x0 = 0 ;
        int y0 = r ;

        int p = 1 - r ;

        System.out.println("P0 = "+p);

        int count = 0 ;
        while( x0 < r || y0 > 0)
        {
            System.out.println(x0+"     "+y0);
            if( p < 0 )
            {
                x0 = x0 + 1 ;
                
                p = p + ( 2 * x0 ) + 1 ; 
            }
            else
            {
                x0 = x0 + 1 ;
                y0 = y0 - 1 ;
                
                p = p + ( 2 * x0 ) + 1 - ( 2 * y0 ) + 1 ; 
            }
            count++ ;
            System.out.println("P"+count+" = "+p);
        }
    }
}
