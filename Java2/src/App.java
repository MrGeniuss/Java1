import java.time.LocalDate;
import java.time.Month;

public class App{
     public static void main(String[] args) {
        //Tipo nome = new Tipo();
        Aluno Paulo = new Aluno();
        Aluno Joana = new Aluno();

        // Modificar as informações
        Paulo.nome = "Paulo Gilberto";
        Paulo.email = "paulo.gilberto@gmail.com";
        Paulo.matricula = 112L;
        Paulo.dataDeNascimento = LocalDate.of(1987, 12, 14);

        Joana.nome = "Joana Carvalho";
        Joana.email = "joana.carvalho@gmail.com";
        Joana.matricula = 456L;
        Joana.dataDeNascimento = LocalDate.of(1999, Month.APRIL, 12);

        // Imprimir os nomes
        System.out.println(Paulo.nome);
        System.out.println(Joana.nome);
    }
}