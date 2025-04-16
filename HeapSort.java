public class HeapSort {
    static void heapify(int arr[], int n, int i) {
     int largest = i; // Root node
     int left = 2 * i + 1; // Left child index
     int right = 2 * i + 2; // Right child index

     // If left child is larger than root
     if (left < n && arr[left] > arr[largest])
         largest = left;

     // If right child is larger than largest so far
     if (right < n && arr[right] > arr[largest])
         largest = right;

     // If largest is not root, swap and continue heapifying
     if (largest != i) {
         int temp = arr[i];
         arr[i] = arr[largest];
         arr[largest] = temp;

         heapify(arr, n, largest);
     }
 }

 // Main function to sort an array using heap sort
 static void heapSort(int arr[]) {
     int n = arr.length;

     // Build max heap (rearrange array)
     for (int i = n / 2 - 1; i >= 0; i--) {
         heapify(arr, n, i);
     }

     // Extract elements from heap one by one
     for (int i = n - 1; i > 0; i--) {
         // Move the current root (largest) to end
         int temp = arr[0];
         arr[0] = arr[i];
         arr[i] = temp;
         printArray(arr);
         // Heapify the reduced heap
         heapify(arr, i, 0);
     }
 }

 // Utility function to print an array
 static void printArray(int arr[]) {
     for (int num : arr) {
         System.out.print(num + " ");
     }
     System.out.println();
 }

 // Driver code
 public static void main(String args[]) {
     int arr[] = {12, 11, 13, 5, 6, 7};
     System.out.println("Original array:");
     printArray(arr);

     heapSort(arr);

     System.out.println("Sorted array:");
     printArray(arr);
 }
} 
    
