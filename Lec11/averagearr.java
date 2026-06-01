public class averagearr {
    
    static int average(int arr[],int i,int sum){
        if(arr.length==i){
            return sum;
        }
        sum = sum +arr[i];
        return average(arr,i+1,sum);
        


    }
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5,6,7,8};
        int result = average(arr,0,0);
        System.out.println("average of array element is "+result);
    }
}
