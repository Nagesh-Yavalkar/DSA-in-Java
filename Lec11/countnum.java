public class countnum {
    static int count(int n){
        if(n==0)
            return 0;
        return 1+count(n/10);
}
public static void main(String[] args) {
    int n = 12234;
    int result = count(n);
    System.out.println("no of digit is "+result);
}
}
