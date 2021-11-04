import java.time.LocalDate;

public class Cliente {

    private String nome;
    private LocalDate dataDeNascimento; 
    private String email;
    private int numero;

    // Getters
    public String getNome() {
        return this.nome;
    }
    public LocalDate getDataDeNascimento() {
        return this.dataDeNascimento;
    }
    public String getEmail() {
        return this.email;
    }
    public int getNumero() {
        return this.numero;
    }
    // Setters
    public void setTelefone(int numero){
        this.numero = numero;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setNumero(int i) {
    }
    
}
