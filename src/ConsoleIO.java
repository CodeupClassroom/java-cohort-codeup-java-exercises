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
        Scanner myScanner = new Scanner(System.in);

        System.out.print("enter your city: ");
        String userInput = myScanner.nextLine();
        System.out.println("You entered: --> \"" + userInput + "\" <--");
        myScanner.reset();

        System.out.println("tell me you age!");
        int userAge = myScanner.nextInt();
        System.out.println("are you really: " + userAge + " ???");
        // this helps tell your scanner to stop
        myScanner.nextLine();


        System.out.println("dogs name");
        String dogsName = myScanner.nextLine();
        System.out.println(dogsName);

        System.out.println("favorite restaurant?");
        String faveRes = myScanner.nextLine();
        System.out.println(faveRes);

        Scanner myOtherScanner = new Scanner(System.in);

        System.out.println("tell me a secret");
        String secret = myOtherScanner.nextLine();
        System.out.println(secret);





    }


}