package Encapsulamento;

public class Cliente {

    public String nome;  //não restinge acesso a variaveis e/ou metodos
    protected float consumo; //esta disponivel ao pacote aque pertence

    private int anoNasc; //atributo ou metodo fica disponivel somente a classe a qual pertence
//GET / SET

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) //throws Exception {
                                        {
        if ((anoNasc < 1960) || (anoNasc > 2005)) {
            //throw new Exception("o ano de nascimento esta invalido");
            this.anoNasc=0;
        }
        this.anoNasc = anoNasc;
    }

    private String nome2;

    public String getNome2() {
        return nome2;
    }

    public void setNome2(String nome2) {
        this.nome2 = nome2;
    }
}
