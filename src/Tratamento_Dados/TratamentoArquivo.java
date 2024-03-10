package Tratamento_Dados;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TratamentoArquivo {
    public static void main(String[] args) {
        String caminhoArquivo = "C:\\IdeaProjects\\IntroJava\\src\\Tratamento_Dados\\teste.txt";
        try {
            FileReader arqRider = new FileReader(caminhoArquivo); //Descata o caminho a ser lido
            BufferedReader leitor = new BufferedReader(arqRider); // Realiza a leitura do arquivo

            String linha;
            while ((linha = leitor.readLine())!=null){
                System.out.println(linha);
            }
            leitor.close();
        }catch (IOException e){
            System.err.println("Erro na leitura do arquivo");
        }
    }
}
