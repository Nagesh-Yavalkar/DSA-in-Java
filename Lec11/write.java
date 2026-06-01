public class write {

     static int sumn(int n){
        if(n==0)
            return 0;
        return n + sumn(--n);

     }
     public static void main(String[] args) {
        System.out.println(sumn(5));
     }
}