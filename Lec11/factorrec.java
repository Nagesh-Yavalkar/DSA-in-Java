import java.util.Scanner;

public class factorrec {

    static int fact(int n, int count, int factorCount) {
        if (count > n)
            return factorCount;

        if (n % count == 0) {
            factorCount++;
        }

        return fact(n, count + 1, factorCount);
    }

    public static void main(String[] args) {
        int count = 1;
        int factorCount = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt();

        int result = fact(n, count, factorCount);
        System.out.println("Total number of factors is " + result);
        sc.close();
    }
}