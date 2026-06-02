class evenodd{
    static int[] even(int arr[],int i,int odd,int even){
        if(i==arr.length){
            return new int[]{even,odd};
        }
        if(arr[i]%2==0){
            even++;
        }
        else{
            odd++;
        }
        return even(arr,i+1,odd,even);

    }
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5,6};
        int[] result = even(arr,0,0,0);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}