import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Random random = new Random();
        int computador = random.nextInt(3)+1;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escolha pedra, papel ou tesoura. Pedra = 1 Papel = 2 Tesoura = 3");
        int jogador = teclado.nextInt();

        if(computador == 1 && jogador == 2){
            System.out.println(" Jogador escolheu papel\n Computador escolheu pedra\n Jogador venceu!");
        }else if(computador == 2 && jogador == 1){
            System.out.println(" Jogador escolheu pedra\n Computador escolheu papel\n Computador venceu!");
        }else if(computador == 1 && jogador == 3){
            System.out.println(" Jogador escolheu tesoura\n Computador escolheu pedra\n Computador venceu!");
        }else if(computador == 3 && jogador == 1){
            System.out.println(" Jogador escolheu pedra\n Computador escolheu tesoura\n Jogador venceu!");
        }else if(computador == 2 && jogador == 3){
            System.out.println(" Jogador escolheu tesoura\n Computador escolheu papel\n Jogador venceu!");
        }else if(computador == 3 && jogador == 2){
            System.out.println(" Jogador escolheu papel\n Computador escolheu tesoura\n Computador venceu!");
        }else if(computador == 1 && jogador == 1){
            System.out.println(" Jogador escolheu pedra\n Computador escolheu pedra\n Empatou!");
        }else if(computador == 2 && jogador == 2){
            System.out.println(" Jogador escolheu papel\n Computador escolheu papel\n Empatou!");
        }else if(computador == 3 && jogador == 3){
            System.out.println(" Jogador escolheu tesoura\n Computador escolheu tesoura\n Empatou!");
        }

        teclado.close();
    }
}
