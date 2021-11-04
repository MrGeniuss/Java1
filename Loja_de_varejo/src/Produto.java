public class Produto {

    private String nome;
    private String marca;
    private Double preço;
    private Double quantidade;

    //Getters
    public String getNome() {
        return this.nome;
    }
    public String getMarca() {
        return this.marca;
    }
    public Double getPreço() {
        return this.preço;
    }
    public Double getQuantidade() {
        return this.quantidade;
    }
    //Setters
    public void setPreço(Double preço){
        this.preço = preço;
    }
    public void setQuantidade(Double quantidade){
        this.quantidade = quantidade;
    }
    
}
