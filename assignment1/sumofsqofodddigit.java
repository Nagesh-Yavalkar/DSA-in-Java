class client{
    static int square(int n){
        if(n==0){
            return 0;
        }
        int k = n%10;
        if(k%2==1){
            return k*k+square(n/10);
        }
        return square(n/10);


    }
    public static void main(String[] args) {
        int n = 1235;
        int result = square(n);
        System.out.println(result);
    }
}