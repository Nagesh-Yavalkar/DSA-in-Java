public class squareodddigit {
    public static void main(String[] args) {
        int n = 113;
        
        int sum = 0;
        while(n>0){
            int k = n%10;
            if(k%2==1){
                sum = sum + k*k;
                
            }
            n/=10;
          


        }
        System.out.println("sum of odd digit square is : "+sum);
    }
}
