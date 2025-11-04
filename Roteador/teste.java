package mEuP1;
import java.util.Scanner;//declaração do scanner
public class teste {
    public static void main(String[] args){

        //instanciando o objeto
        Roteador rt1 = new Roteador("Tp-link", "Anvox3" ,168192367,"tim");
        Roteador rt2 = new Roteador("Tp-shock", "Anvox4" ,168192368,"claro");

        //instaciar o scanner
        Scanner sc = new Scanner(System.in);

    //escolha de qual roteador vai ligar de acordo com o que escolher

        System.out.println("Qual roteador deseja ligar? " + "\n" +
                "aperte 1 para selecionar o 1 e 2 para selecionar o 2 ....");
        int receber = sc.nextInt();

        if(receber == 1){
            rt1.ligar();
            rt2.desligar();
            System.out.println("O roteador 1 foi ligado com sucesso!!!!!!!!!!");
        }
        else{
          rt1.desligar();
          rt2.ligar();
            System.out.println("O roteador 2 foi ligado com sucesso!!!!!!!!!!!!!!!!!!");
        }

        //retorno das informações
        System.out.println(rt1.toString());
        System.out.println(rt2.toString());

    }
}
