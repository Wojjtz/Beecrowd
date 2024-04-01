package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int vidaUtilDestilador, precoDestiladorNovo, periodoProducao, idadeDestilador;

        periodoProducao = in.nextInt();
        idadeDestilador = in.nextInt();
        vidaUtilDestilador = in.nextInt();
        precoDestiladorNovo = in.nextInt();

        int[] custoManutencao = new int[vidaUtilDestilador];
        int[] precoVendaDestilador = new int[vidaUtilDestilador];

        for (int i = 0; i < vidaUtilDestilador; i++) {
            //lembrar de que os valores aqui guardados são referentes aos anos de uso a partir do ano 0
            custoManutencao[i] = in.nextInt();
        }

        for (int i = 0; i < vidaUtilDestilador; i++) {
            //lembrar de que os valores aqui guardados são referentes aos anos de uso a partir do ano 1
            precoVendaDestilador[0] = in.nextInt();
        }

    }
}