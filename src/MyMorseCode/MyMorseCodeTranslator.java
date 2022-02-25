package MyMorseCode;

import java.util.*;

public class MyMorseCodeTranslator {

    public static void main(String[] args) {
        Translator translator = new Translator();

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter morse or English");
        String userInput = scan.nextLine().toUpperCase();

        if (!userInput.matches("\\A\\p{ASCII}*\\z")) {
            System.out.println("Unsupported character");
            System.exit(0);
        }

        if (userInput == "") {
            System.out.println("Please enter minimum one character");
            System.exit(0);
        }

        System.out.println(translator.ToMorse(userInput));
    }
}

