package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        do {
            String primeiraPalavra = in.nextLine();
            if(primeiraPalavra == "")
                break;
            String segundaPalavra = in.nextLine();
            System.out.println(compararStrings(primeiraPalavra, segundaPalavra, 0, 0, 0));
        }while(true);

    }
    private static int compararStrings(String primeira, String segunda, int quantidade, int posicaoPrimeira, int posicaoSegunda){
        if(posicaoPrimeira == primeira.length())
            return quantidade;
        if(posicaoSegunda == segunda.length())
            return compararStrings(primeira,segunda,quantidade,posicaoPrimeira+1, 0);
        if(primeira.charAt(posicaoPrimeira) == segunda.charAt(posicaoSegunda)){
            quantidade++;
            if(compararProximaPosicao(primeira, segunda, posicaoPrimeira, posicaoSegunda)){
                return compararStrings(primeira, segunda, quantidade,posicaoPrimeira+1, posicaoSegunda+1);
            }else{
                return compararStrings(primeira, segunda, 0, posicaoPrimeira, posicaoSegunda+1);
            }
        }else{
            return compararStrings(primeira,segunda,quantidade,posicaoPrimeira, posicaoSegunda+1);
        }
    }

    private static boolean compararProximaPosicao(String primeira, String segunda, int posicaoPrimera, int posicaoSegunda){
        if(posicaoPrimera == primeira.length()-1)
            return true;
        if(posicaoSegunda == segunda.length())
            return true;
        if(primeira.charAt(posicaoPrimera+1) == segunda.charAt(posicaoSegunda+1)){
            return true;
        }else{
            return false;
        }
    }
}