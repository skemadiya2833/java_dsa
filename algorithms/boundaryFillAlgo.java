import java.util.Arrays;

public class boundaryFillAlgo 
{
    private static int getPixel(int[][] screen, int x, int y)
    {
        if( x >= 0 && x < 5 && y >= 0 && y < 5)
            return screen[x][y] ;

        return -1 ;
    }
    private static void putPixel(int[][] screen, int x, int y, int fill_color)
    {
        if( x >= 0 && x < 5 && y >= 0 && y < 5)
            screen[x][y] = fill_color ;
    }
    private static void boundary_fill(int[][] screen, int x, int y, int fill_color, int boundary_color)
    {
        int pixel = getPixel(screen, x,y);
        if( pixel != boundary_color && pixel != fill_color )
        {
            putPixel(screen, x, y, fill_color);
            boundary_fill(screen, x+1, y, fill_color, boundary_color);
            boundary_fill(screen, x-1, y, fill_color, boundary_color);
            boundary_fill(screen, x, y+1, fill_color, boundary_color);
            boundary_fill(screen, x, y-1, fill_color, boundary_color);
        }
    }
    public static void main(String[] args) 
    {
        int[][] screen = new int[5][5];
        try {
            for(int i = 0 ; i < 5 ; i++)
            {
                screen[0][i] = 2 ;
                screen[i][0] = 2 ;
                screen[4][i] = 2 ; 
                screen[i][4] = 2 ; 
            }
            System.out.println("Before Coloring :  \n");
            for(int[] i : screen)
            {
                System.out.println(Arrays.toString(i));
            }
            boundary_fill(screen,2,2,1,2);
            System.out.println("\n After Coloring :  \n");
            for(int[] i : screen)
            {
                System.out.println(Arrays.toString(i));
            }
        }
        catch( Exception e)
        {
            System.out.println("Catched : "+e);
        }
    }
}
