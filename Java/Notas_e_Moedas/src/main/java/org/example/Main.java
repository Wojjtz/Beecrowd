package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double valor = in.nextDouble();
        int notas = (int) valor;
        int moedas = (int) (((valor - notas) * 100) + 0.5);


        int notas100 = notas / 100;
        notas -= notas100 * 100;

        int notas50 = notas / 50;
        notas -= notas50 * 50;

        int notas20 = notas / 20;
        notas -= notas20 * 20;

        int notas10 = notas / 10;
        notas -= notas10 * 10;

        int notas5 = notas / 5;
        notas -= notas5 * 5;

        int notas2 = notas / 2;
        notas -= notas2 * 2;

        moedas += notas * 100;

        int moedas1 = moedas / 100;
        moedas -= moedas1 * 100;

        int moedas50 = moedas / 50;
        moedas -= moedas50 * 50;

        int moedas25 = moedas / 25;
        moedas -= moedas25 * 25;

        int moedas10 = moedas / 10;
        moedas -= moedas10 * 10;

        int moedas05 = moedas / 5;
        moedas -= moedas05 * 5;

        int moedas01 = moedas;

        System.out.print("NOTAS:\n" +
                notas100 + " nota(s) de R$ 100.00\n" +
                notas50 + " nota(s) de R$ 50.00\n" +
                notas20 + " nota(s) de R$ 20.00\n" +
                notas10 + " nota(s) de R$ 10.00\n" +
                notas5 + " nota(s) de R$ 5.00\n" +
                notas2 + " nota(s) de R$ 2.00\n" +
                "MOEDAS:\n" +
                moedas1 + " moeda(s) de R$ 1.00\n" +
                moedas50 + " moeda(s) de R$ 0.50\n" +
                moedas25 + " moeda(s) de R$ 0.25\n" +
                moedas10 + " moeda(s) de R$ 0.10\n" +
                moedas05 + " moeda(s) de R$ 0.05\n" +
                moedas01 + " moeda(s) de R$ 0.01\n");
        System.out.print("");
    }
}