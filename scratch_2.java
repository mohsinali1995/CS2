public class scratch_2
{
    public static void main(String[] args)
    {
        printPascalTriangle(8);
    }

    public static void printPascalTriangle(int num)
    {

        if(num == 0)
        {
            return;
        }

        int rows = num;

        int column = 2 * num + 1;
        int[][] arrPascal = new int[rows][column];

        arrPascal[0][num] = 1;


        for(int a = 1; a < rows; a++)
        {
            for(int b = 1; b < column - 1; b++)
            {
                arrPascal[a][b] = arrPascal[a - 1][b - 1] + arrPascal[a - 1][b + 1];
            }
        }

        for(int a = 0; a < rows; a++)
        {
            for(int b = 1; b < column-1; b++)
            {
                if(arrPascal[a][b] != 0)
                {
                    System.out.print(arrPascal[a][b]);
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        return;
    }
}