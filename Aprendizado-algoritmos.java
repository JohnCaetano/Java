import java.util.Scanner;


//Exercicio 1 Aula 4 dia 12/08
//Ler dois números inteiros e informar o maior deles.

class Main {
  public static void main(String[] args) {

    /*

    Scanner entrada = new Scanner(System.in);

    int num1, num2;

    System.out.println("Digite aqui o primeiro número");

    num1= entrada.nextInt();

    System.out.println("Digite aqui o segundo número");

    num2= entrada.nextInt();

    if(num1>num2){
      System.out.println("O número " +num1+ " é maior");
      }
    else{
      System.out.println("O número " +num2+ " é maior");
      }
  */

  //Exercicio 2
  //Ler um número inteiro qualquer e informar o seu valor absoluto (ou módulo).

  /*
  Scanner entrada = new Scanner(System.in);

  int num;

  System.out.println("Digite aqui o número inteiro");

  num= entrada.nextInt();


  if(num<0){
    num=-num;
      } 
  System.out.println("O valor absoluto é " +num);

  */

  //Exercício 3
  //Ler três números inteiros e informar qual é o maior.

  

  Scanner entrada = new Scanner(System.in);

  int num1, num2, num3;

  System.out.println("Digite aqui o primeiro número");

  num1 = entrada.nextInt();

  System.out.println("Digite aqui o segundo número");

  num2 = entrada.nextInt();

  System.out.println("Digite aqui o terceiro número");

  num3 = entrada.nextInt();

  if(num1>num2){
         
        if(num1>num3) 
           System.out.println("O número " +num1+ " é o maior");
               }
  
  if(num2>num1){
    if(num2>num3)

       System.out.println("O número " +num2+ " é o maior");
               }

  if(num3>num1){
    if(num3>num2)
       System.out.println("O número " +num3+ " é o maior");
               }
  
  }
}
