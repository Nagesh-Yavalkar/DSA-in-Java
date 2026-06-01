/*public class sumofeven {
    public static void main(String[] args) {
        int n = 12348;
        
        int sum = 0;
        while (n>0) {
            int k = n%10;
            if(k%2==0){
                sum = sum +k;

            }
            n/=10;
            
        }
        System.out.println(sum);
    }
    
} */
public class sumofeven{
    
    static int sum(int n){
        
        if(n==0)
            return 0;
        
           int k =(n%10);
        if(k%2==0)
            return k+sum(n/10);
        return sum(n/10);
            

        }
    public static void main(String[] args) {
        int n = 12348;
        int result = sum(n);
        System.out.println("sum of even num is " +result);
    }
    }
