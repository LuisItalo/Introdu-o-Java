package POO;

import POO.Pessoa;

/**
 * Pessoa -> tipo de objeto (classe)
 * p -> o objeto que representa a classe pessoa
 * new pessoa -> o espaço de memoria reservado para o objeto p
 */
public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        System.out.println("O seu nome é "+p.str);
        System.out.println("O ano de nascimento é "+p.anoNasc);

        p.falar();
        p.ano();
    }
}
