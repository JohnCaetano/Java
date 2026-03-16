/*Um certo aluno de Sistemas ao deitar-se para dormir perdeu o sono. Para ativar o sono iniciou uma contagem de carneirinhos.
Fazer um programa para ajudar o aluno a dormir ou resolver o problema de contagem de carneiros. O programa deverá ler um código (1 para carneiros vermelhos, 2 para brancos e 3 para pretos). Imprimir ao final o percentual de carneiros vermelhos e o total de carneiros.
*/
import javax.swing.JOptionPane;
class Main {
  public static void main(String[] args) {

    int carneiroVermelho=0, carneiroBranco=0, carneiroPreto=0, aux, i=0;
    double percCarnVerm;
    String entrada, prox;

    entrada= JOptionPane.showInputDialog("Deseja começar? (sim ou não) ");
    prox = entrada;

    while(prox.equals("sim")==true){

      entrada= JOptionPane.showInputDialog("Digite aqui o numero referente ao carneiro que deseja contar:\n1 = Carneiro Vermelho\n2 = Carneiro Branco\n3 = Carneiro Preto");
      aux = Integer.parseInt(entrada);

      i++;

      if(aux==1)
       carneiroVermelho++;

      if(aux==2)
       carneiroBranco++;

      if(aux==3)
       carneiroPreto++;

      if(aux==0 && aux>3)
       i--;

      entrada= JOptionPane.showInputDialog("Deseja continuar? (sim ou não) ");
      prox = entrada;
    }

    percCarnVerm = (carneiroVermelho*100)/i;

    JOptionPane.showMessageDialog(null, "O percentual de carneiros vermelhos contados foram de: "+ percCarnVerm);
    JOptionPane.showMessageDialog(null, "O numero total de carneiros contados foram de: "+i);
  }
}
