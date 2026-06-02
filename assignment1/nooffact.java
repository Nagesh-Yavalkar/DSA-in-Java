class nooffact{
    static int fact(int i,int n,int count){
        if(i>n){
            return count;
        }
        if(n%i==0){
            count++;
        }
        return fact(i+1,n,count);
    }
    public static void main(String[] args) {
        int n = 3;
        int i =1;
        int result = fact(i,n,0);
        System.out.println(result);       
    }
}