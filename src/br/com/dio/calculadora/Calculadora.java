package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a , b;

        System.out.println("Digite o primeiro numero: ");
        a = scan.nextInt();
        System.out.println("Digite o segundo numero: ");
        b = scan.nextInt();

        int soma = soma(a , b);
        int subtrai = subtrai(a , b);
        int multiplica = multiplica(a , b);
        int divisao = divisao(a , b);

        System.out.println("Resultado da soma é: " + soma);
        System.out.println("Resultado da subtração é: " + subtrai);
        System.out.println("Resultado da multiplicação é: " + multiplica);
        System.out.println("Resultado da divisão é: " + divisao);

    }

    public static  int soma(int a, int b) {
        return a + b;
    }public static  int subtrai(int a, int b) {
        return a - b;
    }public static  int multiplica(int a, int b) {
        return a * b;
    }
    public static  int divisao(int a, int b) {
        return a / b;
    }

}
