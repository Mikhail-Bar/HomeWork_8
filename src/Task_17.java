public class Task_17 {
    static int rows = 5;

    public static void main(String[] args) {

        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }
            for (int k = i; k <= rows; k++)
            {
                System.out.print(k);
            }
            System.out.println();
        }
        for (int i = rows; i >= 1; i--)
        {
            for (int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }
            for (int k = i; k <= rows; k++)
            {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
