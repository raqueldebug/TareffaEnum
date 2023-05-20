import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner en = new Scanner(System.in);

        for(Bebida bebida : Bebida.values()){
            System.out.println(bebida.name()+" Valor: "+ bebida.getValor());
        }


        System.out.println("Escreva a opção desejada: ");


       Bebida escolhaB = Bebida.valueOf(en.nextLine().toUpperCase());

        for(Comida comida : Comida.values()){
            System.out.println(comida.name()+ " Valor: "+comida.getValor());
        }


        System.out.println("Escreva a opção desejada: ");


        Comida escolhaC = Comida.valueOf(en.nextLine().toUpperCase());

    int precofinal = escolhaB.getValor() + escolhaC.getValor();

        System.out.println("Preço final: "+ precofinal);


    }
}