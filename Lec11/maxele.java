public class maxele {
    static int max(int arr[],int i,int max){
        if(arr.length==i){
            return max;

        }
        if(arr[i]>max){
            max =arr[i];
            return max(arr,i+1,max);
        }
        return max(arr,i+1,max);
        

    }
public static void main(String[] args) {
    int arr[] = new int[]{1,2,3,4,5,6,7,8,9};
    int max = Integer.MIN_VALUE;
    int result = max(arr,0,max);
    System.out.println(result);
}
}
