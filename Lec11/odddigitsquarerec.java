import java.util.Scanner;

public class odddigitsquarerec {
    static int squared(int n,int sum){
        if(n==0)
            return sum;
        int k = n%10;
        if(k%2==1)
            sum =sum+(k*k);
        
        
        return squared(n/10, sum);
    }
        
        
       
        

    
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    int sum = 0;
    int result = squared(n,sum);
    System.out.println(result);
    sc.close();
    
}   
}
