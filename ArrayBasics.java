import java.util.*;

// public class ArrayBasics {
//     public static void main(String args[]){
    
//         int marks[] = new int[50]; // size 50
//         int numbers[] = {1,2,3}; // size 3
//         String fruits[] = {"apple", "mango", "banana"}; // size 3
//     }
// }

// public class ArrayBasics {
//     public static void main(String args[]){
//         int marks[] = new int[50]; // size 50

//         Scanner sc = new Scanner(System.in);
//         //Input 
//         marks[0] = sc.nextInt();
//         marks[1] = sc.nextInt();
//         marks[2] = sc.nextInt();
//         //Output
//         System.out.println("Marks of mathematics: " + marks[0]);
//         System.out.println("Marks of physics: " + marks[1]);
//         System.out.println("Marks of chemistry: " + marks[2]);

//         //Updation
//         marks[1] = marks[1] + 1;
//         System.out.println("Updated Marks of physics: " + marks[1]);

//         //Lenght of an array
//         System.out.println("Lenght of an array marks[] is " + marks.length);
//     }
// }


//Topic: Array as Function Argument (Passing arrays as argument(pass by reference) )
// public class ArrayBasics {

//     public static void update(int marks[], int nonChangeable){
//         nonChangeable = 10;
//         for(int i=0; i<marks.length; i++){
//             marks[i] = marks[i] + 2;
//         }
//     }
//     public static void main(String args[]) {

//         int marks[] = {95,96,97};
//         int nonChangeable = 5;
//         update(marks, nonChangeable);

//         System.out.println(nonChangeable);
//         for(int i=0; i<marks.length; i++){
//             System.out.println(marks[i] + " ");
//         }
//         System.out.println();
//     }
// }

// // Linear search , Time Complexity of linear search is O(n)
// public class ArrayBasics {
//     public static int linearSearch(int numbers[], int key){
//         for(int i=0; i<numbers.length; i++){
//             if(numbers[i]==key){
//                 return i;
//             }
//         }
//         return -1;
//     }
//         public static void main(String args[]){
//         int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
//         int key = 14;

//         int index = linearSearch(numbers, key);
//         if(index == -1){
//             System.out.println("Index of key not found");
//         }
//         else{
//             System.out.println("Key found at Index : " + index);
//         }
//     }
// }

// // largest & smallest number in an array
// public class ArrayBasics {
//     public static int getLargestAndSmallest(int numbers[], int largest, int smallest) {
//         for(int i=0; i<numbers.length; i++){
//             if(largest<numbers[i]){
//                 largest = numbers[i];
//             }
//             if(smallest>numbers[i]){
//                 smallest = numbers[i];
//             }
//         }
//         System.out.println("Smallest number is " + smallest);
//         return largest;
//     }
//     public static void main(String args[]){
//         int numbers[] = {2, 4, 12, 8, 10, 6, 16, 14};
//         int largest = Integer.MIN_VALUE;
//         int smallest = Integer.MAX_VALUE;

//         System.out.println("Largest number is " + getLargestAndSmallest(numbers, largest, smallest));
//     }
// }

// // Binary search
// public class ArrayBasics {
//     public static int binarySearch(int numbers[], int key){
//         int start = 0, end = numbers.length-1;
//         while (start <= end) {
//             int mid = (start + end)/2;

//             // comparision
//             if(numbers[mid]<key){
//                 start = mid + 1;
//             }
//             else if (numbers[mid]>key) {
//                 end = mid - 1;
//             }
//             else{
//                 return mid;
//             }
//         }
//         return -1;
//     }
//     public static void main(String args[]){
//         int numbers[] = {2, 4, 6, 8, 10, 12, 14};
//         int key = 10;

//         System.out.println("Key found at index " + binarySearch(numbers, key));
//     }
// }

// // Reverse of an array
// public class ArrayBasics {
//     public static void reverse(int numbers[]){
//         int first = 0, last = numbers.length - 1;
//         while (first<last) {
//             int temp = numbers[first];
//             numbers[first] = numbers[last];
//             numbers[last] = temp;

//             first++ ;
//             last-- ;
//         }
        
//     }
//     public static void main(String args[]){
//         int numbers[] = {2, 4, 6, 8, 10, 12, 14};
        
//         reverse(numbers);
//         for(int i=0; i<numbers.length; i++){
//             System.out.print(numbers[i] + " ");
//         }
//         System.out.println();
//     }
// }

// // Pairs in an array
// public class ArrayBasics {
//     public static void pairsInArray(int numbers[]){
//         for(int i=0; i<numbers.length; i++){
//             int current = numbers[i];
//             for(int j=i+1; j<numbers.length; j++){
//                 System.out.print("(" + current + "," + numbers[j] + ") ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         int numbers[] = {2,4,6,8,10};

//         pairsInArray(numbers);

//     }
// }

// // Subarrays
// public class ArrayBasics {
//     public static void subArrays(int numbers[]){
//         int totalSubarrays = 0;
//         for(int i=0; i<numbers.length; i++){
//             int start = i;
//             for(int j=i; j<numbers.length; j++){
//                 int end = j;
//                 for(int k=start; k<=end; k++){
//                     System.out.print(numbers[k] + " ");
//                 }
//                 totalSubarrays++;
//                 System.out.println();
//             }
//             System.out.println();
//         }
//         System.out.println("total subarrays are " + totalSubarrays);
//     }
//     public static void main(String args[]){
//         int numbers[] = {2,4,6,8,10};

//         subArrays(numbers);

//     }
// }

// Max subarray sum - Brute force and it's TC is O(n^3) it's a bad Time Complexity
// public class ArrayBasics {
    // public static void maxSubArraySum(int numbers[]){
    //     int currSum = 0;
    //     int maxSum = Integer.MIN_VALUE;

    //     for(int i=0; i<numbers.length; i++){
    //         int start = i;
    //         for(int j=i; j<numbers.length; j++){
    //             int end = j;
    //             currSum = 0;
    //             for(int k=start; k<=end; k++){
    //                 currSum = currSum + numbers[k];
    //             }
    //             System.out.println(currSum);
    //             if(maxSum < currSum){
    //                 maxSum = currSum;
    //             }
    //         }
    //     }
    //     System.out.println("Max sum is " + maxSum);
    // }
    // public static void main(String args[]){
    //     int numbers[] = {-1, -2, -3};

    //     maxSubArraySum(numbers);

    // }
// }

// Max subarray sum - prefix sum and it's TC is O(n^2), comparative to brute force it is quite optimized code
// public class ArrayBasics {
//     public static void maxSubArraySum(int numbers[]){
//         int currSum = 0;
//         int maxSum = Integer.MIN_VALUE;

//         int prefix[] = new int[numbers.length];
//         prefix[0] = numbers[0];
//         for(int i = 1; i<numbers.length; i++){
//             prefix[i] = prefix[i-1] + numbers[i];
//         }

//         for(int i=0; i<numbers.length; i++){
//             int start = i;
//             for(int j=i; j<numbers.length; j++){
//                 int end = j;
//                 currSum = 0;
//                 currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
//                 if(maxSum < currSum){
//                     maxSum = currSum;
//                 }
//             }
//         }
//         System.out.println("Max sum is " + maxSum);
//     }
//     public static void main(String args[]){
//         int numbers[] = {2,4,6,8,10};

//         maxSubArraySum(numbers);

//     }
// }

// Max subarray sum - kadanes algorithm and it's TC is O(n), most optimized code
// public class ArrayBasics {
//     public static void maxSubArraySum(int numbers[]){
//         int maxSum = Integer.MIN_VALUE;
//         int currSum = 0;

//         for(int i=0; i<numbers.length; i++){
//             currSum = currSum + numbers[i];
//             if(currSum < 0){
//                 currSum = 0;
//             }
//             maxSum = Math.max(currSum, maxSum);
//         }
//         System.out.println("Our maximum subarray sum is " + maxSum);
//     }
//     public static void main(String args[]){
//         // int numbers[] = {2,4,6,8,10};
//         int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
 
//         maxSubArraySum(numbers);

//     }
// }


//Trapping Rainwater 
// public class ArrayBasics {
//     public static int trappingRainWater(int height[]){
//         int n = height.length;
//         // Calculate left maximum boundary - array(auxillary array)
//         int leftMaxBoundary[] = new int[n];
//         leftMaxBoundary[0] = height[0];
//         for(int i=1; i<n; i++){
//             leftMaxBoundary[i] = Math.max(height[i], leftMaxBoundary[i-1]);
//         }

//         // Calculate right maximum boundary - array(auxillary array)
//         int rightMaxBoundary[] = new int[n];
//         rightMaxBoundary[n-1] = height[n-1];
//         for(int i=n-2; i>=0; i--){
//             rightMaxBoundary[i] = Math.max(height[i], rightMaxBoundary[i+1]);
//         }

//         int trappedWater = 0;
//         // loop
//         for(int i=0; i<n; i++){
//             // water level = min(leftMaxBoundary, rightMaxBoundary)
//             int waterLevel = Math.min(leftMaxBoundary[i], rightMaxBoundary[i]);
//             trappedWater = trappedWater + (waterLevel - height[i]);
//         }
//         return trappedWater;
        
//     }
//     public static void main(String args[]){
//         int height[] = {4, 0, 2, 6, 3, 2, 5}; 

//         System.out.println("Total trapped water is " + trappingRainWater(height));
//     }
// }

// Best time to buy and sell stocks
// public class ArrayBasics {
//     public static int buyAndSellStocks(int prices[]){
//         int buyPrice = Integer.MAX_VALUE;
//         int maxProfit = 0;

//         for(int i=0; i<prices.length; i++){
//             if(buyPrice < prices[i]){
//                 int profit = prices[i] - buyPrice; //today's profit
//                 maxProfit = Math.max(maxProfit, profit);
//             }
//             else{
//                 buyPrice = prices[i];
//             }
//         }
//         return maxProfit;
//     }
//     public static void main(String args[]){
//         int prices[] = {7, 1, 5, 3, 6, 4};

//         System.out.println(buyAndSellStocks(prices));
//     }
// }

