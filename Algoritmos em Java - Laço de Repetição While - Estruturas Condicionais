/*
Ler do teclado os dados de uma pesquisa a respeito de audiência de canais de televisão, sendo que cada entrevistado indicou o canal de TV que estava assistindo ao ser entrevistado, o seu sexo e a sua idade. Calcular a porcentagem de audiência de cada canal de televisão. Os canais pesquisados são: CH 2, CH 5, CH 7, e CH 9. Deve ser calculado também a porcentagem sobre outros canais. Determinar ainda quais são as quantidades e as porcentagens de mulheres e de homens por cada preferência. Determinar também qual é a quantidade e a porcentagem de crianças na idade de 5 a 8 anos por cada preferência. Finalmente, informar que canal tem maior audiência de crianças.
*/

import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    double pcM,pcH,pcC,pcC2,pcC5,pcC7,pcC9; //pcM= Porcentagem de Mulheres, pcH= Porcentagem de Homens, pcC= Porcentagem de crianças, pcC2,5,7,9= Porcentagem de audiencia de cada canal.
    int idade,totalPes,cCH2=0,cCH5=0,cCH7=0,cCH9=0,naCH2=0,naCH5=0,naCH7=0,naCH9=0,totalA,quantM=0,quantH=0,quantC=0; //totalPes= total de pessoas que votaram, cCH2,5,7,9= numero de crianças que votaram nos determinados canais, naCH2,5,7,9= numero de audiencia canais, totalA= Total de audiencia de todos canais, quantM= Quantidade Mulheres, quantH= Quantidade Homens, quantC= Quantidade Crianças.
    String sexo,continuar,canal;

    Scanner ent = new Scanner(System.in);

    System.out.println("Deseja começar (sim ou não)?");
    continuar= ent.next();

    while(continuar.equals("não")==false){
      
      System.out.println("Digite aqui sua idade");
      idade= ent.nextInt();

      System.out.println("Digite aqui seu sexo");
      sexo= ent.next();

      System.out.println("Escreva o canal que deseja votar (CH2/CH5/CH7/CH9");
      canal= ent.next();

      //Calculando o numero de mulheres e homens.

      if(sexo.equals("masculino")==true){
        quantH++;
      }
      else{
        quantM++;
      }

      //Calculando o numero de crianças

      if(idade>=5&&idade<=8){
        quantC++;
      }

      //Somando o total de audiencia de cada canal.

      if(canal.equals("CH2")==true){
      
        naCH2++;

        if(idade>=5&&idade<=8){
        cCH2++;
         }
      }
      if(canal.equals("CH5")==true){
        
        naCH5++;

        if(idade>=5&&idade<=8){
        cCH5++;
         }  
      }
      if(canal.equals("CH7")==true){
      
        naCH7++;

        if(idade>=5&&idade<=8){
        cCH7++;
        }
      }
      if(canal.equals("CH9")==true){ 

        naCH9++;
        
        if(idade>=5&&idade<=8){
        cCH9++;
        }
      }

      System.out.println("Deseja continuar (sim ou não)?");
      continuar= ent.next();
    }

    totalPes= quantH+quantM+quantC;
    
    totalA= naCH2+naCH5+naCH7+naCH9;

    //Calculando porcentagem de audiencia CH2.
    
    pcC2 = (naCH2*100)/totalA;

    //Calculando porcentagem de audiencia CH5.

    pcC5 = (naCH5*100)/totalA;
    
    //Calculando porcentagem de audiencia CH7.

    pcC7 = (naCH7*100)/totalA;

    //Calculando porcentagem de audiencia CH9.

    pcC9 = (naCH9*100)/totalA;

    //Calculando porcentagem de homens, mulheres e crianças.

    pcM= (quantM*100)/totalPes;

    pcH= (quantH*100)/totalPes;

    pcC= (quantC*100)/totalPes;

    //Exibindo ao usuario a porcentagem de audiencia obtida por cada canal.

    System.out.println("A porcentagem de audiência do canal 2 foi de: "+pcC2+"%");
    System.out.println("A porcentagem de audiência do canal 5 foi de: "+pcC5+"%");
    System.out.println("A porcentagem de audiência do canal 7 foi de: "+pcC7+"%");
    System.out.println("A porcentagem de audiência do canal 9 foi de: "+pcC9+"%");

    //Exibindo ao usuario a quantidade e a porcentagem de homens, mulheres e crianças que participaram da enquete.

    System.out.println("A quantidade de mulheres que participaram da enqute foi de: "+quantM+" E em porcentagem no valor de: "+pcM+"%"); 
    System.out.println("A quantidade de homens que participaram da enqute foi de: "+quantH+" E em porcentagem no valor de: "+pcH+"%");
    System.out.println("A quantidade de crianças de 5 a 8 anos que participaram da enqute foi de: "+quantC+" E em porcentagem no valor de: "+pcC+"%");


  }
}
