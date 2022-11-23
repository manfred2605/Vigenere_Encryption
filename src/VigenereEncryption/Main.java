package VigenereEncryption;
import java.util.Arrays;

public class Main extends Vigenere{

    public static void main(String[] args) {
        Vigenere vig = new Vigenere();

        System.out.println(Arrays.deepToString(vig.matrixAlphabet()));
    }
}