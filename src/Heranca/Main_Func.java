package Heranca;

public class Main_Func {
    public static void main(String[] args) {
        Operario op = new Operario();
        op.nome = "luis";
        op.idade = 10;
        op.salario = 1423f;
        op.bonus = 30f;
        float h = op.horaExtra(10,10);
        System.out.println("o ganho mensal do funcionario "+op.nome+" é de "+(op.salario+op.bonus+h));
    }
}
