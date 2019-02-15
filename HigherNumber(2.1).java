import java.util.Scanner;

public class HigherNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number <= 0) throw new ExceptionInInitializerError("not natural number");
        int higherNumber = 0;
        while (number != 0) {
            int n = (number % 10);
            number /= 10;
            if (higherNumber < n) {
                higherNumber = n;
            }
        }
        System.out.println(higherNumber);
    }
}
