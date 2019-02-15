import java.util.Scanner;

public class DifferentNumbers {
    public static int checkNumber(String str, int i, int result) {
        if (str.contains(String.valueOf(i))) {
            result++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int result = 0;
        for (int i = 0; i < 10; i++) {
            result=checkNumber(str, i, result);
        }
        System.out.println(result);

    }
}
