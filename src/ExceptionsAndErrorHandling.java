import java.sql.SQLOutput;
import java.util.Scanner;

public class ExceptionsAndErrorHandling {
    public static void main(String[] args) throws Exception{

        // ▶️ VOCAB
        // ➡️ Exception Class -> "indicates conditions that a reasonable application might want to catch." - the docs
        // ➡️ to throw an Exception -> "The Throwable class is the superclass of all errors and exceptions in the Java language. Only objects that are instances of this class (or one of its subclasses) are thrown by the Java Virtual Machine or can be thrown by the Java throw statement"  - the docs
        // ➡️ Exception message -> the message we see appear when an exception gets thrown




        // example of EXISTING EXCEPTION being thrown at us
        // ➡️ ArrayIndexOutOfBounds -> "thrown to indicate ... the index is either negative or greater than or equal lto the size of the array" - the docs
//        int[] numbers = {1, 2, 3};
//        System.out.println(numbers[999]);


        // CREATING our own EXCEPTIONS + message:
        // ‼️ we cannot throw an exception without handling it first
//        throw new Exception("Something bad happened!");
//        System.out.println("after the throw statement");


        // CATCHING EXCEPTIONS -> helps us handle that exception
        // try/catch recap:
//        try {
//            // something that
//            // might go wrong
//        } catch (Exception e) {
//            // handle the error
//        }

        // example:
//        System.out.println(1/0);
//
//        try { // try this block of code first!
//            System.out.println("Let's see...");
//            // UH OH!! EXCEPTION
//            int result = 1 / 0;
//            // STOP WHAT YOU'RE DOING AND GO HANDLE THAT EXCEPTION INSTEAD
//            System.out.println("I can divide by zero!");
//
//        } catch (ArithmeticException e) {
//            // RUN THIS INSTEAD:
//            System.out.println("Math still works!");
//        }


        // example with finally keyword && a generic exception
        // ‼️ most specific catch-block executes
        // ‼️ try-catch blocks create a local scope
//        int[] numbers = {1, 2, 3};
//        int x;
//
//        try {
//            x = numbers[100];
////            x = 1/0;
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Caught an array index exception!");
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("Caught a generic exception!");
//        } finally {
//            System.out.println("This will always run.");
//        }



        // what is e when throwing and/or handling a generic Exception
        // ▶️ it's an objet that represents the error with existing methods (but it's not unique to any specific kind of error)
        // ▶️ .getMessage() -> returns the exception message as a String
        // ▶️ .printStackTrace() -> prints details of exception ‼️ useful for debugging



        // TYPES OF EXCEPTIONS
        // 🔳 Unchecked
        // • errors inside of program logic
        // • built-in exceptions (mainly)
        // • don't necessarily have to be handled, BUT
        // • could cause more issues when the program runs because it's unrecoverable since they're not checked at compile time

        // ☑️ Checked
        // • errors that happen outside of the control of the program
        // • must be handled
        // • enforced by compiler -> code will not run if not handled
        getIndentationPreference();

        // how to handle Exceptions ...
        // -> try... catch
        // -> method signature


        // 🚩 Error exception
        // • uh oh, big unanticipated problem

        String indentationPreference;

        try {
            indentationPreference = getIndentationPreference();
            System.out.println("Okay, " + indentationPreference + " is a great choice.");
        } catch (Exception e) {
            System.out.println("Uh oh, something went wrong: " + e.getMessage());
            System.out.println("Here is some more detail:");
            e.printStackTrace();
        }

    }

    // EXAMPLES
    // ☑️ checked exceptions
    public static String getIndentationPreference() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("What type of indentation do you prefer?");
        String indentationPreference = sc.nextLine();

       // CREATING CUSTOM EXCEPTION
        if (indentationPreference.equals("tabs")) {
            throw new Exception("Spaces are superior!");
        }

        return indentationPreference;
    }


}
