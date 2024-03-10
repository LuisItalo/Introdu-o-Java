package Heranca;

public class Funcionario extends Gerente {
    public String nome;
    protected int idade;
    protected float salario;
    protected float bonus;

    protected float horaExtra(int h, int f){
        return (h*1.5f)+(f*2f);
    }
}
