package br.com.sci.desafios;

import java.util.Scanner;

public class CincoJava {
//    5 - Crie uma matriz bidimensional. Deverá ser solicitado três nomes de alunos e quatro notas,
//    após solicitação dos nomes e das notas deverá ser impresso os nomes acompanhados da média geral
//    de cada aluno, deverá ser impresso também o nome do aluno que obteve a maior média e o nome do aluno
//    que obteve a menor média.


   /* SOBRE A RESOLUÇÃO DO DESAFIO:
    Sabendo que não é possível criar uma matriz bidimensional com tipos diferentes de dados,
    a matriz foi icializada com o tipo String e depois convertido para Double, e então feito os devidos cálculos. */


    public static void main(String[] args) {
        String[][] students = new String[3][5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 5; j++){
                if (j == 0){
                    System.out.println("\n");
                    System.out.println("********** NOVO ALUNO **********");
                    System.out.println("Digite o nome do aluno:");
                }
                if (j > 0) System.out.println("Digite a nota do aluno:");
                students[i][j] = scanner.next();
            }
        }
        System.out.println("\n");
        System.out.println("************** MÉDIAS ***************");
        double max = 0;
        double min = 0;
        String maxNameStudent = "";
        String minNameStudent = "";
        for (int i = 0; i < 3; i++){
            double sum = 0;
            double average = 0;
            System.out.print("O aluno " + students[i][0]);
            for (int j = 0; j < 5; j++){
                if(j != 0) sum += Double.parseDouble(students[i][j]);
            }
            average = sum / 4;
            System.out.print(" obteve a média: " + average);
            System.out.println("");
            if(average > max){
                maxNameStudent = students[i][0];
            }
            if(average < min || min < max){
                minNameStudent = students[i][0];
            }
            max = average;
            min = average;
        }
        System.out.println("\n");
        System.out.println("*********** MAIOR E MENOR MÉDIA *************");
        System.out.println("O aluno com a maior média é: " + maxNameStudent);
        System.out.println("O aluno com a menor média é: " + minNameStudent);
    }

}
