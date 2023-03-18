package br.com.sci.desafios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DoisJava {
    // 2 -  Solicitar 5 números, ao fim, imprimir o número maior e o número menor.

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int min = 0;

        for (int i = 0; i < 5; i++){
            System.out.println("Digite um número inteiro:");
            numbers.add(scanner.nextInt());
        }

        max = numbers.get(0);
        for(int i = 1; i < numbers.size(); i++){
            if (numbers.get(i) > max) max = numbers.get(i);
        }
        System.out.println("O maior número é: " + max);

        min = numbers.get(0);
        for(int i = 1; i < numbers.size(); i++){
            if (numbers.get(i) < min) min = numbers.get(i);
        }
        System.out.println("O menor número é: " + min);

    }
}
