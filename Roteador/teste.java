import java.util.Scanner;
public class Teste {
    public static void main(String[] args){

        Roteador rt1 = new Roteador("Tp-link", "Anvox3" ,168192311);
        Roteador rt2 = new Roteador("Multilaser", "FullPower5" ,168192322);

        Scanner sc = new Scanner(System.in);


        System.out.println("Qual roteador deseja ligar? " + "\n" +
                "aperte 1 para escolher o Tp-link e 2 para escolher o Multilaser ....");
        int receber = sc.nextInt();

        if(receber == 1){
            rt1.ligar();
            rt2.desligar();
            System.out.println("Ligado o Roteador Tp-link!" +
                    "Roteador Multilaser desligado!");
        }
        else{
            rt1.desligar();
            rt2.ligar();
            System.out.println("ligado Roteador Multilaser!" +
                    "Roteador Tp-link Desligado!");
        }

        System.out.println("Tp-link: "+ rt1.getMarca());
        System.out.println("Tp-link: "+ rt1.getModelo());
        System.out.println("Tp-link: "+ rt1.getEnderecoIP());
        System.out.println("Tp-link: "+ rt1.isStatus());
        System.out.println("Multilaser: "+ rt2.getMarca());
        System.out.println("Multilaser: "+ rt2.getModelo());
        System.out.println("Multilaser: "+ rt2.getEnderecoIP());
        System.out.println("Multilaser: "+ rt2.isStatus());
    }
}
