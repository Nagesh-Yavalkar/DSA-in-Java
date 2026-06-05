public class revnum {
    public static void main(String[] args) {
        int n = 1234;
        int rev =0;

        while(n>0){
            int k = n%10;
            rev = rev*10+k;
            n/=10;
        }
        System.out.println("the reverse number is "+rev);
    }
    
}
