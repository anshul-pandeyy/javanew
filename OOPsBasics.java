// Topics: Classes & Objects, Access Modifiers, Getters & Setters
// public class OOPsBasics {
//     public static void main(String[] args) {
//         Pen p1 = new Pen(); //Created a pen object called p1
//         p1.setColor("Blue");
//         System.out.println(p1.getColor());
//         p1.setTip(5);
//         System.out.println(p1.getTip());
//         p1.setColor("Yellow");
//         System.out.println(p1.getColor());

//         // BankAccount myAcc = new BankAccount();
//         // myAcc.username = "anshulpandey";
//         // // myAcc.password = "anypassword"; // Error
//         // myAcc.setPassword("anypassword");

//     }
// }
// // class BankAccount{
// //     public String username;
// //     private String password;
// //     public void setPassword(String  pwd){
// //         password = pwd;
// //     }
// // }

// class Pen{
//     // prop + funx
//     private String color;
//     private int tip;

//     String getColor(){
//         return this.color;
//     }

//     int getTip(){
//         return this.tip;
//     }

//     void setColor(String newColor){
//         this.color = newColor;
//     }
//     void setTip(int tip){
//         this.tip = tip;
//     }

// }

// // class Student{
// //     String name;
// //     int age;
// //     float percentage;

// //     void calPercentage(int phy, int chem, int math){
// //         percentage = (phy+chem+math)/3;
// //     }
// // }


// // Topics: Encapsulations, Constructors and its types, Destructors
// public class OOPsBasics {

//     public static void main(String[] args) {
//         Student s1 = new Student();
//         Student s2 = new Student("RAM");
//         Student s3 = new Student(296);

//         Student x = new Student();
//         x.name = "Shyam";
//         x.rollno = 370;
//         x.password = "abcd";
//         x.marks[0] = 100;
//         x.marks[1] = 90;
//         x.marks[2] = 80;

//         Student y = new Student(x); //copy
//         y.password = "wtf";
//         x.marks[2] = 87;
//         for(int i=0; i<3; i++){
//             System.out.println(y.marks[i]);
//         }
        
//     }
// }

// class Student{
//     String name;
//     int rollno;
//     String password;
//     int marks[];

//     // To initialise our class Student we'll make a constructor Student()
//     Student(){
//         marks = new int[3];
//         System.out.println("Constructor is called...");
//     }
//     Student(String name){
//         marks = new int[3];
//         this.name = name;
//     }
//     Student(int rollno){
//         marks = new int[3];
//         this.rollno = rollno;
//     }

//     // Shallow copy constructor
//     // Student(Student x){
//     //     marks = new int[3];
//     //     this.name = x.name;
//     //     this.rollno = x.rollno;
//     //     this.marks = x.marks;
//     // }

//     // deep copy constructor
//     Student(Student x){
//         marks = new int[3];
//         this.name = x.name;
//         this.rollno = x.rollno;
//         for(int i=0; i<3; i++){
//             this.marks[i] = x.marks[i];
//         }
//     }
// }

// // Topics : Inheritance and its types
// public class OOPsBasics {

//     public static void main(String[] args) {
//         // Fish shark = new Fish();
//         // shark.eat();

//         Dog dobby = new Dog();
//         dobby.eat();
//         dobby.legs = 4;
//         System.out.println(dobby.legs);
//     }
// }

// // Base class
// class Animal{
//     String color;

//     void eat(){
//         System.out.println("eats");
//     }

//     void breathe(){
//         System.out.println("breathes");
//     }
// }

// class Mammal extends Animal{
//     // int legs;
//     void walk(){
//         System.out.println("walks");
//     }
// }
// class Fish extends Animal{
//     void swim(){
//         System.out.println("Swim");
//     }
// }
// class Bird extends Animal{
//     void fly(){
//         System.out.println("fly");
//     }
// }

// // class Dog extends Mammal{
// //     String breed;
// // }

// // derived class or subclass
// // class Fish extends Animal{
// //     int fins;

// //     void swim(){
// //         System.out.println("Swims in water");
// //     }
// // }

// // Topics : Polymorphism, Method overloading, Method overriding
// public class OOPsBasics {

//     public static void main(String[] args) {
//         // Calculator calc = new Calculator();
//         // System.out.println(calc.sum(2, 3));
//         // System.out.println(calc.sum((float)2.5, (float)3.5));
//         // System.out.println(calc.sum(2, 3, 4));

//         Deer d = new Deer();
//         d.eat();
//     }
// }
// // class Calculator{
// //     int sum(int a, int b){
// //         return a+b;
// //     }
// //     float sum(float a, float b){
// //         return a+b;
// //     }
// //     int sum(int a, int b, int c){
// //         return a+b+c;
// //     }
// // }

// class Animal{
//     void eat(){
//         System.out.println("eats anything");
//     }
// }
// class Deer extends Animal{
//     void eat(){
//         System.out.println("eats grass");
//     }
// }

// // Topics : Abstraction, Abstract class
// public class OOPsBasics {

//     public static void main(String[] args) {
//         // Horse h = new Horse();
//         // h.eat();
//         // h.walk();
//         // System.out.println(h.color);
//         // Chicken C = new Chicken();
//         // C.eat();
//         // C.walk();

//         Mustang myHorse = new Mustang();
//         // Animal -> Horse -> Mustang
//     }
// } 
// abstract class Animal {
//     String color;

//     Animal(){                 // Constructor
//         System.out.println("Animal constructor called");
//     }
//     void eat(){
//         System.out.println("animal eats");
//     }

//     abstract void walk(); // No implementation here
// }
// class Horse extends Animal{
//     Horse(){
//         System.out.println("Horse constructor called");
//     }
//     void changeColor(){
//         color = "dark brown";
//     }
//     void walk(){
//         System.out.println("Walks on 4 legs");
//     }
// }
// class Mustang extends Horse{
//     Mustang(){
//         System.out.println("Mustang constructor called");
//     }
// }
// class Chicken extends Animal{
//     void changeColor(){
//         color = "Yellow";
//     }
//     void walk(){
//         System.out.println("Walks on 2 legs");
//     }
// }

// // Topic : Interfaces
// public class OOPsBasics {

//     public static void main(String[] args) {
//         Queen q = new Queen();
//         q.moves();
//     }
// }

// interface ChessPlayer{
//     void moves();
// }

// class Queen implements ChessPlayer{
//     public void moves(){
//         System.out.println("up, down, left, right, diagonally in all 4 directions, (any no. of steps)");
//     }
// }
// class Rool implements ChessPlayer{
//     public void moves(){
//         System.out.println("up, down, left, right, (any no. of steps)");
//     }
// }
// class King implements ChessPlayer{
//     public void moves(){
//         System.out.println("up, down, left, right, diagonally, (only one steps)");
//     }
// }

// Topic : Static Keyword
// public class OOPsBasics {

//     public static void main(String[] args) {
//         Student s1 = new Student();
//         s1.schoolName = "St. Xavier's";

//         Student s2 = new Student();
//         // System.out.println(s2.schoolName);

//         Student s3 = new Student();
//         s3.schoolName = "VIT";
//         System.out.println(s3.schoolName);


//     }
// }
// class Student{
//     String name;
//     int rollno;

//     static String schoolName;

//     void setName(String name){
//         this.name = name;
//     }
//     String getName(){
//         return this.name;
//     }
// }