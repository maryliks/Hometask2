import java.util.Scanner;

public class HeadsOrTails {
    public static void main(String[] args) {
        int head = 0;
        int tail = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of attempts:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int tmp = (int) (Math.random() * 2);
            if (tmp == 0) {
                head++;
            } else {
                tail++;
            }
        }
        System.out.println("Heads: " + head + ", tails: " + tail);
    }
}
