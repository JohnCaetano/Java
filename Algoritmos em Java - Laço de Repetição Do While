/*
Supondo que a população de um país A seja 90.000.000 ( 90 milhões de habitantes) com uma taxa anual de crescimento de 3 % e que a população de um outro país B seja de 200.000.000 ( duzentos milhões de habitantes) com uma taxa anula de crescimento de 1,5%, fazer um programa que calcule e escreva o número de anos necessários para que a população do país A ultrapasse ou iguale a população de B, mantidas essas taxas de crescimento.
*/



class Main {
  public static void main(String[] args) {
    
    int i=0;
    double popA,popB, porcA, porcB;
    popA= 90000000;
    popB= 200000000;

    do{

      porcA = popA*3/100;
      popA= popA + porcA;

      porcB= popB*1.5/100;
      popB= popB + porcB;
      i++;

    }while(popA<=popB);

    System.out.println("O numero de anos que a população A nescessita para ultrapassar a população B é de : " +i+ " anos");

  }
}
