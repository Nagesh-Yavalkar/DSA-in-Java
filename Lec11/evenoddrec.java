public class evenoddrec {

    static int[] count(int arr[], int even, int odd, int i) {
        // Base case
        if (i == arr.length) {
            return new int[]{even, odd};
        }

        if (arr[i] % 2 == 0) {
            even++;
        } else {
            odd++;
        }

        return count(arr, even, odd, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};

        int result[] = count(arr, 0, 0, 0);

        System.out.println("Even: " + result[0]);
        System.out.println("Odd: " + result[1]);
    }
}