class revnum{
    static int rev(int n,int rev){
        if(n==0){
            return rev;

        }
        return rev(n/10,rev*10+(n%10));

    }
    public static void main(String[] args) {
        int n=121;
        int result = rev(n, 0);
        System.out.println(result);
    }
}