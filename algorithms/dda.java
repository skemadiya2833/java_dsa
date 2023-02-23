import java.util.*;
public class dda
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x1 : ");  // Taking Input
        Double x1 = sc.nextDouble();
        System.out.println("Enter y1: ");
        Double y1 = sc.nextDouble();
        System.out.println("Enter x2 : ");
        Double x2 = sc.nextDouble();
        System.out.println("Enter y2 : ");
        Double y2 = sc.nextDouble();

        sc.close();

        double dx = x2 - x1 ;
        double dy = y2 - y1 ;

        double m = dy / dx ;    // Slope of Line

        double x_next = 0 ; 
        double y_next = 0 ; 
        
        System.out.println("All the Line points by DDA algorithm are :");
        System.out.println("x_i    |   y_i    |  x_next  |  y_next  |");
        System.out.println("-------|----------|----------|----------|");
        
        while( x1 < x2 || y1 < y2)   // Till x2 or y2 is reached
        {
            if(dx >= dy)
            {
                dx = 1 ;
                x_next = x1 + dx ;

                dy = m * dx ;
                y_next = y1 + dy ;
            }
            else if(dx < dy )
            {
                dy = 1 ;
                y_next = y1 + dy ;
                
                dx = dy / m ; 
                x_next = x1 + dx ;
            }
            
            System.out.println(String.format("%.2f", x1)+"   |   "+String.format("%.2f", y1)+"   |   "+String.format("%.2f", x_next)+"   |   "+String.format("%.2f",y_next)+"   |");
            x1 = x_next ;
            y1 = y_next ;
        }
        System.out.println("----------------------------------------");
    }
}