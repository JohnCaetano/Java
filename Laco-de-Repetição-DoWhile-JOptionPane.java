import java.util.Scanner;
import javax.swing.JOptionPane;

class Main {
  public static void main(String[] args) {
      int sair, cont=1, prodVend, quantVend=0, prod1=0, prod2=0, prod3=0, prod4=0, totalVendedores=0, totalProd=0;
      double aux,salario, quantVend1=0, quantVend2=0, quantVend3=0, quantVend4=0, total=0;
      String nome, entrada;

      Scanner ent = new Scanner(System.in);

      do{    
          
        System.out.println("Digite qualquer número para começar");
        cont= ent.nextInt();

        nome= JOptionPane.showInputDialog("Digite aqui seu nome:");

        do{
            entrada= JOptionPane.showInputDialog("Digite o código do produto vendido:\n239,00 R$ = 1\n129,00 R$ = 2\n99,00 R$ = 3\n350,20 R$ = 4; ");
            prodVend = Integer.parseInt(entrada);

            entrada= JOptionPane.showInputDialog("Digite aqui a quantidade vendida desse produto:");
            quantVend= Integer.parseInt(entrada);

            quantVend1= 0;
            quantVend2= 0;
            quantVend3=0;
            quantVend4=0;


            if(prodVend==1)
              quantVend1= quantVend*239.00;
           
            if(prodVend==2)             
              quantVend2= quantVend*129.00;
            
            if(prodVend==3)
              quantVend3= quantVend*99.00;
                          
            if(prodVend==4)
              quantVend4= quantVend*350.20;
            

            totalProd= quantVend+totalProd;

            total = (quantVend1+quantVend2+quantVend3+quantVend4) + total;

            entrada= JOptionPane.showInputDialog("Deseja adicionar mais produtos vendidos? \nSim = 1\nNão = 2");
            sair = Integer.parseInt(entrada);

        }while(sair!=2);

        totalVendedores++;

        aux= (total*9)/100;
        salario= total+aux+200.00;

        JOptionPane.showMessageDialog(null, "O vendedor "+nome+" vendeu um total de: "+ totalProd+"Produtos, e obteve um salario total de: "+salario);

        entrada= JOptionPane.showInputDialog("\nDigite o número 0 para sair.\nDigite qualquer outro numero para continuar.");
        cont= Integer.parseInt(entrada);
        
      }while(cont!=0);

      JOptionPane.showMessageDialog(null, "Essa empresa tem um total de "+totalVendedores+" vendedores.");
  }
}
