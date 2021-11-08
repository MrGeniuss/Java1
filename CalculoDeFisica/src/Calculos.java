import java.lang.Math;

public class Calculos {
    
    public float forcaPeso(float m, float g){
        return m * g;
    }
    public float forcaCentripeta(float m, float v, float r){
        return m * (float) Math.pow(v, 2) / r;
    }
    public float impulso(float m, float At){
        return m * At;
    }
    public float forcaElastica(float K, float x){
        return K * x;
    }
    public float velocidadeMedia(float As, float At){
        return As / At;
    }
    public float movimentoRetilíneoUniformementeVariado( float Vo, float a, float t){
        return Vo + a * t;
    }
}
