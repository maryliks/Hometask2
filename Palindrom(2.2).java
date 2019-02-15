import java.util.Scanner;

public class Palindrom {

    public static boolean isPalindrom(int n) {
        boolean result = true;
        int tmp = n;
        int n2 = 0;
        while (tmp != 0) {
            n2 = n2 * 10 + tmp % 10;
            tmp /= 10;
        }
        if (n == n2) {
            System.out.print("This is palindrom!");
        } else {
            result = false;
            System.out.print("This isn't palindrom!");
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = in.nextInt();
        isPalindrom(n);
    }
}

