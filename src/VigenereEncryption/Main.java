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
                    press 2 to Decrypt Message       
                    press 0 for exit""");

            choice = input.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("""
                        press 1 to enter message
                        press 2 to enter password  
                        press 0 for exit""");
                }

                default -> System.out.println("Enter");
            }
        } while (choice != 0);













    }
}