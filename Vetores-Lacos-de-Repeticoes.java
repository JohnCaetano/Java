/*Elaborar um programa para:

Ler um vetor v1 de 10 elementos;

Imprimir todos os elementos de v1;

Imprimir a soma do primeiro com o quarto elemento de v1;

Gerar um segundo vetor  v2 e receber os dados de v1 invertidos;

Imprimir v2.*/

import java.util.Random;

class Main {
  public static void main(String[] args) {
    
    int[] v1 = new int [10];
    int[] v2 = new int [10];
    int i, soma, invers, aux;
    
    Random ale = new Random();

    System.out.println("Elemento do Vetor 1");

    for(i=0;i<v1.length;i++){
         v1[i] = ale.nextInt(10);
        System.out.print(+v1[i] +" ");
    }

    soma = v1[0] + v1[3];

    System.out.println("\n\n\nO resultado da soma dos elementos 1 e 4 do vetor 1 é de: "+soma);

    v2 = v1;

    System.out.println("\n\n\n Os elementos do vetor 1 inversos são");
   
    
    for(i=0;i< v2.length;i++){

      v2[i]= v1[9-i];    

      System.out.print(v2[i]+" ");
    }
  }
}
