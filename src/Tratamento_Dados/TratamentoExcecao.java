package Tratamento_Dados;

import java.util.Scanner;

public class TratamentoExcecao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero de linhas: ");
        int l = scanner.nextInt();
        System.out.print("Digite um numero de colunas: ");
        int c = scanner.nextInt();

        int [][] matriz = new int[l][c];
        System.out.println("Digite os elementos da matriz: ");
        for (int i=0;i<l;i++){
            for (int j=0;j<c;j++){
                matriz[i][j] = scanner.nextInt();
            }
        }
        System.out.println("matriz lida, agora vamos imprimi-la: ");
        for (int i=0;i<l;i++){
            for (int j=0;j<c;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
