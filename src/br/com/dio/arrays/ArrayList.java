// Lista com convidados maior que 18.

package br.com.dio.arrays;

import java.util.Scanner;

public class ArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        int idade;

        while(true) {
            System.out.println("Digite seu nome:");
            nome = scanner.next();
            if(nome.equals("0")){
                System.out.println("Seu nome não pode estar vazio");
                break;
            }
            System.out.println("Digite sua idade:");
            idade = scanner.nextInt();
            if(idade < 18){
                System.out.println("Sua idade não pode ser menor que 18");
                break;
            }
            System.out.println("Seja bem vindo: " + nome + '\n' + "Idade: " + idade);

        }

    }
}
