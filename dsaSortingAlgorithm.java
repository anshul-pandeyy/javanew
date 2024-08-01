public class dsaSortingAlgorithm {

    public static void sortProb(int arr[], int n){
        
        // Bubble sort
        // for(int i=0; i<n-1; i++){
        //     for(int j=0; j<n-1-i; j++){
        //         if(arr[j]>arr[j+1]){
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1]= temp;
        //         }
        //     }
        // }

        // Selection sort
        // for(int i=0; i<n; i++){
        //     int minPos = i;
        //     for(int j=i+1; j<n; j++){
        //         if(arr[minPos]>arr[j]){
        //             minPos = j;
        //         }
        //     }
        //     int temp = arr[i];
        //     arr[i] = arr[minPos];
        //     arr[minPos] = temp;
        // }

    }
    public static void myArr(int arr[], int n) {
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        int n = arr.length;

        sortProb(arr, n);
        myArr(arr, n);
    }
}
