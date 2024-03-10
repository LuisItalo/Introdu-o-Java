package Encapsulamento;

public class Base {
    public static void main(String[] args) {

        Cliente c = new Cliente();
        c.nome = "italo";
        System.out.println("O nome é "+c.nome);

        c.consumo = 1090;
        System.out.println("o consumo "+c.consumo);

        c.setAnoNasc(1991);
        System.out.println("o ano de nascimento e "+c.getAnoNasc());

        Cliente c2 = new Cliente();
        c2.setNome2("luis");
        System.out.println("pessoa 1 "+c.nome);
        System.out.println("pessoa 2 "+c2.getNome2());
//        try {
//
//            c.setAnoNasc(191);
//            System.out.println("o ano de nascimento e "+c.getAnoNasc());
//        }catch (Exception e){
//            System.err.println(e.getMessage());
//        }

    }
}
