package EstruturasCondicoes;

public class Continue_Break {
    public static void main(String[] args) {
        System.out.print("continue no for: ");
        for (int i=0;i<=20;i++){
            if (i%2==0){
                continue; //pula para proxima posição baseado na condição (imprime os impares)
            }
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.print("break no for: ");
        for (int i=0;i<=20;i++){
            if (i==10){
                break;
            }
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.print("continue do while: ");
        int a=0;
        while (a<=20){
            a++;
            if (a%2==1){
                continue; //imprime os pares
            }
            System.out.print(a+" ");
        }
        System.out.println();
        System.out.print("Break no while: ");
        a=0;
        while (a<=20){
            a++;
            if (a==10){
                break;
            }
            System.out.print(a+" ");
        }
        System.out.println();
        System.out.print("Continue no doWhile: ");
        int b=0;
        do {
            b++;
            if (b%3==0){
                continue; //não imprime os divisiveis por 3
            }
            System.out.print(b+" ");
        }while (b<=20);
        System.out.println();
        System.out.print("break no doWhile: ");
        b=0;
        do {
            b++;
            if (b==10){
                break;
            }
            System.out.print(b+" ");
        }while (b<=20);
        System.out.println();


    }
}
