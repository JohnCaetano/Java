/*Tem-se um conjunto de dados contendo a nota e freqüência, número de aulas freqüentadas, (total de 60 aulas) de uma turma de 50 alunos. Fazer um programa que calcule e escreva para cada aluno seu conceito e condição final (aprovado ou reprovado). Imprimir a média das notas dos alunos. Para ser aprovado o aluno deverá ter nota maior ou igual a 60 e frequência em 75% das aulas.*/

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int i;
    double nota, aux=0, aux2, numA, medN=0;
    String nome, começar, prox;

    Scanner ent = new Scanner(System.in);

    System.out.println("Deseja Começar?(Sim ou Não)");
    prox= ent.next();

    for(i=0;i<50;i++){
      
      while(prox.equals("Não")==false){      
         System.out.println("Digite aqui seu nome: ");
         nome= ent.next();

         System.out.println("Deseja digitar notas?(Sim ou Não");
         começar= ent.next();

         while(começar.equals("Não")==false){

           medN++;

           System.out.println("Digite aqui sua nota: ");
           nota= ent.nextDouble();
           aux= nota+aux;  
      
           System.out.println("Deseja digitar notas?(Sim ou Não");
           começar= ent.next();
           }
      
         System.out.println("Digite aqui o numero de aulas frequentadas: ");
         numA= ent.nextDouble();
         aux2= (numA*100)/60; 

         medN= aux/medN;

         System.out.println(nome+" a média das suas notas foram de : "+medN);
         System.out.println("Sua frequência foi de : "+ aux2+ "%");
       
         if(medN>=60 && aux2>=75){
            System.out.println("Parabéns você foi Aprovado!");
           }
         else{
            System.out.println("Você foi Reprovado! :( ");
           } 

            System.out.println("Deseja Continuar?(Sim ou Não)");
            prox= ent.next();
       }
    }
  }
}
