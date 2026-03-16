import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    //Ler as quatro notas de um aluno. Calcular a média aritmética das notas e verificar se ele foi  ou não aprovado (media maior ou igual a 60). Informar a média e a situação do aluno (aprovado ou reprovado).

     Scanner ent = new Scanner(System.in);

    double nota1, nota2, nota3, nota4, medArit;

    System.out.println("Digite aqui a primeira nota: ");
    nota1 = ent.nextDouble();
    System.out.println("Digite aqui a segunda nota: ");
    nota2 = ent.nextDouble();
    System.out.println("Digite aqui a terceira nota: ");
    nota3 = ent.nextDouble();
    System.out.println("Digite aqui a quarta nota: ");
    nota4 = ent.nextDouble();

    medArit= (nota1+nota2+nota3+nota4)/4;

    if(medArit<60){
      System.out.println("Sua média foi de " +medArit+ "\nVocê foi Reprovado!");
       }
    else{
      System.out.println("Sua média foi de " +medArit+ "\nVocê foi Aprovado!");
       }
  }
}
