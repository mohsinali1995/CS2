import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        int count = 0;
        int num;
        Scanner a = new Scanner(System.in);
        System.out.println("Enter an integer");
        num = a.nextInt();

        while(num != 0)
        {
            num /= 10;
            ++count;
        }

        System.out.println("The number of digits in your integer are " + count);
    }
}