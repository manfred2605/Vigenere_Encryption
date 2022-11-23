package VigenereEncryption;

import java.util.Scanner;

public class Vigenere {

    private char[] message;
    private final char[] alphabet = new char[26];
    private char letter;
    private char[] password;

    char[][] matrixAlphabet() {
        int counter = 0;
        char[] alphaTemp = this.createAlphabet();
        char[] alpha = new char[alphaTemp.length * 2];

        for (int a = 0; a < 26; a++) {
            alpha[a] = alphaTemp[a];
            alpha[a + 26] = alphaTemp[a];
        }

        char[][] matrix = new char[26][26];
        for (int i = 0; i < 26; i++) {
            for (int k = 0; k < 26; k++) {
                counter++;
            }
        }
        return matrix;
    }

    private char[] createAlphabet() {
        char[] littleAlphabet = new char[26];
        for (int a = 65; a <= 90; a++) {
            littleAlphabet[a - 65] = (char) a;
        }
        return littleAlphabet;
    }

}





/*package com.sanfoundry.setandstring;

public class VigenereCipher
{
    public static String encrypt(String text, final String key)
    {
        String res = "";
        text = text.toUpperCase();
        for (int i = 0, j = 0; i < text.length(); i++)
        {
            char c = text.charAt(i);
            if (c < 'A' || c > 'Z')
                continue;
            res += (char) ((c + key.charAt(j) - 2 * 'A') % 26 + 'A');
            j = ++j % key.length();
        }
        return res;
    }

    public static String decrypt(String text, final String key)
    {
        String res = "";
        text = text.toUpperCase();
        for (int i = 0, j = 0; i < text.length(); i++)
        {
            char c = text.charAt(i);
            if (c < 'A' || c > 'Z')
                continue;
            res += (char) ((c - key.charAt(j) + 26) % 26 + 'A');
            j = ++j % key.length();
        }
        return res;
    }

    public static void main(String[] args)
    {
        String key = "VIGENERECIPHER";
        String message = "Beware the Jabberwock, my son! The jaws that bite, the claws that catch!";
        String encryptedMsg = encrypt(message, key);
        System.out.println("String: " + message);
        System.out.println("Encrypted message: " + encryptedMsg);
        System.out.println("Decrypted message: " + decrypt(encryptedMsg, key));
    }
}*/