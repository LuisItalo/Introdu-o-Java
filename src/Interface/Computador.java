package Interface;

public class Computador implements Maquina, Teste {
    @Override
    public void ligar() {
        System.out.println("Computador ligado");
    }

    @Override
    public void desligar() {
        System.out.println("Computador desligado");
    }

    @Override
    public void testar() {
        System.out.println("Computador sendo testado");
    }
}
