import java.util.Scanner;

public class Exercicio4 {
    public void exercicio(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual o tipo de combustível? \n A - álcool / G - gasolina");
        String combus = teclado.nextLine();
        System.out.println("Qual a quantia?");
        int litro = teclado.nextInt();

        if(combus == "A" && litro < 20){
           System.out.println("Total a pagar: " + (litro * 3.30) / 0.03 );
        }else  if(combus == "A" && litro > 20){
           System.out.println("Total a pagar: " + (litro * 3.50)  / 0.05);
        }else  if(combus == "G" && litro < 20){ 
           System.out.println("Total a pagar: " + (litro * 3.50) / 0.04);
        }else{
           System.out.println("Total a pagar: " + (litro * 3.50) / 0.06);
}
teclado.close();
}   
}