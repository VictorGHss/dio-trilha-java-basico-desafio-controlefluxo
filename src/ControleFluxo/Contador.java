package ControleFluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = sc.nextInt();

        try{
            contar (num1, num2);
        } catch (ParametrosInvalidosException e){
            System.out.println("O segundo número deve ser maior que o primeiro inserido no sistema!");
        }
    }

    static void contar (int num1, int num2) throws ParametrosInvalidosException{

        if (num1 >= num2){
            throw new ParametrosInvalidosException();
        }

        int contagem = num2 - num1;

        for(int i = 1; i <= contagem; i++){
            System.out.println("Imprimindo o número " + i);
        }

    }
}
