package EstruturasCondicoes;

public class DoWhile {
    public static void main(String[] args) {
        int a=0;
        do {
            System.out.print(a+" ");
            a++;
        }while (a<10);
        System.out.println();

        int b=0;
        do {
            System.out.print(b + " ");
            b += 2;
        }while (b<10);
        System.out.println();

        int c=9;
        do {
            System.out.print(c + " ");
            c--;
        }while (c>=0);
        System.out.println();

        int d=9;
        do {
            System.out.print(d + " ");
            d-=2;
        }while (d>=0);

        for (int k=0;k==8;k++){
            System.out.println("imprimindo for");
        }
        int e=0;
        while (e==8){
            System.out.println("imprimindo while");
        }
        System.out.println();

        int f=0;
        do {
            System.out.println("imprimindo doWhile");
        }while (f==8);
    }
}
