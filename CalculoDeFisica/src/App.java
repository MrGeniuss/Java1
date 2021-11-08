public class App {
    public static void main(String[] args){
        Calculos calculos = new Calculos();

        float primeiroNumero = 10;
        float segundoNumero = 15;
        float terceiroNumero = 12;

        float P = calculos.forcaPeso(primeiroNumero, segundoNumero);
        float Fc = calculos.forcaCentripeta(primeiroNumero, segundoNumero, terceiroNumero);
        float I = calculos.impulso(primeiroNumero, segundoNumero);
        float F = calculos.forcaElastica(primeiroNumero, segundoNumero);
        float Vm = calculos.velocidadeMedia(primeiroNumero, segundoNumero);
        float V = calculos.movimentoRetilíneoUniformementeVariado(primeiroNumero, segundoNumero, terceiroNumero);

        System.out.println(P);
        System.out.println(Fc);
        System.out.println(I);
        System.out.println(F);
        System.out.println(Vm);
        System.out.println(V);

    }
}
