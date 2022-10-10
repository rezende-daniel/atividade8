//Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês

import java.util.Scanner;

public class atv8 {
    public static void main (String args[]){
        Scanner entrada = new Scanner(System.in);

    //Variaveis

    double ganhoPorHora;
    double horasTrab;
    double salario;

    // Entrada de dados

    System.out.println("Insira o ganho por hora ");
    ganhoPorHora= entrada.nextDouble();
    System.out.println("Insira as horas trabalahdas por mês ");
    horasTrab= entrada.nextDouble();
    entrada.close();
    //Processamento de dados

    salario=horasTrab*ganhoPorHora;

    //saida de dados

    System.out.println("O salario mensal é de "+salario+"");

}   

}