package pratica;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ABBint abb = new ABBint();

        System.out.println("0 - SAIR");
        System.out.println("1 - Inserir um valor");
        System.out.println("2 - Remover um valor");
        System.out.println("3 - Buscar um valor");
        int opcao = 0;


        switch (opcao) {
            case 0:
                System.out.println("Logging Off....");
                break;
            case 1:
                System.out.println("Informa o valor que deseja inserir: ");
                int valor = entrada.nextInt();
                abb.root = abb.inserir(abb.root, valor);
                break;
            case 2:
                System.out.println("Informa o valor que deseja remover: ");
                valor = entrada.nextInt();
                abb.root = abb.remover(abb.root, valor);
                break;
            case 3:
                System.out.println("Informa o valor que deseja consultar: ");
                valor = entrada.nextInt();
                if(abb.consulta(abb.root, valor)){
                System.out.println("valor está na abb");
                }else {
                    System.out.println("valor n está na abb");
            }
                break;
        }



    }
}
