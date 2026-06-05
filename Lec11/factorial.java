import java.util.Scanner;

public class factorial {
    static int fac(int num){
        if(num==0)
            return 1;
        return num *fac(--num);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number :");
        int n = sc.nextInt();
        System.out.println("Factorial is "+fac(n));
        sc.close();
    }
    
}
