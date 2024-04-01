package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pretas = 0;
        int brancas = 0;
        int tamanho = in.nextInt();
        for (int i = 1; i <= tamanho * tamanho; i++){
            if(i % 2 == 1){
                brancas++;
            }else{
                pretas++;
            }
        }
        System.out.println(brancas + " casas brancas e " + pretas + " casas pretas");
    }
}