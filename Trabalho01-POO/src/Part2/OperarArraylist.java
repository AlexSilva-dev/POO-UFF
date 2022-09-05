/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Part2;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author alexaleq321
 */
public class OperarArraylist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tcld = new Scanner(System.in);
        int op = 1;
        ArrayList<Integer> objArray = new ArrayList<>();
        int ind = 4;
        for(int cont=0; cont<=ind; cont++){
            objArray.add(null);
        }

        while (op != 0) {
            System.out.println("\n\n\t\t\t______MENU______\n");
            System.out.println("0. Para sair");
            System.out.println("Digite a opção desejada:");
            System.out.println("1. Insirir");
            System.out.println("2. Remover");
            System.out.println("3. Imprimir vetor");
            op = Integer.parseInt(tcld.nextLine());

            switch (op) {
                case 1:
                    if (ind > 0) {
                        System.out.println("Digite um número para inserir no vetor: ");
                        Integer num = Integer.parseInt(tcld.nextLine());
                        objArray.set(ind, num);
                        ind--;
                    } else {
                        System.out.println("\n\t\t\tERRO! \n\t\tO ArrayList esta cheio");
                    }
                    break;

                case 2:
                    System.out.println("Digite o índice para remoção: ");
                    Integer indice = Integer.parseInt(tcld.nextLine());
                    objArray.remove(indice);
                    objArray.add(0, null);
                    break;

                case 3:
                    System.out.println("Elementos: ");
                    for(int cont = 0; cont<5; cont++){
                        System.out.print(objArray.get(cont) + " | ");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando... :(");

                    break;

                default:
                    System.out.println("Opção invalida! Digite apenas uma das opções.");

            }
        }
    }

}
