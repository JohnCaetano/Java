/*
Tem-se um conjunto de dados contendo a altura e sexo( fem/mas) de um conjunto de pessoas. Fazer um programa que calcule e escreva:

- a maior e a menor altura;

- a média das alturas das mulheres;

- o número de homens;

- a altura do homem mais baixo;

- total de pessoas.
*/

import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    double altura=0, medMulher=0, medHomem=0, altMaior=0, altMenor=0, medAlt=0, homB=0, aux1=0, auxA=0, aux2=0, auxB=5800, aux3=0;
    int numH=0, totP=0, numM=0;
    String sexo, prox;
    Scanner ent = new Scanner(System.in);

    System.out.println("Deseja Começar ? (sim ou não)");
    prox= ent.next();

    while(prox.equals("não")==false){

      System.out.println("Digite aqui o sexo da pessoa: "); 
      sexo= ent.next();

      System.out.println("Digite aqui a altura da pessoa: ");
      altura= ent.nextDouble();

      totP++;
      aux1= altura;  //calculando maior altura
      aux2= altura; //calculando menor altura

      if(aux1>auxA){
        auxA=aux1;
      }
      if(aux2<auxB){
        auxB=aux2;
      }

      
      if(sexo.equals("fem")==true){
        numM++;
        medMulher= altura+medMulher;
        }
      if(sexo.equals("masc")==true){
        numH++;
        medHomem= altura+medHomem;
        homB= altura;
        if(altura<homB){
          homB= altura;
         }
        }

    System.out.println("Deseja Começar ? (sim ou não)");
    prox= ent.next();
    }
    
    aux3= medMulher/numM;    
    
    System.out.println("A maior altura digitada foi de : " +auxA+ "\nA menor altura digitada foi de : " +auxB+"\nA média das altura das mulheres é de : " +aux3+ "\nO número de homens é de : " +numH+ "\nA altura do homem mais baixo é de : " +homB+ "\nO total de pessoas é : " +totP);
  }
}
