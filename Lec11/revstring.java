import java.util.Scanner;

public class revstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String ");
        String s = sc.nextLine();
        String str = new String(s);
        StringBuffer sb = new StringBuffer(str);
        sb = sb.reverse();
        String rev = sb.toString();
        System.out.println(rev);
        if(str.equals(rev)){
            System.out.println(str+"  is palindrome string ");
        }
        else{
            System.out.println("not a palindrome string");
        }
        sc.close();
    }
}
