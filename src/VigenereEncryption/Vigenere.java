package VigenereEncryption;

import java.util.Scanner;

public class Vigenere {

    public char[] message;
    public char[] result;
    public char[] password;
    public char[][] matrix;

    public Vigenere() {
    }

    public Vigenere(String littleMessage, String code) { //recibe por parametros los valores

        String msgMay = littleMessage.toUpperCase();//convierte el parametro(littleMessage) en mayusculas
        this.message = msgMay.toCharArray();//convierte el String en un array de caracteres

        String claveMay = code.toUpperCase();//convierte el parametro(code) en mayusculas
        char[] passTmp = claveMay.toCharArray();//convierte el String en una array de caracteres

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
        encryptMessage();
    }

    public void encryptMessage() {
        char[] code = new char[message.length];
        int ejeX;   //crea coordenadas de una matriz eje X los valores del mensaje
        int ejeY;   // eje Y los valores de la clave

        for (int cont = 0; cont < message.length; cont++) {
            ejeX = (int) this.message[cont] - 65;//se posiciona en la primera letra mayuscula
            ejeY = (int) this.password[cont] - 65;
            code[cont] = this.matrix[ejeX][ejeY]; // se posiciona en la coordenada exacta de la matriz
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

    char[][] createMatrixAlphabet() {
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