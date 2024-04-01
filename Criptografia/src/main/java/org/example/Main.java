package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int qntdFrases = in.nextInt();
        in.nextLine();
        for (int i = 0; i < qntdFrases; i++){
            System.out.println(criptografar(in.nextLine()));
        }
    }
    private static String criptografar(String frase) {
        return trocarMetadeFrase(inverterFrase(trocarLetras(frase)));
    }
    private static String trocarLetras(String frase) {
        String novaFrase = "";
        for (int i = 0; i < frase.length(); i++){
            if((int)frase.charAt(i) > 64 && (int)frase.charAt(i) < 123){
                int valorAscii = (int) frase.charAt(i) + 3;
                novaFrase += (char) valorAscii;
            }else{
                novaFrase += frase.charAt(i);
            }
        }
        return novaFrase;
    }
    private static String inverterFrase(String frase) {
        String novaFrase = "";
        int tamanhoFrase = frase.length();
        for (int i = 1; i <= tamanhoFrase; i++){
            novaFrase += frase.charAt(tamanhoFrase-i);
        }
        return novaFrase;
    }
    private static String trocarMetadeFrase(String frase) {
        String novaFrase = "";
        int meio = (frase.length()/2);
        for (int i = 0; i < meio; i++){
            novaFrase += frase.charAt(i);
        }
        for (int i = meio; i < frase.length(); i++){
            int valorAscii = (int) frase.charAt(i) - 1;
            novaFrase += (char) valorAscii;
        }
        return novaFrase;
    }
}