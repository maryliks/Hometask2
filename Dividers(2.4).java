import java.util.Scanner;

public class Dividers {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 2;
        while (i <= (int) Math.ceil(Math.sqrt(n))) {
            if (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            } else {
                i++;
            }
        }

        if (n > 1) {
            System.out.println(n);
        }
    }
}
