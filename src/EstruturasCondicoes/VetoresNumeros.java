package EstruturasCondicoes;

public class VetoresNumeros {
    public static void main(String[] args) {
//        int x=10, z=20, y=30, w=40;
        int[] v = new int[4];
        v[0]= 10;
        v[1]= 20;
        v[2]= 30;
        v[3]= 40;
        for (int i=0;i< v.length;i++){
            System.out.println("o vetor na posiçao: "+i+" contem o valor: "+v[i]);
        }
        System.out.println("====================");
        Integer num[]={1,2,3,4,5,6,7,8,9};
        for (int i=0;i<num.length;i++){
            System.out.println("o vetor na posiçao: "+i+" contem o valor: "+num[i]);
        }
        System.out.println("====================");
        float decimais[] = {1f,2f,3f,4f,5f};
        float soma=0f;
        for (int i=0;i<decimais.length;i++){
//            soma = soma + decimais[i];
            soma+=decimais[i];
            System.out.println("a soma é: "+soma);
        }
    }
}
