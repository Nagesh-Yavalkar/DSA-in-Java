class palindrome{
    static int palin(int n, int rev){
        if(n==0){
            return rev;
        }
        return palin(n/10, rev*10+(n%10));

    }
    public static void main(String[] args) {
        int n = 121;
        
        int rev = palin(n, 0);
        if(rev==n){
            System.out.println("Number is palindrome ");
        }else{
            System.out.println("no is not palindrome ");
        }
    }

}
