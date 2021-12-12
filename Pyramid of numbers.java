public class numbers
{
    public static void main(String args[])
    {
        int i, j, num;
        for(i=0; i<10; i++)
        {
            num=1;
            for(j=0; j<=i; j++)
            {
                System.out.print(num+ " ");
                num++;
            }
            System.out.println();
        }
    }
}
