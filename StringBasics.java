import java.util.*;
public class StringBasics {
    // public static void printLetters(String str) {
    //     for (int i=0; i<str.length(); i++){
    //         System.out.print(str.charAt(i) + " ");
    //     }
    //     System.out.println();
    // }

    // public static void main(String[] args) {
    //     // char arr[] = {'a', 'p', 'e'};
    //     // String str1 = "apes";
    //     // String str2 = new String("anshulpandey@1404");

    //     // // String are IMMUTABLE

    //     // Scanner sc = new Scanner(System.in);
    //     // // String name = sc.next();
    //     // // System.out.println(name);

    //     // String name = sc.nextLine();
    //     // System.out.println(name);

    //     // System.out.println(name.length()); // To get the length of a string

    //     // Concatenation
    //     String firstName = "Anshul";
    //     String secondName = "Pandey";
    //     String fullName = firstName + " " + secondName;
    //     System.out.println(fullName);

    //     printLetters(fullName);

    // }

    // Check if a string is palindrome or not , Its TC is O(n)
    // public static boolean isPalindrome(String naam){
    //     int n = naam.length();
    //     for(int i=0; i<n/2; i++){
    //         if(naam.charAt(i) != naam.charAt(n-1-i)){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     String name = sc.next();
        
    //     System.out.println(isPalindrome(name));
        
    // }

    // Given a route containing 4 directions(E,W,S,N), find the shortest path to reach the destination "WNEENESENNN"
    // its TC is O(n)
    // public static float getShortestPath(String path){
    //     int x = 0, y = 0;
    //     for(int i=0; i<path.length(); i++){
    //         char dir = path.charAt(i);
    //         if(dir == 'N'){
    //             y++;
    //         }
    //         else if(dir == 'S'){
    //             y--;
    //         }
    //         else if(dir == 'E'){
    //             x++;
    //         }
    //         else{
    //             x--;
    //         }
    //     }
        
    //     int sqOfX = x*x;
    //     int sqOfY = y*y;

    //     return (float)Math.sqrt(sqOfX + sqOfY);
    // }
    // public static void main(String[] args) {
    //     String path = "WNEENESENNN";

    //     System.out.println(getShortestPath(path));
    // }

    // String functions - compare
    // public static void main(String[] args) {
    //     String S1 = "Rameshwaram";
    //     String S2 = "Rameshwaram";
    //     String S3 = new String("Rameshwaram");

    //     if(S1 == S2){
    //         System.out.println("Strings are equal");
    //     }
    //     else{
    //         System.out.println("Strings are not equal");
    //     }

    //     if(S1 == S3){
    //         System.out.println("Strings are equal");
    //     }
    //     else{
    //         System.out.println("Strings are not equal");
    //     }

    //     // equal functions check value only
    //     if(S1.equals(S3)){
    //         System.out.println("Strings are equal");
    //     }
    //     else{
    //         System.out.println("Strings are not equal");
    //     }
    // }

    // SubStrings
    // public static void subString(String str, int si, int ei){
    //     String reqSubStriing = " ";
    //     for(int i = si; i < ei; i++){
    //         reqSubStriing += str.charAt(i);
    //     }
    // }
    // public static void main(String[] args) {
    //     String str = "Hello Gonda!";

    //     // subString(str, 6, 11);
    //     System.out.println(str.substring(6,11));
    // }

    // For a given set of strings , print the largest string. "apple", "mango", "banana"
    // lexicographic comparision
    // public static void main(String[] args) {
    //     String fruits[] = {"apple", "mango", "banana"};

    //     String largest = fruits[0];
    //     for(int i=0; i<fruits.length; i++){
    //         if(largest.compareTo(fruits[i]) < 0){
    //             largest = fruits[i];
    //         }
    //     }
    //     System.out.println(largest);
    // }



    // STRING-BUILDER
    // public static void main(String[] args) {
    //     StringBuilder sb = new StringBuilder("");
    //     for(char ch='a'; ch<='z'; ch++){
    //         sb.append(ch);
    //     }
    //     System.out.println(sb);  //Tc is O(26) however if we had taken string here then TC will become O(26*n^2) i.e O(n^2)
    // }

    // for a given String convert each the first letter of each word to uppercase
    // public static String toUpperCase(String str){
    //     StringBuilder sb = new StringBuilder("");
    //     char ch = Character.toUpperCase(str.charAt(0));
    //     sb.append(ch);

    //     for(int i=1; i<str.length(); i++){
    //         if(str.charAt(i) == ' ' && i<str.length()-1){
    //             sb.append(str.charAt(i));
    //             i++;
    //             sb.append(Character.toUpperCase(str.charAt(i)));
    //         }
    //         else{
    //             sb.append(str.charAt(i));
    //         }
    //     }
    //     return sb.toString();

    // }
    // public static void main(String[] args) {
    //     String str = "hi, i am Anshul pandey";

    //     System.out.println(toUpperCase(str));
    // }

    // STring compression , its TC is O(n)
    // public static String stringCompression(String str){
    //     String newStr = "";

    //     for(int i=0; i<str.length(); i++){
    //         Integer count = 1;
    //         while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
    //             count++;
    //             i++;
    //         }
    //         newStr += str.charAt(i);
    //         if(count>1){
    //             newStr += count.toString();
    //         }
    //     }
    //     return newStr;
    // }
    // public static void main(String[] args) {
    //     String str = "aaabbcccdd";

    //     System.out.println(stringCompression(str));
    // }
}