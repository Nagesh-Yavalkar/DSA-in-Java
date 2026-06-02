class revstr{
    static boolean rev(String str,int l,int r){
        if(l>=r){
            return false;
        }
        if(str.charAt(l)==str.charAt(r)){
            return true;
        }
        return rev(str,l+1,r-1);
    }
    public static void main(String[] args) {
        String s = "mada";
        if(rev(s,0,s.length()-1)){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}