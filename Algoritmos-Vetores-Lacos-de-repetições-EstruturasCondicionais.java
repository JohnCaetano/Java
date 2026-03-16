/*Gerar e imprimir um vetor de 20 posições aleatoriamente utilizando a função random(). Ler um número x qualquer do teclado.  Determinar e Imprimir :

O menor e o maior valor do vetor inteiro de 20 posições.

A posição da primeira ocorrência de um elemento x no vetor de 20 posições.

Todas as posições de ocorrência de um elemento x no vetor de 20

posições.

O número de ocorrências de um elemento x em um vetor de 20 posições.*/

import java.util.Scanner;
import java.util.Random;

class Main {
  public static void main(String[] args) {
     int[] vet = new int [20];
     int menor, maior, i, x, j, k=0, totP=0;

     Scanner ent = new Scanner(System.in);
     Random ale = new Random();
     maior=0;
     menor=10000;

     System.out.print("Numeros gerados em cada vetor: ");
     for(i=0;i<vet.length;i++){

       vet[i]= ale.nextInt(20);

       if(vet[i]>maior)
        maior= vet[i];
       if(vet[i]<menor)
        menor=vet[i];

       System.out.print(" "+vet[i]);
     }

     System.out.println("\nO maior inteiro contido no vetor foi: "+maior);
     System.out.println("\nO menor inteiro contido no vetor foi: "+menor);

     System.out.println("\nDigite aqui um numero que apareça na lista de numeros do vetor acima para que se obtenha informações");
     x = ent.nextInt();

     i=0;

     for(i=0;i<vet.length;i++){

       if(vet[i]==x)
        totP++;
     }

     System.out.println("\nO total de vezes que o valor digitado aparece nos vetores é de: "+totP);

     i=0; 
     for(i=0;vet[i]!=x;i++){
       k++;
     }


     System.out.println("\nA posição da primeira ocorrência do valor digitado foi no vetor: "+k);


     System.out.println("\nO valor digitado aparece nas seguintes posições do vetor: "+k);

     k=0;
     i=0;

     for(i=0;i<vet.length;i++){

       k++;

       if(vet[i]==x){

         j=k-1;
         System.out.print(" "+j);

       }
     }
  }

}
