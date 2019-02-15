import java.util.Scanner;

public class PerfectNumber {
    private static boolean isPerfect(int n) {
        int sum = 0;
        boolean tmp = false;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n) {
            tmp = true;
        }
        return tmp;
    }

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isPerfect(n)) {
            System.out.println("This is perfect number");
        } else {
            System.out.println("This is not perfect number");
        }
    }
}
