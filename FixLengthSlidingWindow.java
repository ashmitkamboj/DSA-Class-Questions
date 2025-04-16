public class FixLengthSlidingWindow {

    public static int maxSum(int[] arr, int k) {
        if (arr.length < k) {
            System.out.println("Window size k is larger than array length.");
            return -1;
        }

        int maxSum = 0;
        int windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        maxSum = windowSum;

        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 2, 6, -1, 4, 1, 8, 2};
        int k = 3;

        int result = maxSum(array, k);
        System.out.println("Maximum sum of a subarray of size " + k + " is: " + result);
    }
}