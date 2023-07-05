public class Consulta {
    
    private String data;
    private String hora;
    private Paciente paciente;
    private Médico medico;

    public String getData(){
        return this.data;
    }

    public void setData(String d){
        this.data = d;
    }

    public String getHora(){
        return this.hora;
    }

    public void setHora(String h){
        this.hora = h;
    }

    void consulta(){
        System.out.println("Consulta em agendamento");
    }

    void agendarConsulta(Paciente pac, Médico med, String data, String hora){

        this.paciente = pac;
        this.medico = med;
        this.data = data;
        this.hora = hora;

    }

    String mostrarAgendamento(){
        return "Paciente" + this.paciente.getNome() + " está com agendamento para o médico " + this.medico.getNome() + " no dia " + this.data + " às " + this.hora;
    }

}
