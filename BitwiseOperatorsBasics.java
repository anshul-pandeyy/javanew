public class BitwiseOperatorsBasics {
    // public static void main(String[] args) {
    //     System.out.println(5 & 6);
    //     System.out.println(5 | 6);
    //     System.out.println(5 ^ 6); //XOR - same bits gives 0 while different bits gives 1
    //     System.out.println(~5); 
    //     System.out.println(~0); 
    //     System.out.println(5<<2);  // a << b = a * 2^b
    //     System.out.println(5>>2);  // a >> b = a / 2^b
    // }

    // check if number is odd or even
    // public static void oddOrEven(int n){
    //     int bitmask = 1;
    //     if((n & bitmask) == 0){
    //         System.out.println("even number");
    //     }
    //     else{
    //         System.out.println("odd number");
    //     }
    // }
    // public static void main(String[] args) {
    //     oddOrEven(17);
    //     oddOrEven(54);
    // }

    // Get ith bit
    // public static int getIthBit(int n, int i){
    //     int bitmask = 1<<i;
    //     if((n & bitmask) == 0){
    //         return 0;
    //     }
    //     else{
    //         return 1;
    //     }
    // }
    // public static void main(String[] args) {
    //     System.out.println(getIthBit(8, 2));
    // }

    // Set ith bit    // set means converting that specific positioned bit to one
    // public static int setIthBit(int n, int i){
    //     int bitmask = 1<<i;
    //     return n | bitmask;
    // }
    // public static void main(String[] args) {
    //     System.out.println(setIthBit(10, 2));
    // }

    // Clear the ith bit
    // public static int clearIthBit(int n, int i){
    //     int bitmask = ~(1<<i);
    //     return n & bitmask;
    // }
    // public static void main(String[] args) {
    //     System.out.println(clearIthBit(10, 1));
    // }

    // update ith bit
    // public static int updateIthBit(int n, int i, int newBit){
    //     if(newBit == 0){
    //         return clearIthBit(n,i);
    //     }
    //     else{
    //         return setIthBit(n,i);
    //     }
    // }
    // public static void main(String[] args) {
    //     System.out.println(updateIthBit(10, 0, 1));
    // }

    // Clear last i bits. for example n=1111 and i=2 that results in new n = 1100.
    // public static int clearIbits(int n, int i){
    //     int bitmask = (~0)<<i;
    //     return n & bitmask;
    // }
    // public static void main(String[] args) {
    //     System.out.println(clearIbits(11, 2));
    // }

    // Clear range of bits
    // public static int clearRangeOfBits(int n, int i, int j){
    //     int a = ((~0)<<(j+1));
    //     int b = (1<<i)-1;
    //     int bitmask = a | b;
    //     return n & bitmask;
    // }
    // public static void main(String[] args) {
    //     System.out.println(clearRangeOfBits(10, 2, 4));
    // }

    // Check if a number is power of two or not //D_on_gfg.
    // public static boolean isPowerOfTwo(int n){
    //     if(n == 0){
    //         return false;
    //     }
    //     else{
    //         return (n & (n-1)) == 0;
    //     }
    // }
    // public static void main(String[] args) {
    //     System.out.println(isPowerOfTwo(111));
    // }

    // Count set bits in a number //D_on_gfg.
    // IMPORTANT NOTE : Any number in decimal, N = (logN + 1) bits (here, base is 2)
    //  public static int countSetBits(int n){
    //     int count = 0;
    //     while(n>0){
    //         if((n &1) != 0){ //checking our LSB
    //             count++;
    //         }
    //         n = n>>1;
    //     }
    //     return count;
    //  }
    //  public static void main(String[] args) {
    //     System.out.println(countSetBits(7));
    //  }

    // Fast exponentiation
    // public static int fastExponentiation(int a, int n){
    //     int ans = 1;
    //     while(n>0){
    //         if((n & 1) != 0){ //checking our LSB
    //             ans = ans * a;
    //         }
    //         a = a * a;
    //         n = n>>1;
    //     }
    //     return ans;
    // }
    //  public static void main(String[] args) {
    //     System.out.println(fastExponentiation(2, 5));
    //  }
}
