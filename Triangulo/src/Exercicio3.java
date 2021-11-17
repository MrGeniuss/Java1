import java.util.Scanner;

public class Exercicio3 {
    public void exercicio(){
        int contagem = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Telefonou para a vítima? S=Sim ou N=Não");
        String resposta1 = teclado.next();
        System.out.println("Esteve no local do crime? S=Sim ou N=Não");
        String resposta2 = teclado.next();
        System.out.println("Mora perto da vítima? S=Sim ou N=Não");
        String resposta3 = teclado.next();
        System.out.println("Devia para a vítima? S=Sim ou N=Não");
        String resposta4 = teclado.next();
        System.out.println("Já trabalhou com a vítima? S=Sim ou N=Não");
        String resposta5 = teclado.next(); 

        if(resposta1.equalsIgnoreCase("S")){
            contagem++;
        }
        if(resposta2.equalsIgnoreCase("S")){
            contagem++;
        }
        if(resposta3.equalsIgnoreCase("S")){
            contagem++;
        }
        if(resposta4.equalsIgnoreCase("S")){
            contagem++;
        }
        if(resposta5.equalsIgnoreCase("S")){
            contagem++;
        }
        if(contagem == 2){
            System.out.println("Suspeita");
        }else if(contagem == 3 || contagem == 4){
            System.out.println("Cúmplice");
        }else if(contagem == 5){
            System.out.println("Assassino");
        }else{
            System.out.println("Inocente");
        }

        teclado.close();
    }  
}
