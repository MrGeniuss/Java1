import java.util.Scanner;

public class Exercicio1 {
    public void exercicio(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro lado");
         int lado1 = teclado.nextInt();
        System.out.println("Digite o segundo lado");
         int lado2 = teclado.nextInt();
        System.out.println("Digite o terceiro lado");
         int lado3 = teclado.nextInt();

        if((lado1 + lado2) > lado3){
            if(lado3 == lado2 && lado3 == lado1 && lado1 == lado2){
                System.out.println("É um triangulo equilátero");
            }else if(lado3 == lado2 || lado3 == lado1 || lado1 == lado2){
                System.out.println("É um triangulo isósceles");
            }else if(lado3 != lado2 && lado3 != lado1 && lado1 != lado2){
                System.out.println("É um triangulo escaleno");
            }else{
                System.out.println("Erro");
            }
        }else{
            System.out.println("Não é um triangulo");
        }

        teclado.close();  
    }    
}
