import java.util.Scanner;

public class WrongIndentationType extends Exception {
    public WrongIndentationType(String s) {
    }

    public static void main(String[] args) throws WrongIndentationType {
        Scanner sc = new Scanner(System.in);
        System.out.print("What type of indentation do you prefer?");
        String indentationPreference = sc.nextLine();

        if (indentationPreference.equals("tabs")) {
            WrongIndentationType e;
            e = new WrongIndentationType("Spaces are superior!");
            throw e;
        }
    }
}
