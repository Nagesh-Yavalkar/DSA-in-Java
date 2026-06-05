public class minele {
    static int min(int arr[],int i,int min){
        if(arr.length==i){
            return min;

        }
        if(arr[i]<min){
            min =arr[i];
            return min(arr,i+1,min);
        }
        return min(arr,i+1,min);

    }
public static void main(String[] args) {
    int arr[] = new int[]{1,2,3,4,5,6,7,8,9};
    int min = Integer.MAX_VALUE;
    int result = min(arr,0,min);
    System.out.println(result);
}

    
}
