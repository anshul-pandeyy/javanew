
public class DivideConquer {
    public static void printarr(int A[]) {
        for(int i=0; i<A.length; i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
    }

    public static void mergeSort(int A[], int si, int ei){
        if(si >= ei){
            return;
        }
        int mid = si + (ei-si)/2;
        mergeSort(A, si, mid);
        mergeSort(A, mid+1, ei);
        merge(A, si, mid, ei);
    }

    // merge method to mearge the sorted parts
    public static void merge(int A[], int si, int ei, int mid){
        int temp[] = new int[ei-si+1];
        int i =si; //index for first sorted part
        int j =mid+1; //index for second sorted part
        int k = 0; //index for temp

        while(i<=mid && j<=ei){
            if(A[i]<A[j]){
                temp[k] = A[i];
                i++;
            }
            else{
                temp[k] = A[j];
                j++;
            }
            k++;
        }

        // for leftover elements of 1st sorted art
        while(i<=mid){
            temp[k++] = A[i++];
        }
        // for leftover elements of 2nd sorted art
        while(j<=ei){
            temp[k++] = A[j++];
        }

        // copy temp to original array
        for(k=0, i=si; k<temp.length; k++, i++){
            A[i] = temp[k];
        }

    }

    public static void main(String[] args) {
        int A[] = {4, 1, 3, 9, 7};
        mergeSort(A, 0, A.length-1);
        printarr(A);
    }
}