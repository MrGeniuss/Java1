import java.time.LocalDate;

public class App{
    public static void main(String[] args) {

        Vendedor jose = new Vendedor();

        jose.nome = "José vasconselo";
        jose.email = "zé.vasconselo@gmail.com";
        jose.dataDeNascimento = LocalDate.of(2000, 9, 11);
        jose.salario = 1500.00f;

        Cliente david = new Cliente();

        //david.nome = "David Andersen";
        david.setEmail("davi.andersen@gmail.com");
        //david.dataDeNascimento = LocalDate.of(1999, 7, 2);
        david.setNumero (999888777); 

        Fornecedor jacadilo = new Fornecedor();

        jacadilo.nome = "Jacadilo";
        jacadilo.email = "jaca.dilo@gmail.com";
        jacadilo.endereço = "São Leopoldo, Rio Branco";
        jacadilo.numero = 111222333;

        Produto cabelo_Especial = new Produto();

        //cabelo_Especial.nome = "Cabelo Especial";
        //cabelo_Especial.marca = "Capivara Atômica";
        cabelo_Especial.setQuantidade (400.000);
        cabelo_Especial.setPreço (3000.00);

        Venda venda1 = new Venda();

        venda1.Comprador = "David";
        venda1.Data = LocalDate.of(2009, 3, 16);
        venda1.Hora = "14:00";

        Transportadora transportadoraC = new Transportadora();

        transportadoraC.nome = "Transportadora Caiou";
        transportadoraC.endereço = "Porto Alegre, Mariomario";
        transportadoraC.email = "caiou.transportadora@gmail.com";
        transportadoraC.numero = 565656565;

        System.out.println(cabelo_Especial.getQuantidade());

    } 
}
