package TesteMT;

import java.util.Scanner;

public class Questão01 {
    public static void main(String[] args) {
        int[]vetor = new int[5];
        int op;
        int tam = 5;
        int cont = 0;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("");
            System.out.println("1 - Inserir");
            System.out.println("2 - Retirar");
            System.out.println("3 - Imprimir Vetor");
            System.out.println("0 - Sair");
            System.out.println("");
            System.out.println("Entre com uma opcao: ");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    if(cont < tam){
                        System.out.println("Qual numero deseja inserir");
                        int number = sc.nextInt();
                        for(int i = 4; i<tam ;i--){
                            if(vetor[i]==0){
                                vetor[i]=number;
                                break;
                            }
                        }
                        cont++;
                    }else{
                        System.out.println("Erro , Vetor Cheio");
                    }
                    break;
                case 2:
                    System.out.println("Qual posicao deseja remover");
                    int pos = sc.nextInt();
                    if(pos>=0 && pos <= vetor.length && vetor[pos]!= 0){
                        vetor[pos] = 0;
                        cont--;  
                    }else{
                        System.out.println("Erro , Posicao nao existe");
                    }
                    break;
                case 3:
                    for (int i = 0; i < vetor.length; i++) {
                        System.out.print(vetor[i] + " "); 
                    }
                    break;
            }
        } while (op != 0);
    }
}  