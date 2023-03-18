package br.com.sci.desafios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UmJava {
    // 1 - Solicitar a inserção de 5 números, ao final, imprimir os números pares, números ímpares e a média geral desses números.

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int input = 0;

        for(int i = 0; i < 5; i++){
            System.out.println("Digite um número inteiro:");
            input = scanner.nextInt();
            sum += input;
            numbers.add(input);
        }
        System.out.println("Os números pares são:");
        for (int i = 0; i < numbers.size(); i++){
            if(numbers.get(i) % 2 == 0) System.out.println(numbers.get(i));
        }
        System.out.println("Os números ímpares são:");
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 != 0) System.out.println(numbers.get(i));
        }
        System.out.println("A média geral é: " + (double) sum / numbers.size());
    }

}
