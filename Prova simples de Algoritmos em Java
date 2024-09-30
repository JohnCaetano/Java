import java.util.Scanner;

/*Faça um programa para definir a condição de pagamento de um produto adquirido em uma loja. Considere o preço normal da etiqueta e a escolha da condição de pagamento. Utilize os seguintes códigos para ler a condição de pagamento escolhida e efetuar o cálculo adequado.
*/

class Main {
  public static void main(String[] args) {
    
    double precM, codC, aux, aux2, aux3;

    String nomP;

    Scanner ent = new Scanner(System.in);

    System.out.println("Digite aqui o nome da mercadoria: ");
    nomP= ent.nextLine();
    
    System.out.println("Digite aqui o preço da mercadoria: ");
    precM = ent.nextDouble();

    System.out.println("Digite aqui o código para processamento de pagamento\nCódigo 1= A vista com 10% de desconto\nCódigo 2= A vista no cartão de crédito sem desconto\nCódigo 3= 3 Vezes no cartão no cartão de crédito com juros de\n5% sobre o valor da etiqueta");
    codC= ent.nextDouble();
    
    if(codC==1){
      aux = (precM*10)/100;
      aux2 = precM - aux;

      System.out.println("O produto " +nomP+ " sairá no valor de " +aux2+ " R$ se for pago a vista com os 10% de desconto.");
     }

     if(codC==2){
      aux2= precM;

    System.out.println("O produto " +nomP+ " sairá no valor de " +aux2+ " R$ se for pago a vista no cartão de crédito (não haverá desconto).");
     }
     if(codC==3){
      aux= (precM*5)/100;
      aux2= precM+aux;
      aux3= aux2/3;

    System.out.println("O produto " +nomP+ " sairá no valor de " +aux2+ " R$ se for divido \nno cartão em 3 parcelas de "+aux3+ " R$ (contando 5% de juros em \ncima do valor do produto). ");
    }
  }
}
