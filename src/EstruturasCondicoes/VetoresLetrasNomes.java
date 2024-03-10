package EstruturasCondicoes;

public class VetoresLetrasNomes {
    public static void main(String[] args) {
        char let[]={'a','b','c','d','e'};
        Character let2[]={'A','B','C','D','E'};
        for (int i=0;i<5;i++){
            System.out.println("Vetor de letras min: "+let[i]+" | Vetor de letras maius: "+let2[i]);
        }
        System.out.println("=====================");
        char[] alfabeto = new char[26];
        char l = 'a';
        for (int i=0;i<alfabeto.length;i++){
            alfabeto[i] = l;
            l++;
        }
        for (int i=0;i<alfabeto.length;i++){
            System.out.print(alfabeto[i]+" ");
        }
        System.out.println();
        System.out.println("=================");

        String nomes[]={"luis", "italo", "moreira", "souza"};
        for (int i=0;i<nomes.length;i++){
            System.out.print(nomes[i]+" ");
        }
    }
}
