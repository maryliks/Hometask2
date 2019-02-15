import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean tmp=true;
        if (n <= 0) throw new ExceptionInInitializerError("Not natural");
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                tmp=false;
            }
        }
        if (tmp){
            System.out.println("Primary");
        }else {
            System.out.println("Not primary");
        }
    }
}
