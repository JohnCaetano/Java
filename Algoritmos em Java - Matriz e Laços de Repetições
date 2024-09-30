import java.util.Random;

class Main {
  public static void main(String[] args) {

    int i, j, k, maior=0, menor=1000, diagonal, segLinha, terColun;
    int[][] matriz=new int[4][4];
    Random ale = new Random();


    for(i=0;i<matriz.length;i++){

      for(j=0;j<matriz.length;j++){
      
        matriz[i][j] = ale.nextInt(10);
      
        if(matriz[i][j]>maior)
         maior = matriz[i][j];

        if(matriz[i][j]<menor)
         menor = matriz[i][j];

        System.out.print(matriz[i][j] + " ");
      }

      System.out.println();  
    }

    System.out.println("\nO maior valor da matriz foi o "+maior);
    System.out.println("\nO menor valor da matriz foi o "+menor);

    diagonal = matriz[3][0] + matriz [2][1] + matriz [1][2] + matriz [0][3];

    segLinha = matriz[1][0] + matriz [1][1] + matriz[1][2] + matriz [1][3];

    terColun = matriz[0][3] + matriz[1][3] + matriz[2][3] + matriz[3][3];

    System.out.println("\n\nA soma da diagonal principal da matriz é de " +diagonal);

    System.out.println("\nA soma dos elementos da segunda linha da matriz é de " +segLinha);

    System.out.println("\nA soma dos elementos da terceira coluna da matriz é de " +terColun);    
  }
}
