package br.com.sci.desafios;

import java.util.Scanner;

public class QuatroJava {
//    4- Criar um vetor de cinco posições, solicitar  cinco números e ao fim, imprimir o valor
//    apresentado na posição três.

    public static void main(String[] args) {
        int[] values = new int[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5 ; i++){
            System.out.println("Digite um número inteiro:");
            values[i] = scanner.nextInt();
        }
        System.out.println("O valor na posição 3 é: " + values[2]);
    }

}
