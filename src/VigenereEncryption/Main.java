package VigenereEncryption;
import java.util.Arrays;
import java.util.Scanner;

public class Main extends Vigenere{

    public static void main(String[] args) {

        int choice;
        Scanner input = new Scanner(System.in);
        Vigenere vig = new Vigenere("hola","ho");


        do {
            System.out.println("""
                    press 1 to Encrypt Message
                    press 2 to display all record
                    press 3 to delete a record
                    press 4 to update a record
                    press 0 for exit""");

            choice = input.nextInt();
            switch (choice) {
                case 1 -> System.out.println(vig);

                default -> System.out.println("Enter");
            }
        } while (choice != 0);













    }
}