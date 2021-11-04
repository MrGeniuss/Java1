public class Paciente {

    private String nomeCompleto;
    private String rg;
    private String cpf;
    private String telefoneParaContato;
    private Endereco endereco;

    //Getters 
    public String getNomeCompleto(){
        return this.nomeCompleto;
    }
    public String getRg(){
        return this.rg;
    }
    public String getCpf(){
        return this.cpf;
    }
    public String getTelefoneParaContato(){
        return this.telefoneParaContato;
    }
    public Endereco getEndereco(){
        return this.endereco;
    }
    //Setters
    public void setTelefoneParaComtato(String telefoneParaContato){
        this.telefoneParaContato = telefoneParaContato;
    }
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    
}
