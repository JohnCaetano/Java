import java.util.Scanner;

class Main {
  public static void main(String[] args) {
     
  // Escreva um programa para ler uma unidade de tempo em segundos (valor máximo que poderá ser recebido 86399) . Determinar o tempo em horas, minutos e segundos. Imprimir a hora no formato padrão e no formato americano.

  Scanner ent = new Scanner(System.in);

  int unid1, seg, min, hor, aux, aux2, aux3;

  System.out.println("Digite Aqui a quantidade de Segundos a serem Convertidas");
  unid1 = ent.nextInt();

  hor= unid1/3600;
  aux= unid1%3600;
  min= aux/60;
  aux2= aux%60;
  seg= aux2;

  System.out.println( +hor+ " horas : " +min+ " minutos : " +seg+ " segundos");


  if(hor>12){
     aux3= hor-12;
     System.out.println( +aux3+ " horas PM : " +min+ " minutos : " +seg+ " segundos");

   }
  else{
    System.out.println( +hor+  " horas AM : " +min+ " minutos : " +seg+ " segundos");
   }


  }
}
