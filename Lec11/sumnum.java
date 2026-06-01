public class sumnum {
    static int sum(int n){
        if(n>=5)
            return n;
        return n+sum(n+1); 
    }
    public static void main(String[] args) {
        int result = sum(0);
        System.out.println(result);
    }
}

class sumN{
    static int sumf(int num){
        if(num==0){
            return 0;
        }
        return num + sumf(--num);
    }
public static void main(String[] args) {
    System.out.println(sumf(5));
}
}