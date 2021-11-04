public class App {
    public static void main(String[] args){
        Calculadora calculadora = new Calculadora();

        float quantidade = 10;
        float valorUnitario = 15;

        //float resultado = calculadora.somar(primeiroNumero, segundoNumero);
        //float resultado = calculadora.subtrair(primeiroNumero, segundoNumero);
        //float resultado = calculadora.multiplicar(primeiroNumero, segundoNumero);
        float resultado = calculadora.totalCompra(quantidade, valorUnitario);

        System.out.println(resultado);
    }
}
