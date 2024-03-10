package Construtores;

public class MainConstrutor {
    public static void main(String[] args) {

        Construtor c2 =  new Construtor(15,1200f,"luis");
        System.out.println(c2.idade);
        System.out.println(c2.nome);
        System.out.println(c2.saldo);

        Construtor c = new Construtor();
        System.out.println(c.idade);
        System.out.println(c.nome);
        System.out.println(c.saldo);
    }
}
