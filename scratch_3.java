import java.util.Scanner;

class scratch_3 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int total = num * (num-1) / 2;
        System.out.print(total);
    }
}