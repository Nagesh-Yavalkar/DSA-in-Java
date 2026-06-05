public class numrec {
    static void num(int i){
        if(i>10){
            return;
        }
        System.out.println(i);
        num(i+1);

    }
    public static void main(String[] args) {
      
        num(1);
        

    }
}