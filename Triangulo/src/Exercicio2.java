import java.util.Scanner;

public class Exercicio2 {
    public void exercicio(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o ano");
         int ano = teclado.nextInt();

        if((ano % 4 == 0 && ano % 100 != 0) || (ano % 4 == 0 && ano % 100 == 0 && ano % 400 == 0)){
            System.out.println("É um ano bissexto");
        }else{
            System.out.println("Não é um ano bissexto");
        }

        teclado.close();
    }
}
