package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String primeiraPalavra = in.nextLine();
//        String segundaPalavra = in.nextLine();

        System.out.println(contarSubstrings("Hey This java is hot", "Java is a new paradigm", 0, 0,0));

    }

    private static int contarSubstrings(String primeiraPalavra, String segundaPalavra, int qtdSubstrings, int posicaoA, int posicaoB) {
        if(posicaoA < primeiraPalavra.length()){
            if(posicaoB < segundaPalavra.length()){
                if(primeiraPalavra.charAt(posicaoA) == segundaPalavra.charAt(posicaoB)){
                    if(qtdSubstrings != 0){
                        if(posicaoB == 0){
                            return primeiraPalavra.charAt(posicaoA-1) == segundaPalavra.charAt(0) ? contarSubstrings(primeiraPalavra, segundaPalavra, qtdSubstrings+1,posicaoA+1,posicaoB+1) :  qtdSubstrings;
                        }else{
                            return primeiraPalavra.charAt(posicaoA-1) == segundaPalavra.charAt(posicaoB-1) ? contarSubstrings(primeiraPalavra, segundaPalavra, qtdSubstrings+1,posicaoA+1,posicaoB+1) :  qtdSubstrings;
                        }
                    }else{
                        return contarSubstrings(primeiraPalavra, segundaPalavra, qtdSubstrings+1, posicaoA, posicaoB+1);
                    }
                }else{
                    return contarSubstrings(primeiraPalavra, segundaPalavra, qtdSubstrings, posicaoA, posicaoB+1);
                }
            }else{
                return contarSubstrings(primeiraPalavra, segundaPalavra, qtdSubstrings, posicaoA+1, 0);
            }
        }else{
            return qtdSubstrings;
        }
    }
}