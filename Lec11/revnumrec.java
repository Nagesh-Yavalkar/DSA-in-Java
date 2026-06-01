/*import java.util.Scanner;

public class revnumrec {
    static int revn(int n,int rev){
        if(n>0){
            
        int k = n%10;
        rev = rev *10+k;
        return revn(n/10,rev);
        }
        return rev;

        

    }
public static void main(String[] args) {
    Scanner sc = new Scanner((System.in));
    System.out.println("Enter your number ");
    int n = sc.nextInt();
    int rev =0;
    int result = revn(n,rev);
    System.out.println("reverse number is "+result);
    sc.close();
}
    
}*/

import java.util.Scanner;

public class revnumrec {
    static int revn(int n,int rev){
        if(n==0)
           return rev; 
        int k = n%10;
        rev = rev *10+k;
        return revn(n/10,rev);
        }
        

        

    
public static void main(String[] args) {
    Scanner sc = new Scanner((System.in));
    System.out.println("Enter your number ");
    int n = sc.nextInt();
    int rev =0;
    int result = revn(n,rev);
    System.out.println("reverse number is "+result);
    sc.close();
}
}
