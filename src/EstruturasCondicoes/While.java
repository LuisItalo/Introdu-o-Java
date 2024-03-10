package EstruturasCondicoes;

public class While {
    public static void main(String[] args) {
        int i=0;

        while (i<10){
            System.out.print(i+" ");
            i++;
        }
        System.out.println();
        i=0;
        while (i<10){
            System.out.print(i+" ");
            i+=2;
        }
        System.out.println();
//        i=10;
        i--;
        while (i>=0){
            System.out.print(i+" ");
            i--;
        }
    }
}
