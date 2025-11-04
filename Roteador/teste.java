import java.util.Scanner;//Declarar o scanner
public class Teste {
    public static void main(String[] args){

        //Instanciamento do roteador
        Roteador rt1 = new Roteador("Tp-link", "Anvox3" ,168192361);
        Roteador rt2 = new Roteador("Tp-shock", "Anvox4" ,168192362);

        //Instanciamento do scanner
        Scanner sc = new Scanner(System.in);

        //Ligar o roteador informado, garantindo que o outro esteja desliagdo.

        System.out.println("Qual roteador deseja ligar? " + "\n" +
                "aperte 1 para escolher o 1 e 2 para escolher o 2 ....");
        int receber = sc.nextInt();

        if(receber == 1){
            rt1.ligar();
            rt2.desligar();
            System.out.println("Ligado o Roteador 1!" +
                    "Roteador 2 desligado!");
        }
        else{
            rt1.desligar();
            rt2.ligar();
            System.out.println("ligado Roteador 2!" +
                    "Roteador 1 Desligado!");
        }

        //Retorna o Endereço Ip e Status
        System.out.println("Roteador1: "+ rt1.getEnderecoIP());
        System.out.println("Roteador1: "+ rt1.isStatus());
        System.out.println("Roteador2: "+ rt2.getEnderecoIP());
        System.out.println("Roteador2: "+ rt2.isStatus());
    }
}
