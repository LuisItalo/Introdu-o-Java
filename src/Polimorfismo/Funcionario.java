package Polimorfismo;

import Heranca.Gerente;

public class Funcionario extends Gerente { //final usado na classe restringe a mesma de herança
    public String nome;
    protected int idade;
    protected float salario;
    protected float bonus;

    public final int teste=20; //nao consegue mudar para outro valor da variavel (constante)

    protected float horaExtra(int h, int f){
        return (h*1.5f)+(f*2f);
    }

    public void saudacao() { //o metodo nao sera disponivel para realizar o override
        System.out.println("Ola");
    }

    public void pagarImposto() {
        System.out.println("o geretente paga 15%");
        System.out.println("o operario paga 9%");
    }
}
