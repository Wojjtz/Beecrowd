package org.example;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#.00", new DecimalFormatSymbols(Locale.US));
        df.setRoundingMode(java.math.RoundingMode.DOWN);

        Scanner in = new Scanner(System.in);

        String mensagem = "";

        int imoveis;
        int cidade = 1;
        int[][] consumos;

        while(true) {
            imoveis = in.nextInt();

            if(imoveis == 0)
                break;

            consumos = new int[imoveis][2];
            int somaConsumo = 0;
            int somaMoradores = 0;

            for (int i = 0; i < imoveis; i++) {
                int qtdMoradores = in.nextInt();
                int consumoTotalImovel = in.nextInt();

                somaMoradores += qtdMoradores;
                somaConsumo += consumoTotalImovel;

                int consumoPorPessoa = consumoTotalImovel / qtdMoradores;

                consumos = ordenarConsumo(consumos, consumoPorPessoa, 0, qtdMoradores);
            }

            mensagem += "Cidade# " + cidade +":\n";
            for (int[] consumo : consumos) {
                mensagem += consumo[0] + "-" + consumo[1] + " ";
            }
            cidade++;

            mensagem += "\nConsumo medio: " + df.format((double)somaConsumo/ (double) somaMoradores) + " m3.\n\n";
        }

        System.out.println(mensagem);
        in.close();
    }

    private static int[][] ordenarConsumo(int[][] consumos, int consumo, int posicao, int qtdMoradores){
        if(posicao >= consumos.length)
            return consumos;


        if(consumos[posicao][0] == 0){
            consumos[posicao][0] = qtdMoradores;
            consumos[posicao][1] = consumo;
            return consumos;
        }

        if(consumo == consumos[posicao][1]){
            consumos[posicao][0] += qtdMoradores;
            return consumos;

        }else  if(consumo < consumos[posicao][1]){
            int[][] aux = new int[1][2];
            aux[0][0] = consumos[posicao][0];
            aux[0][1] = consumos[posicao][1];

            int tamanhoConsumos = consumos.length - 1;
            for (int i = tamanhoConsumos; i >= (posicao-tamanhoConsumos) ; i--) {
                consumos[tamanhoConsumos][0] = consumos[tamanhoConsumos-1][0];
                consumos[tamanhoConsumos][1] = consumos[tamanhoConsumos-1][1];
            }

            consumos[posicao][0] = qtdMoradores;
            consumos[posicao][1] = consumo;
            consumos[posicao+1][0] = aux[0][0];
            consumos[posicao+1][1] = aux[0][1];

            return consumos;
        } else {
            return ordenarConsumo(consumos, consumo, posicao+1, qtdMoradores);
        }
    }
}