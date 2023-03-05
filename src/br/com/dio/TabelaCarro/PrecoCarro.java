package br.com.dio.TabelaCarro;

import java.util.Scanner;

public class PrecoCarro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduz o custo de fábrica: ");
        int custoFabrica = scanner.nextInt();

        System.out.println("Introduz a porcentagem do distribuidor: ");
        int porcentagemDistribuidor = scanner.nextInt();

        System.out.println("Introduz o percentual de impostos: ");
        int PercentualImpostos = scanner.nextInt();

        int custoConsumidor;

        int Distribuidor;
        int ValorImpostos;

        // TODO: Implemente uma condição que calcule a porcentagem do distribuidor e dos impostos:

        Distribuidor = (custoFabrica * porcentagemDistribuidor) / 100;
        ValorImpostos = (custoFabrica * PercentualImpostos) / 100;
        custoConsumidor = custoFabrica + Distribuidor + ValorImpostos;

        System.out.println(custoConsumidor);
    }
}
