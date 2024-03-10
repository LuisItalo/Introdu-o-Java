package EstruturasCondicoes;

public class For {
    public static void main(String[] args) {
//        for(inicio; condição de parada; forma de contar)
        for (int i=0;i<10;i++){ //i++ -> i+=1 -> i = 1+1
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i=9;i>0;i--){
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i=0;i<10;i+=2){
            System.out.print(i+" ");
        }
    }
}
