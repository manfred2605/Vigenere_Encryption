package VigenereEncryption;
import java.util.Arrays;
import java.util.Scanner;

public class Main extends Vigenere{

    public static void main(String[] args) {

        int choice;

        String msg = null;
        Vigenere vig = new Vigenere();

        System.out.println("Digite la frase a encriptar: ");
        Scanner input = new Scanner(System.in);
        System.out.println("Digite la clave: ");
        Scanner input2 = new Scanner(System.in);

        msg = input.nextLine();
        String password = input2.nextLine();

        System.out.println();


    }
}
