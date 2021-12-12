import java.util.Scanner;

public class Stars
{
    public static void main(String args[])
    {
        int i, s, r, j=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number of Rows : ");
        r = scan.nextInt();
        for(i=1; i<=r; i++)
        {
            for(s=1; s<=(r-i); s++)
            {
                System.out.print("  ");
            }
            while(j != (2*i-1))
            {
                System.out.print("* ");
                j++;
            }
           j = 0;
            System.out.println();
        }
    }
}
