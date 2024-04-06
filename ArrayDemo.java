public class ArrayDemo {
    // Method to demonstrate loops and arrays
    public void demoLoopsAndArrays() {
        // Creating an array of integers
        int[] numbers = {10, 5, 8, 3, 12};

        // Creating an instance of ArrayOperations class
        ArrayOperations operations = new ArrayOperations();

        // Finding the sum of elements in the array
        int sum = operations.findSum(numbers);
        System.out.println("Sum of elements: " + sum);

        // Finding the maximum element in the array
        int max = operations.findMax(numbers);
        System.out.println("Maximum element: " + max);
        


          // Using if-else to check if the sum is greater than a specific value
        int guess = 38;


        if (sum > guess) {
            System.out.println("Sum is greater than " + guess);
        } else if (sum < guess){
            System.out.println("Sum is less than " + guess);
        }else {
            System.out.println("Sum is equal to " + guess);
        }



 
        // Using a for loop to print each element of the array
        // System.out.print("Array elements:");
        // for (int num : numbers) {
        //     System.out.print(" " + num);
        // }

        

     
        System.out.println(); // Print a newline after the loop
    }
}


