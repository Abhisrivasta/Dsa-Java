package day1;


public class Maximum {

    public static void maxArray(int[] arr) {
        int max = arr[0]; // assume first element is max

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum value is: " + max);
    }

    public static void main(String[] args) {
        int[] numbers = {10, 25, 7, 99, 3};

        maxArray(numbers); // calling method
    }
}