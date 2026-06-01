import java.util.Scanner;

public class factors {


    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number :");
        int n = sc.nextInt();
        int count = 0;
        
        int i = 1;
        while(i<=n){
            if(n%i==0){
                count++;
                
            }i++;
        }
        System.out.println("total number of factor is "+count);
        sc.close();
    }
}
