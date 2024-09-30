import java.util.Scanner;

/*Faça um programa que leia um número inteiro (1 - libra esterlina, 2 - dólar, 3 - euro, 4 - peso
argentino), leia um montante (valor na moeda escolhida), transforme e mostre o valor equivalente
em real, conforme informações abaixo:
*/

class Main {
  public static void main(String[] args) {

    Scanner ent = new Scanner(System.in);

    double valor1, aux;
    String nomeVal1;
    
    System.out.println("Digite aqui o nome da moeda desejada");
    nomeVal1 = ent.nextLine();

    System.out.println("Digite aqui a quantidade em dinheiro \npara que seja convertida em R$ (REAIS BRASILEIRO) :");
    valor1 = ent.nextDouble();

    if(nomeVal1.equals("libra esterlina")==true){
      
      aux= valor1*3.65;

      System.out.println("O montante digitado : " + valor1+ " equivale á : "+ aux+ " R$ (REAL BRASILEIRO)");
    }
    if(nomeVal1.equals("dólar")==true){
      
      aux= valor1*2.40;

      System.out.println("O montante digitado : " + valor1+ " equivale á : "+ aux+ " R$ (REAL BRASILEIRO)");
    }
     if(nomeVal1.equals("euro")==true){
      
      aux= valor1*3.13;

      System.out.println("O montante digitado : " + valor1+ " equivale á : "+ aux+ " R$ (REAL BRASILEIRO)");
    }
    if(nomeVal1.equals("peso")==true){
      
      aux= valor1*0.41;

      System.out.println("O montante digitado : " + valor1+ " equivale á : "+ aux+ " R$ (REAL BRASILEIRO)");
    }
  }
}
