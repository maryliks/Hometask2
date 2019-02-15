import java.util.Scanner;

public class FriendlyNumbers {
    private static int sumOfDividers(int n) {
        int sum = 1;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                sum += i;
                if (n / i != i) {
                    sum += n / i;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter start: ");
        int start = sc.nextInt();
        System.out.println("enter end: ");
        int end = sc.nextInt();
        if (start > end || start <= 0) throw new IllegalArgumentException("error in start or end ");
        for (int n1 = start; n1 <= end; n1++) {
            for (int n2 = start; n2 <= end; n2++) {
                if ((n1 == sumOfDividers(n2)) && (n2 == sumOfDividers(n1)) && n1 != n2) {
                    System.out.println(n1 + "-" + n2);
                }
            }
        }
    }
}
