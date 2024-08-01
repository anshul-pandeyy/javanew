// Bubble sort - its TC is O(n^2)
// Large element come to the end of array by swapping with adjacent elements
// public class SortingBasics {

//     public static void bubbleSort(int arr[]){
//         for(int turn=0; turn<arr.length-1; turn++){
//             for(int j=0;j<arr.length-1-turn; j++){
//                 if(arr[j] > arr[j+1]){
//                     // swap
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }
//         }
//         System.out.println();
//     }

//     public static void printArr(int arr[]){
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+ " ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args){
//         int arr[] = {5, 4, 1, 3, 2};

//         bubbleSort(arr);
//         printArr(arr);
//     }
// }


// Selection sort - again its TC is O(n^2)
// Pick the smallest element(unsorted part) and put it at the beginning
// public class SortingBasics {

//     public static void selectionSort(int arr[]){
//         for(int i=0; i<arr.length-1; i++){
//             int minPos = i;
//             for(int j=i+1; j<arr.length; j++){
//                 if(arr[minPos] > arr[j]){
//                     minPos = j;
//                 }
//             }
//             // Swap
//             int temp = arr[minPos];
//             arr[minPos] = arr[i];
//             arr[i] = temp;
//         }
//     }
//     public static void printArr(int arr[]){
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+ " ");
//         }
//         System.out.println();
//     }

   
//     public static void main(String[] args){
//         int arr[] = {5, 4, 1, 3, 2};

//         selectionSort(arr);
//         printArr(arr);
//     }
// }

// Insertion sort - its TC is also O(n^2)
// Pick the smallest element(unsorted part) and place in right position in sorted part
// Think of a sorting in cards
// public class SortingBasics {

    // public static void insertionSort(int arr[]){
    //     for(int i=1; i<arr.length; i++){
    //         int curr = arr[i];
    //         int prev = i-1;
    //         // finding out the correct position to insert
    //         while(prev >= 0 && arr[prev] > curr){
    //             arr[prev+1] = arr[prev];
    //             prev--;
    //         }
    //         // insertion
    //         arr[prev+1] = curr;
    //     }
    // }
//     public static void printArr(int arr[]){
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+ " ");
//         }
//         System.out.println();
//     }

   
//     public static void main(String[] args){
//         int arr[] = {5, 4, 1, 3, 2};

//         insertionSort(arr);
//         printArr(arr);
//     }
// }



// Inbuit sort

// suppose we have array as --> int arr[] = {5, 4, 1, 3, 2};
// import java.util.Arrays;
// Arrays.sort(arr);  its TC is O(nlogn)
// or we can use Arrays.sort(arr, si, ei);

// to print sorted array in reversse order
// suppose we have array as --> Integer arr[] = {5, 4, 1, 3, 2}; 
// import java.util.Collections; 
// Arrays.sort(arr, Collections.reverseOrder());  its TC is O(nlogn) --> here we have written Integer instead of int because it is applicable on object only
// or we can use Arrays.sort(arr, si, ei, Collections.reverseOrder());

// Count sort
// Usually use for short range array and positive numbers
// public class SortingBasics{
//     public static void countingSort(int arr[]){
//         int largest = Integer.MIN_VALUE;
//         for(int i=0; i<arr.length; i++){
//             largest = Math.max(largest, arr[i]);
//         }

//         int count[] = new int[largest+1];    // count frequency
//         for(int i=0; i<arr.length; i++){
//             count[arr[i]]++;
//         }

//         // sorting
//         int j=0;
//         for(int i=0; i<count.length; i++){
//             while(count[i]>0){
//                 arr[j] = i;
//                 j++;
//                 count[i]--;
//             }
//         }
//     }

//     public static void printArr(int arr[]){
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+ " ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int arr[] = {1, 4, 1, 3, 2, 4, 3, 7};

//         countingSort(arr);
//         printArr(arr);
//     }
// }