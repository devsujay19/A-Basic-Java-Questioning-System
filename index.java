// Importing Java package
import java.util.*;
// A Class Name
class FirstCodeOfLife{
    public static void main(String[] args) {
        // Printing First Question
        System.out.println("What is your name?");
        // Taking The User Input
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        // After Taking User Input, Printing A Sentence With User Input
        System.out.println("Hello " + name);
        //Printing Second Question
        System.out.println("How old are you?");
        // Taking The Second User Ipput
        Scanner scanner = new Scanner(System.in);
        int age = sc.nextInt();
        // After Taking User Input, Printing A Second Sentence With User Input
        System.out.println("Oh, your age is " + age);
    }
}