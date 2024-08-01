import java.util.*;

public class myProblem {
    
//    public static int[] constructLowerArray(int arr[]){
//         int len = arr.length;
//         int[] res = new int[len];
//         res[len-1]=0;
//         for(int i=0;i<len-1;i++){
//             int count = 0;
//             int ele = arr[i];
//             for(int j=i+1;j<len;j++){
//                 if(ele>arr[j]) count++;
//             }
//             res[i]=count;
//         }
//         return res;
//    }
//    public static void main(String[] args) {
//     int arr[] = {12, 1, 2, 3, 0, 11, 4};

//     System.out.println(constructLowerArray(arr));
    
//    }


    // public static int missingNumber(int n, int arr[]) {
    //     int sum1 = 0;
    //     for(int i=1; i<=n; i++){
    //         sum1 = sum1 + i;
    //     }
    //     int sum2 = 0;
    //     for(int i=0; i<arr.length; i++){
    //         sum2 = sum2 + arr[i];
    //     }
    //     int ReqElement = sum1 - sum2;
    //     return ReqElement;
    // }
    
    // public static void main(String[] args){
    //     int arr[] = {1,2,4,5};
    //     int n = 5;
        
    //     System.out.println(missingNumber(n, arr));
    // }

    // public static int countSpecialNumbers(int N, int arr[]) {
    //     Arrays.sort(arr);
        
    //     int count = 0;
    //     int i;
    //     for(i=N-1; i>=0; i--){
    //         for(int j=i-1; j>=0; j--){
    //             if((arr[i]%arr[j]) == 0){
    //                 count++;
    //             }
    //         }
    //     }
    //     return arr[i];
    // }
    //  public static void printArr(int arr[], int N){
    //     for(int i=0; i<N; i++){
    //         System.out.print(arr[i]+" ");
    //     }
    //  }
    // public static void main(String[] args){
    //     int N = 3;
    //     int arr[] = {2,3,6};

    //     System.out.println(countSpecialNumbers(N, arr));
        
    // }

    // public static boolean checkKthBit(int n, int k){
    //     return ((n & (1<<k)) != 0 );
    // }
    // public static void main(String[] args){
    //      int n = 4; //1010
    //      int k = 0;

    //     System.out.println(checkKthBit(n,k));
        
    // }


}


