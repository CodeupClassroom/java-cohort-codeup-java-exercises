import java.util.Scanner;

public class ConsoleIO {

    // main method
    public static void main(String[] args) {
//        String name = "laura";
//        int age = 32;
//        String lastName = "Ruiz";
////        System.out.println(name);
////        System.out.println("my name is "+ name);
//
//        System.out.printf("hello there, %s, is your last name: %s ?? Age: %s! Nice to see you! %n", name, lastName, age);
//        System.out.print("hello again!");

//        USING THE SCANNER CLASS
//        Scanner myScanner = new Scanner(System.in);
//
//        System.out.print("enter your city: ");
//        String userInput = myScanner.nextLine();
//        System.out.println("You entered: --> \"" + userInput + "\" <--");
//        myScanner.reset();
//
//        System.out.println("tell me you age!");
//        int userAge = myScanner.nextInt();
//        System.out.println("are you really: " + userAge + " ???");
//        // this helps tell your scanner to stop
//        myScanner.nextLine();
//
//
//        System.out.println("dogs name");
//        String dogsName = myScanner.nextLine();
//        System.out.println(dogsName);
//
//        System.out.println("favorite restaurant?");
//        String faveRes = myScanner.nextLine();
//        System.out.println(faveRes);
//
//        Scanner myOtherScanner = new Scanner(System.in);
//
//        System.out.println("tell me a secret");
//        String secret = myOtherScanner.nextLine();
//        System.out.println(secret);



        // console io exercises

        //1. ✅
         double pi = 3.14159;
//        System.out.printf(" The value of pi is approx: %s%n", pi);
//        System.out.format("The value of pi is approx: %f%n", pi);

        // part ii q1. Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
        // - ✅prompt the user -> sout
        // - ✅create a new int variable for the user input
        // - ✅ Scanner
        // -  ✅listen/catch that value using nextInt()

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("please enter an integer: ");
//        int userInteger = scanner.nextInt();
//        System.out.println(userInteger);

        // part ii q2
        // - ✅ make sure we have a scanner
        // - ✅ prompt the user for three words
        // - ✅create 3 separate variables  ->
        // - ✅catch each of those variables
        // - print to the console the 3 words separately
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("please give me 3 words:");
//        String word1 = scanner.next();
//        String word2 = scanner.next();
//        String word3 = scanner.next();
//
//        System.out.printf("here are your three words: %n%s%n%s%n%s", word1, word2, word3);
////        System.out.println(word1);
////        System.out.println(word2);
////        System.out.println(word3);

        // part ii q3 -> Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
        // ✅ scanner
        // ✅ prompt the user -> sout
        // ✅ capture the sentences/input
        // ✅save it to a vriable
        // ✅display the capture

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("please enter a sentence:");
//        String userSentence = scanner.nextLine();
//        System.out.println(userSentence);

//        part iii q1 Prompt the user to enter values of length and width of a classroom at Codeup (or your room if virtual). (use nextLine)

        // - ✅use the scanner
        // ✅ prompt the user length & width
        // ✅ capture length and width
        // ✅ store variables separately
        // ✅ parse each of those variables

        Scanner scanner = new Scanner(System.in);
        System.out.println("what's your room's length and width?");
        float length = Float.parseFloat(scanner.nextLine());
        float width = Float.parseFloat(scanner.nextLine());
        System.out.println(length + width);

        // part iii q2 Display the area and perimeter of that classroom.
        // create area variable
        // area = length * width
        // create perimeter variable
        // perimeter = 2*l + 2*w

        float area = length * width;
        System.out.printf("the area is %s%n", area);
        float perimeter = (2*length) + (2*width);
        System.out.printf("the perimeter is: %s%n", perimeter);






















    }


}