package Tratamento_Dados;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaMatrizes {
    public static void main(String[] args) {
        String str = "ABC";
        String nome = null;
        Scanner scanner = new Scanner(System.in);

        try {
            int a = scanner.nextInt();
            int x = 10/0;
            System.out.println("Tamanho da string nome: "+nome.length());
            System.out.println(str.charAt(5)); //codigo

        }catch (StringIndexOutOfBoundsException e){
            System.out.println("posicao invalida");//tratamento da excecao
        }catch (NullPointerException e){
            System.out.println("nao existe nome digitado");
        }catch (InputMismatchException e){
            System.out.println("o numero digitado deve ser inteiro: ");
        }catch (Exception e){
            System.out.println("nao existe divisao por 0");
        }finally {
            System.out.println("Executando finally");
        }
    }
}
