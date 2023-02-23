import java.util.Scanner;

public class bresenhams_circle_drawing 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter r :");
        int r = sc.nextInt() ; // Input Radius
        sc.close();
        
        int di = 3 - (2*r) ;
        int x = 0 ;
        int y = r ;
        
        int x_next = 0 ;
        int y_next = 0 ;
        
        System.out.println("   Di | x_i | y_i | x_next | y_next |");

        while(x <= y)
        {
            System.out.println("   "+di+"      "+x+"     "+y+"    "+x_next+"    "+y_next+"   " );
            if( di < 0 )
            {
                x_next = x + 1 ;
                y_next = y ;
                di = di + ( 4 * x ) + 6 ; 
            }
            else                 // if d >= 0
            {
                x_next = x + 1 ;
                y_next = y - 1 ;
                di = di + (4 * (x - y)) + 10 ; 
            }
            x = x_next ;
            y = y_next ;
        }
    }
}
