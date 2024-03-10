package Polimorfismo;


public class Main_Func {
    public static void main(String[] args) {
        Funcionario f1 = new Gerente();
        Funcionario f2 = new Operario();

        Gerente g1 = new Gerente();
        Operario op1 = new Operario();
        polimorf(g1);
        polimorf(op1);

        polimorf(f1);
        polimorf(f2);


    }
    private static void polimorf(Funcionario f){
        f.pagarImposto();
    }
}
