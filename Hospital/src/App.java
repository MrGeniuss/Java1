public class App {
    public static void main(String[] args) {
        
        Endereco endereco1 = new Endereco();

        endereco1.setRua ("Mario Mario");
        endereco1.setNumero (92);
        endereco1.setBairro ("Mama mya");
        endereco1.setCidade ("Macaroni Pizza");
        endereco1.setEstado ("Mushroom Kingdoom");
        endereco1.setCep ("9998887-776");

        Medico medico = new Medico();
        
        //medico.crm = "32420-RS";
        //medico.nomeCompleto = "José Almeida";
        medico.setEndereco (endereco1);
        medico.setTelefoneParaComtato("111222333");

        Paciente paciente = new Paciente();

        //paciente.nomeCompleto = "Benjamin Arrola";
        //paciente.rg = "6665554443";
        //paciente.cpf = "777222444";
        paciente.setTelefoneParaComtato("727272727");
        paciente.setEndereco(endereco1);

        Internacao internacao = new Internacao();

        internacao.setMedicoResponsavel(medico);
        internacao.setPaciente(paciente);
        //internacao.dataDeInternacao = "14/07/2000";
        //internacao.dataDeAlta = "17/12/2000";
        internacao.setObservacoes("Paciente está vivo");
    
    }
}
