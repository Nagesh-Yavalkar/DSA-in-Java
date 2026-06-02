public class countnoofdigit {
    static int count(int n){
        if(n==0){
            return 0;
        }
        return 1+count(n/10);
    }
    public static void main(String[] args) {
        int n = 1234;
        System.out.println("the number count is "+count(n));
    }

}
