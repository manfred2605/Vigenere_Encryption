package VigenereEncryption;

import java.util.Scanner;

public class Vigenere {

    public char[] message;//mensaje
    public char[] result;
    public char[] password;
    public char[][] matrix;

    public Vigenere() {
    }

    public Vigenere(String littleMessage, String code) { //recibe por parametros los valores

        String msgMay = littleMessage.toUpperCase();//convierte la cadena(littleMessage) en mayusculas
        this.message = msgMay.toCharArray();

        String claveMay = code.toUpperCase();//convierte la cadena(code) en mayusculas
        char[] passTmp = claveMay.toCharArray();

        this.password = new char[message.length];
        int count = 0;

        for (int i = 0; i < message.length; i++) {//compara la clave con el mensaje a encriptar
            this.password[i] = passTmp[count];
            count++;
            if (count == passTmp.length) {
                count = 0;
            }
        }

        this.matrix = createMatrixAlphabet();
        //encryptMessage();
    }

    public void encryptMessage() {
        char[] code = new char[message.length];
        int ejeX;
        int ejeY;

        for (int cont = 0; cont < message.length; cont++) {
            ejeX = (int) this.message[cont] - 65;
            ejeY = (int) this.password[cont] - 65;
            code[cont] = this.matrix[ejeX][ejeY];
        }
        this.result=code;//se almacena el valor de la busqueda en la matriz
        System.out.println(this.message);
        System.out.println(this.password);
        System.out.println(code);
    }

    public String getMessageEncrypted(){
        String aux = "";
        for(int i=0;i<result.length;i++) {
            aux += this.result[i];
        }
        return aux;
    }

    private char[][] createMatrixAlphabet() {
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
                matrix[i][k] = alpha[counter + i];
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