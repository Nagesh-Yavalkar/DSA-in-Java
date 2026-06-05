public class reversearr {
    static void revarr(int arr[], int i) {
        if (arr.length / 2 == i) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[arr.length - i - 1];
        arr[arr.length - i - 1] = temp;
        revarr(arr, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        revarr(arr, 0);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
