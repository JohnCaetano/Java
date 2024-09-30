/*Problema 1

Numa eleição há dois candidatos e 50 eleitores. Cada voto deve ser lançado conforme a seguinte tabela:
1 – Candidato 1
2 – Candidato 2

3 – Voto nulo
4 – Voto em branco
Rejeitar os lançamentos diferentes do valores previstos na tabela acima. Calcular e exibir:
1 – O número de votos que cada candidato teve.
2 – O percentual de votos nulos e de votos em branco.
3 – Qual o candidato que venceu as eleições (ou se houve empate).*/

import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    int voto, votCand1=0, votCand2=0, votNul=0, votBran=0, i=0, aux1=0, aux2=0;
    double percVotNul=0, percVotBranc=0;

    Scanner ent = new Scanner(System.in);

    for(i=0;i<50;i++){
      System.out.println("Digite o número que deseja votar:\n1 = Candidato numero 1.\n2 = Candidato numero 2.\n3 = Anular Voto.\n4 = Voto em Branco.");
      voto = ent.nextInt();

      
      if(voto==1)
        votCand1++;
      
      if(voto==2)
        votCand2++;
      
      if(voto==4)
        votBran++;

      if(voto==3)
        votNul++;

      if(voto==0 && voto>4)
        i--;     
    }


    System.out.println("O candidato número 1 obteve um total de: "+votCand1+" Votos");
    
    System.out.println("O candidato número 2 obteve um total de: "+votCand2+" Votos");

    percVotBranc = (votBran*100)/i;

    percVotNul = (votNul*100)/i;

    System.out.println("O percentual de votos brancos foi de: "+percVotBranc);

    System.out.println("O percentual de votos nulos foi de: "+percVotNul);

    if(votCand1>votCand2){
      
      aux1 = votCand1 + votBran;
    
      System.out.println("Parabéns o candidato número 1 foi o vencedor com "+ aux1+" votos");
      }
    else{
       if(votCand2>votCand1){

         aux2 = votCand2 + votBran;

        System.out.println("Parabéns o candidato número 2 foi o vencedor com "+ aux2+" votos");
        }
      }


 }
}
