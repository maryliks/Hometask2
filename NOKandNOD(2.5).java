import java.util.Scanner;

public class NOKandNOD {

    public static int NOD(int n1, int n2) {
        while (n1 != n2) {
            if (n1 > n2) {
                n1 = n1 - n2;
            } else {
                n2 = n2 - n1;
            }
        }
        return n1;
    }

    public static int NOK(int n1, int n2) {
        return n1 * n2 / NOD(n1, n2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n1:");
        int n1 = sc.nextInt();
        System.out.println("Enter n2:");
        int n2 = sc.nextInt();
        System.out.println("NOD: " + NOD(n1, n2) + ", NOK: " + NOK(n1, n2));
    }
}
