import javax.print.DocFlavor.STRING;

public class RecursionBasics {
    // // print numbers from n to 1 (decreasing order)
    // public static void printDec(int n){
    //     if(n==1){
    //         System.out.print(n);
    //         return;
    //     }
    //     System.out.print(n+" ");
    //     printDec(n-1);
    // }
    //  // print numbers from 1 to n (increasing order)
    // public static void printInc(int n){
    //     if(n==1){
    //         System.out.print(n+" ");
    //         return;
    //     }
    //     printInc(n-1);
    //     System.out.print(n+" ");
    // }
    // public static void main(String[] args) {
    //     int n = 10;
    //     // printDec(n);
    //     printInc(n);
    // }

    // print factorial of a number n. Its TC is O(n)
    // public static int printFact(int n){
    //     if(n==0){
    //         return 1;
    //     }
    //     int Fnm1 = printFact(n-1);
    //     int fn = n * printFact(n-1);
    //     return fn;
    // }
    // public static void main(String[] args) {
    //     int n = 5;
    //     System.out.println(printFact(n));
    // }

    // print sum of first n natural number
    // public static int printSum(int n){
    //     if(n==1){
    //         return 1;
    //     }
    //     int Snm1 = printSum(n-1);
    //     int sum = n + printSum(n-1);
    //     return sum;
    // }
    // public static void main(String[] args) {
    //     int n = 10;
    //     System.out.println(printSum(n));
    // }

    // print nth fibonacci number
    // public static int printFib(int n){
    //     if(n==0 || n==1){
    //         return n;
    //     }
    //     int Fnm1 = printFib(n-1);
    //     int Fnm2 = printFib(n-2);
    //     int Fn = Fnm1 + Fnm2;
    //     return Fn;
    // }
    // public static void main(String[] args) {
    //     int n = 7;
    //     System.out.println(printFib(n));
    // }

    // check if array is sorted or not
    // public static boolean isSorted(int arr[], int i){
    //     if(i == arr.length-1){
    //         return true;
    //     }
    //     if(arr[i] > arr[i+1]){
    //         return false;
    //     }

    //     return isSorted(arr, i+1);
    // }
    // public static void main(String[] args) {
    //     int arr[] = {1,2,3,4,5};

    //     System.out.println(isSorted(arr, 0));
    // }

    // WAF to find the first occurrence of an element in an array
    // public static int firstOccurrence(int arr[], int n, int k, int i){
    //     if(i == n-1){
    //         return -1;
    //     }
    //     if(arr[i]==k){
    //         return i;
    //     }
    //     return firstOccurrence(arr, n, k, i+1);
    // }
    // public static void main(String[] args) {
    //     int arr[] = {8,3,6,9,5,10,2,5,3};
    //     int n = arr.length;
    //     int k = 10;

    //     System.out.println(firstOccurrence(arr, n, k, 0));
    // }

    // WAF to find the last occurrence of an element in an array
    // public static int lastOccurrence(int arr[], int k, int i){
    //     if(i==arr.length){
    //         return -1;
    //     }
    //     int isFound = lastOccurrence(arr, k, i+1);
    //     if(isFound==-1 && arr[i]==k){
    //         return i;
    //     }

    //     return isFound;
    // }
    // public static void main(String[] args) {
    //     int arr[] = {5,5,5,5};
    //     int k = 5;

    //     System.out.println(lastOccurrence(arr, k, 0));
    // }

    // print x^n
    // public static int printPower(int x, int n){
    //     if(n==1){
    //         return x;
    //     }
    //     // int Xnm1 = printPower(x, n-1);
    //     // int Xn = x*Xnm1;
    //     // return Xn;

    //     return x*printPower(x, n-1);
    // }
    // public static void main(String[] args) {
    //     System.out.println(printPower(2, 10));
    // }

    // optimized code
    // public static int optimizedPower(int x, int n){
    //     if(n==0){
    //         return 1;
    //     }
    //     // int halfPowerSq = optimizedPower(x, n/2) * optimizedPower(x, n/2);
    //     int halfPower = optimizedPower(x, n/2);
    //     int halfPowerSq = halfPower * halfPower;

    //     // n is odd
    //     if(n%2 != 0){
    //         halfPowerSq = x * halfPowerSq;
    //     }
    //      return halfPowerSq;
    // }
    // public static void main(String[] args) {
    //     System.out.println(optimizedPower(2, 5));
    // }

    // Tiling problem
    // public static int tilingProblem(int n){
    //     if(n==0 || n==1){
    //         return 1;
    //     }
    //     // vertical choice
    //     int fnm1 = tilingProblem(n-1);

    //     // horizontal choice
    //     int fnm2 = tilingProblem(n-2);

    //     int totalWays = fnm1 + fnm2;
    //     return totalWays;
    // }
    // public static void main(String[] args) {
    //     System.out.println(tilingProblem(4));
    // }

    // remove duplicates in a string
    // public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]){
    //     if(idx == str.length()){
    //         System.out.println(newStr);
    //         return;
    //     }

    //     char currChar = str.charAt(idx);
    //     if(map[currChar-'a'] == true){
    //         // duplicate
    //         removeDuplicates(str, idx+1, newStr, map);
    //     }
    //     else{
    //         map[currChar-'a'] = true;
    //         removeDuplicates(str, idx+1, newStr.append(currChar), map);
    //     }
    // }
    // public static void main(String[] args) {
    //     String str = "apnacollege";
    //     removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    // }

    // Given n friends, each one remain single or can be paired up with some other friend.Each friend can be paired up only once. find the total no. of ways in which friends can be remain single or can be paired up.
    // public static int friendsPairing(int n){
    //     if(n==1 || n==2){
    //         return 1;
    //     }
    //     // // choice single
    //     // int fnm1 = friendsPairing(n-1);

    //     // // choice paired
    //     // int fnm2 = friendsPairing(n-2);
    //     // int pairWays =(n-1)*fnm2;

    //     // // totalways 
    //     // int totalWays = fnm1 + pairWays;
    //     // return totalWays;

    //     return friendsPairing(n-1) + (n-1)*friendsPairing(n-2);
    // }
    // public static void main(String[] args) {
    //     int n = 4;
    //     System.out.println(friendsPairing(n));
    // }

    // Print all binary strings of size n without consecutive ones
    // public static void printBinStrings(int n, int lastPlace, String str){
    //     // base case
    //     if(n==0){
    //         System.out.println(str);
    //         return;
    //     }

    //     printBinStrings(n-1, 0, str+"0");
    //     if(lastPlace==0){
    //         printBinStrings(n-1, 1, str+"1");
    //     }
    // }
    // public static void main(String[] args) {
    //     printBinStrings(3, 0, "");
    // }
}

