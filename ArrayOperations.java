public class ArrayOperations {
    // Method to find the sum of elements in an array
    public int findSum(int[] arr) {
        // arr =  {10, 5, 8, 3, 12}  => 12
        
        
        int sum = 0;

        
        // for loop
        for (int num : arr) {
            sum = sum + num;
        }
        return sum;
    }

    // Method to find the maximum element in an array
    public int findMax(int[] arr) {
        int max = arr[0];
        
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}


