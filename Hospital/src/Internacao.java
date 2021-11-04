import java.time.LocalDate;

public class Internacao {

    private Medico medicoResponsavel;
    private Paciente paciente;
    private LocalDate dataDeInternacao;
    private LocalDate dataDaAlta;
    private String observacoes;
    
    //Getters
    public Medico getMedicoResponsavel(){
        return this.medicoResponsavel;
    }
    public Paciente getPaciente(){
        return this.paciente;
    }
    public LocalDate getDataDeInternacao(){
        return this.dataDeInternacao;
    }
    public LocalDate getDataDaAlta(){
        return this.dataDaAlta;
    }
    public String getObservacoes(){
        return this.observacoes;
    }
    //Setters
    public void setMedicoResponsavel(Medico medicoResponsavel){
        this.medicoResponsavel = medicoResponsavel;
    }
    public void setPaciente(Paciente paciente){
        this.paciente = paciente;
    }
    public void setObservacoes(String observacoes){
        this.observacoes = observacoes;
    }
    
}
