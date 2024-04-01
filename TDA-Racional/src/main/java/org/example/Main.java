package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = 0, n2 = 0, d1 = 0, d2 = 0;
        String operacao = "";
        int qntOperacoes = in.nextInt();
        do {
            n1 = in.nextInt();
            in.next();
            d1 = in.nextInt();
            operacao = in.next();
            n2 = in.nextInt();
            in.next();
            d2 = in.nextInt();
            switch (operacao){
                case "+":
                    n1 = (n1*d2) + (n2*d1);
                    d1 = (d1 * d2);
                    break;
                case "-":
                    n1 = (n1*d2) - (n2*d1);
                    d1 = (d1*d2);
                    break;
                case "*":
                    n1 = (n1*n2);
                    d1 = (d1*d2);
                    break;
                case "/":
                    n1 = (n1*d2);
                    d1 = (n2*d1);
                    break;
                default:
                    break;
            }
            System.out.print(n1 + "/" + d1 + " = ");
            simplificar(n1,d1);
            qntOperacoes--;
        }while (qntOperacoes > 0);
    }
    private static int encontrarMDC(int num, int den){
        if (den == 0)
            return num;
        return encontrarMDC(den, num % den);
    }
    private static void simplificar(int num, int den){
        int mdc = encontrarMDC(num, den);
        if(mdc < 0){
            if(num > 0){
                num *= -1;
            }
            mdc *= -1;
        }
        num = num/mdc;
        den = den/mdc;
        System.out.println(num + "/" + den);
    }
}