package br.com.sci.desafios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TresJava {
//    3- Elabore um programa de computador que realize o cálculo de notas.
//    Este programa deverá solicitar o nome do aluno e quatro notas, todo este conjunto
//    deverá estar contido em um laço que confirme se deseja encerrar o programa ou
//    continuar solicitando outros nomes e notas.
//    Ao final da solicitação do nome e das notas deverá ser impresso o nome do aluno
//    e a sua média, se a nota for  menor que 6 imprimir Reprovado, senão,
//    se a nota for igual ou maior que 6, imprimir Aprovado.

    public static class Student {

        private String name;
        private double grade1;
        private double grade2;
        private double grade3;
        private double grade4;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getGrade1() {
            return grade1;
        }

        public void setGrade1(double grade1) {
            this.grade1 = grade1;
        }

        public double getGrade2() {
            return grade2;
        }

        public void setGrade2(double grade2) {
            this.grade2 = grade2;
        }

        public double getGrade3() {
            return grade3;
        }

        public void setGrade3(double grade3) {
            this.grade3 = grade3;
        }

        public double getGrade4() {
            return grade4;
        }

        public void setGrade4(double grade4) {
            this.grade4 = grade4;
        }
    }

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean register = true;

        while (register){
            Student student = new Student();
            System.out.println("Digite o nome do aluno:");
            student.setName(scanner.next());
            System.out.println("Digite a primeira nota do aluno:");
            student.setGrade1(scanner.nextDouble());
            System.out.println("Digite a segunda nota do aluno:");
            student.setGrade2(scanner.nextDouble());
            System.out.println("Digite a terceira nota do aluno:");
            student.setGrade3(scanner.nextDouble());
            System.out.println("Digite a quarta nota do aluno:");
            student.setGrade4(scanner.nextDouble());
            students.add(student);
            double average = (double) (student.getGrade1() + student.getGrade2() + student.getGrade3() + student.getGrade4()) / 4;
            System.out.println("A média do(a) aluno(a) " + student.getName() + " é: " + average );
            if (average < 6){
                System.out.println("O aluno foi Reprovado!");
            } else {
                System.out.println("O aluno foi Aprovado!");
            }
            System.out.println("Deseja cadastrar um novo aluno? Digite 1 para SIM ou 2 para NÃO:");
            boolean proceed = true;
            int answer = scanner.nextInt();
            while (proceed){
                if (answer == 2){
                    register = false;
                    proceed = false;
                } else if( answer == 1) {
                    proceed = false;
                } else {
                    System.out.println("Digite um valor válido! Digite 1 para SIM ou 2 para NÃO:");
                    answer = scanner.nextInt();
                }
            }
        }
        System.out.println("Programa finalizado!");

    }

}
